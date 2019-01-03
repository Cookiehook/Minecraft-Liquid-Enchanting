package com.cookiehook.liquidenchanting.events;

import com.google.common.collect.Lists;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.Iterator;
import java.util.List;


public class PlayerEvent {

    @SubscribeEvent
    public void playerTick(TickEvent.PlayerTickEvent event) {
        EntityPlayer player = event.player;

        Iterator<ItemStack> armor = player.getArmorInventoryList().iterator();
        List<ItemStack> armorStack = Lists.newArrayList(armor);

        for (ItemStack itemstack : armorStack) {
            NBTTagCompound nbtTagCompound = itemstack.getTagCompound();
            if (nbtTagCompound != null) {
                String potionName = nbtTagCompound.getString("Potion");
                if (potionName != null) {
                    Potion potion = Potion.getPotionFromResourceLocation(potionName.split(":")[1]);
                    if (potion != null) {
                        player.addPotionEffect(new PotionEffect(potion, 10, 0, false, false));
                    }
                }
            }
        }
    }


}
