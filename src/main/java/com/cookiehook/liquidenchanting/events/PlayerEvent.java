package com.cookiehook.liquidenchanting.events;

import com.google.common.collect.Lists;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.Iterator;
import java.util.List;


public class PlayerEvent {


    @SubscribeEvent
    public void playerTick(TickEvent.PlayerTickEvent event) {
        EntityPlayer player = event.player;
        int amplifier = 0;
        Iterator<ItemStack> armor = player.getArmorInventoryList().iterator();
        List<ItemStack> armorStack = Lists.newArrayList(armor);

        for (ItemStack itemstack : armorStack) {
            NBTTagCompound nbtTagCompound = itemstack.getTagCompound();
            if (nbtTagCompound != null) {
                String potionName = nbtTagCompound.getString("Potion");
                if (!potionName.equals("")) {
                    // Remove domain name and prefix for extended duration, as we don't care about those.
                    potionName = potionName.split(":")[1].replace("long_", "");
                    if (potionName.startsWith("strong_")) {  //Set amplifier and sanitise name for level II potions.
                        amplifier = 1;
                        potionName = potionName.replace("strong_", "");
                    }
                    switch (potionName) {
                        case "leaping": potionName = "jump_boost"; break;
                        case "swiftness": potionName = "speed"; break;
                    }



                    Potion potion = Potion.getPotionFromResourceLocation(potionName);
                    if (potion != null) {
                        addPotionEffect(player, potion, 10, amplifier);
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
        // Let's not accidentally muck around with every item in the game OK?
        if (itemStack.getItem() instanceof ItemArmor) {

            NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
            if (nbtTagCompound != null) {
                String potionName = nbtTagCompound.getString("Potion");
                if (!potionName.equals("")) {
                    // Remove domain name and prefix for extended duration, as we don't care about those.
                    potionName = potionName.split(":")[1].replace("long_", "");
                    if (potionName.startsWith("strong_")) {  //Set amplifier and sanitise name for level II potions.
                        level = "II";
                        potionName = potionName.replace("strong_", "");
                    }

                    switch (potionName) {
                        case "leaping": potionName = "jump_boost"; break;
                        case "swiftness": potionName = "speed"; break;
                    }

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


    private void addPotionEffect(EntityPlayer player, Potion potion, int duration, int amplifier) {
        // These potions rely on the timer counting down to give the effect, so we add them once every 10 seconds
        if (potion == MobEffects.REGENERATION || potion == MobEffects.POISON) {
            if (!player.isPotionActive(potion)) {
                player.addPotionEffect(new PotionEffect(potion, 200, amplifier, false, false));
            }
            // Night vision flickers when below 10 seconds, this give uninterrupted effect whilst the armor is worn
        } else if (potion == MobEffects.NIGHT_VISION) {
            player.addPotionEffect(new PotionEffect(potion, 210, amplifier, false, false));
        } else {
            player.addPotionEffect(new PotionEffect(potion, duration, amplifier, false, false));
        }
    }


}
