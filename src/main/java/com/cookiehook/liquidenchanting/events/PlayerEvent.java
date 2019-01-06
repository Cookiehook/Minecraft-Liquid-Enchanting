package com.cookiehook.liquidenchanting.events;

import com.cookiehook.liquidenchanting.util.Config;
import com.cookiehook.liquidenchanting.util.RomanNumber;
import com.google.common.collect.Lists;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.*;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PlayerEvent {

    @SubscribeEvent
    public void playerTick(TickEvent.PlayerTickEvent event) {
        EntityLivingBase player = event.player;
        Iterator<ItemStack> armor = player.getArmorInventoryList().iterator();
        List<ItemStack> armorStack = Lists.newArrayList(armor);

        for (ItemStack itemstack : armorStack) {  //Loops through each armor slot
            List<PotionEffect> potionEffects = getPotionTypeFromNBT(itemstack.getTagCompound());

            for (PotionEffect potionEffect : potionEffects) {
                //Instant potion effects given every tick would render players immortal or instantly dead.
                //Disabling them here for that reason.
                if (!potionEffect.getPotion().isInstant() || Config.instantEffectEnabled) {
                    addPotionEffect(player, potionEffect.getPotion(), potionEffect.getAmplifier());
                }
            }
        }
    }

    @SubscribeEvent
    public void AttackEntityEvent(AttackEntityEvent event) {
        Entity target = event.getTarget();
        EntityPlayer player = event.getEntityPlayer();
        ItemStack weapon = player.getHeldItemMainhand();
        Item item = weapon.getItem();

        if (item instanceof ItemSword || item instanceof ItemTool || item instanceof ItemHoe) {
            List<PotionEffect> potionEffects = getPotionTypeFromNBT(weapon.getTagCompound());

            if (target instanceof EntityLivingBase) {
                for (PotionEffect potionEffect : potionEffects) {
                    Potion potion = potionEffect.getPotion();
                    int duration = potion.isInstant() ? 1 : Config.weaponEffectTime;
                    ((EntityLivingBase) target).addPotionEffect(new PotionEffect(potion, duration, potionEffect.getAmplifier(), false, true));
                }
            }
        }
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void toolTipEvent(ItemTooltipEvent event) {
        ItemStack itemStack = event.getItemStack();
        Item item = itemStack.getItem();
        List<String> toolTip = event.getToolTip();

        // Let's not accidentally muck around with every item in the game OK?
        if (item instanceof ItemArmor || item instanceof ItemSword || item instanceof ItemTool || item instanceof ItemHoe) {
            List<PotionEffect> potionEffects = getPotionTypeFromNBT(itemStack.getTagCompound());

            for (PotionEffect potionEffect : potionEffects) {
                if (!(item instanceof ItemArmor && potionEffect.getPotion().isInstant()) || Config.instantEffectEnabled) {
                    String level = "";
                    TextFormatting textFormat = potionEffect.getPotion().isBadEffect() ? TextFormatting.RED : TextFormatting.BLUE;
                    String potionName = potionEffect.getPotion().getName();
                    if (potionEffect.getAmplifier() > 0) {
                        level = RomanNumber.toRoman(potionEffect.getAmplifier() + 1);
                    }
                    toolTip.add(1, textFormat + I18n.format(potionName) + " " + level);
                }
            }
        }
    }

    /**
     * Returns a list of PotionEffects by interrogating the input NBT tag and PotionType registry.
     *
     * @param nbtTagCompound
     * @return
     */
    private List<PotionEffect> getPotionTypeFromNBT(NBTTagCompound nbtTagCompound) {
        List<PotionEffect> potionEffects = new ArrayList<PotionEffect>();

        if (nbtTagCompound != null) {
            String potionName = nbtTagCompound.getString("Potion");
            if (!potionName.equals("") && PotionType.getPotionTypeForName(potionName) != null) {
                potionEffects.addAll(PotionType.getPotionTypeForName(potionName).getEffects());
            }

            if (Config.combinedCraftingEnabled) {
                NBTTagList customPotionList = nbtTagCompound.getTagList("CustomPotionEffects", 10);
                for (NBTBase tag : customPotionList) {
                    potionEffects.add(PotionEffect.readCustomPotionEffectFromNBT((NBTTagCompound) tag));
                }
            }
        }

        //Removes any effects which were configured as "disabled" from the list to be returned.
        //Temporarily add items to remove to a separate collection to avoid ConcurrentModificationExceptions.
        List<PotionEffect> effectsToRemove = new ArrayList<PotionEffect>();
        for (PotionEffect effect : potionEffects) {
            String effectName = effect.getPotion().getRegistryName().toString();
            if (Arrays.asList(Config.disabledPotions).contains(effectName)) {
                effectsToRemove.add(effect);
            }
        }
        potionEffects.removeAll(effectsToRemove);

        return potionEffects;
    }

    /**
     * Calculates the minimum amount of time required for the given potion to be effective, and adds to the entity.
     *
     * @param entity    What entity to add the potion effect to (must be instance of EntityLivingBase
     * @param potion    Which potion to apply
     * @param amplifier What level of potion will be applied (Careful, this is 0-indexed)
     */
    private void addPotionEffect(EntityLivingBase entity, Potion potion, int amplifier) {
        PotionEffect activeEffect = entity.getActivePotionEffect(potion);
        //Get the minimum amount of time needed for this potion to have an effect. Necessary to allow potions
        // like regeneration and poison to count down and have an effect on the player
        int duration = 10;
        for (int i = duration; i < 1000; i++) {
            if (potion.isReady(i, amplifier)) {
                duration = i;
                break;
            }
        }

        //Night vision specifically flickers when given less than 10 seconds duration, hence hard-coding duration here
        if (potion == MobEffects.NIGHT_VISION) {
            entity.addPotionEffect(new PotionEffect(potion, 210, amplifier, false, false));
            //Add the potion effect to the target if it isn't already effected, or is about to run out.
        } else if (activeEffect == null || activeEffect.getDuration() < 10) {
            entity.addPotionEffect(new PotionEffect(potion, duration, amplifier, false, false));
        }
    }
}
