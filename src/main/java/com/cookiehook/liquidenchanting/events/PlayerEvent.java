package com.cookiehook.liquidenchanting.events;

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
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.Iterator;
import java.util.List;

public class PlayerEvent {

    @SubscribeEvent
    public void playerTick(TickEvent.PlayerTickEvent event) {
        EntityLivingBase player = event.player;
        Iterator<ItemStack> armor = player.getArmorInventoryList().iterator();
        List<ItemStack> armorStack = Lists.newArrayList(armor);

        for (ItemStack itemstack : armorStack) {
            int amplifier = 0;
            NBTTagCompound nbtTagCompound = itemstack.getTagCompound();
            if (nbtTagCompound != null) {
                String potionName = nbtTagCompound.getString("Potion");
                if (!potionName.equals("")) {
                    if (potionName.contains("strong_")) {  //Set amplifier for level II potions.
                        amplifier = 1;
                    }

                    potionName = sanitisePotionName(potionName, false);
                    Potion potion = Potion.getPotionFromResourceLocation(potionName);
                    if (potion != null) {
                        addPotionEffect(player, potion, 10, amplifier, false);
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void toolTipEvent(ItemTooltipEvent event) {
        ItemStack itemStack = event.getItemStack();
        List<String> toolTip = event.getToolTip();
        String level = "";
        boolean allowHealing = false;

        // Let's not accidentally muck around with every item in the game OK?
        Item item = itemStack.getItem();
        if (item instanceof ItemArmor || item instanceof ItemSword || item instanceof ItemTool) {

            NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
            if (nbtTagCompound != null) {
                String potionName = nbtTagCompound.getString("Potion");
                if (!potionName.equals("")) {
                    if (potionName.contains("strong_")) {  //Set amplifier for level II potions.
                        level = "II";
                    }
                    if (itemStack.getItem() instanceof ItemSword) {
                        allowHealing = true;
                    }

                    potionName = sanitisePotionName(potionName, allowHealing);
                    Potion potion = Potion.getPotionFromResourceLocation(potionName);
                    if (potion != null) {
                        potionName = potion.getName();
                    } else {
                        potionName = "effect.none";
                    }
                    toolTip.add(1, I18n.format(potionName) + " " + level);
                }
            }
        }
    }

    @SubscribeEvent
    public void AttackEntityEvent(AttackEntityEvent event) {
        Entity target = event.getTarget();
        EntityPlayer player = event.getEntityPlayer();
        ItemStack weapon = player.getHeldItemMainhand();
        int duration = 200;

        if (weapon.getItem() instanceof ItemSword || weapon.getItem() instanceof ItemTool) {

            int amplifier = 0;
            NBTTagCompound nbtTagCompound = weapon.getTagCompound();
            if (nbtTagCompound != null) {
                String potionName = nbtTagCompound.getString("Potion");
                if (!potionName.equals("")) {
                    if (potionName.contains("strong_")) {  //Set amplifier for level II potions.
                        amplifier = 1;
                    }

                    potionName = sanitisePotionName(potionName, true);
                    Potion potion = Potion.getPotionFromResourceLocation(potionName);
                    if (potion != null && target instanceof EntityLivingBase) {
                        if (potion == MobEffects.INSTANT_HEALTH || potion == MobEffects.INSTANT_DAMAGE) {
                            duration = 1;
                        }
                        addPotionEffect((EntityLivingBase) target, potion, duration, amplifier, true);
                    }
                }
            }
        }
    }

    /**
     * Takes the name of a potion from NBT, and converts to the appropriate name for the potion registry
     * @param potionName Potion name from NBT
     * @param allowHealing Whether healing / harming potions can be processed
     * @return Potion name for potion registry
     */
    private String sanitisePotionName(String potionName, boolean allowHealing) {
        potionName = potionName.split(":")[1].replaceAll("(long|strong)_", "");
        switch (potionName) {
            case "leaping": potionName = "jump_boost"; break;
            case "swiftness": potionName = "speed"; break;
        }

        if (allowHealing) {
            switch (potionName) {
                case "healing": potionName = "instant_health"; break;
                case "harming": potionName = "instant_damage"; break;
            }
        }

        return potionName;
    }


    private void addPotionEffect(EntityLivingBase entity, Potion potion, int duration, int amplifier, boolean showParticles) {
        // These potions rely on the timer counting down to give the effect, so we add them once every 10 seconds
        if (potion == MobEffects.REGENERATION || potion == MobEffects.POISON) {
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
