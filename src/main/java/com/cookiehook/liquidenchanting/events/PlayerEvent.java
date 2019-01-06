package com.cookiehook.liquidenchanting.events;

import com.cookiehook.liquidenchanting.util.RomanNumber;
import com.google.common.collect.Lists;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.*;
import net.minecraft.nbt.NBTTagCompound;
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

import java.util.Iterator;
import java.util.List;

public class PlayerEvent {

    @SubscribeEvent
    public void playerTick(TickEvent.PlayerTickEvent event) {
        EntityLivingBase player = event.player;
        Iterator<ItemStack> armor = player.getArmorInventoryList().iterator();
        List<ItemStack> armorStack = Lists.newArrayList(armor);

        for (ItemStack itemstack : armorStack) {
            PotionType potionType = getPotionTypeFromNBT(itemstack.getTagCompound());

            if (potionType != null) {
                for (PotionEffect potionEffect : potionType.getEffects()) {
                    addPotionEffect(player, potionEffect.getPotion(), 10, potionEffect.getAmplifier(), false);
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
            PotionType potionType = getPotionTypeFromNBT(itemStack.getTagCompound());

            if (potionType != null) {
                for (PotionEffect potionEffect : potionType.getEffects()) {
                    String potionName = potionEffect.getPotion().getName();
                    String level = RomanNumber.toRoman(potionEffect.getAmplifier() + 1);
                    toolTip.add(1, TextFormatting.BLUE + I18n.format(potionName) + " " + level);
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
            PotionType potionType = getPotionTypeFromNBT(weapon.getTagCompound());

            if (potionType != null && target instanceof EntityLivingBase) {
                for (PotionEffect potionEffect : potionType.getEffects()) {
                    Potion potion = potionEffect.getPotion();
                    int duration = potion.isInstant() ? 1 : 200;
                    addPotionEffect((EntityLivingBase) target, potion, duration, potionEffect.getAmplifier(), true);
                }
            }
        }
    }


    private PotionType getPotionTypeFromNBT(NBTTagCompound nbtTagCompound) {
        PotionType potionType = null;
        if (nbtTagCompound != null) {
            String potionName = nbtTagCompound.getString("Potion");
            if (!potionName.equals("")) {
                potionType = PotionType.getPotionTypeForName(potionName);
            }
        }
        return potionType;
    }

    private void addPotionEffect(EntityLivingBase entity, Potion potion, int duration, int amplifier, boolean showParticles) {
        // These potions rely on the timer counting down to give the effect, so we add them once every 10 seconds
        if (potion == MobEffects.REGENERATION || potion == MobEffects.POISON || potion == MobEffects.WITHER) {
            if (!entity.isPotionActive(potion)) {
                entity.addPotionEffect(new PotionEffect(potion, 200, amplifier, false, showParticles));
            }
            // Night vision flickers when below 10 seconds, this give uninterrupted effect whilst the armor is worn
        } else if (potion == MobEffects.NIGHT_VISION) {
            entity.addPotionEffect(new PotionEffect(potion, 210, amplifier, false, showParticles));
        } else {
            entity.addPotionEffect(new PotionEffect(potion, duration, amplifier, false, showParticles));
        }
    }


}
