package com.cookiehook.liquidenchanting.items;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Armors that increment/decrement health do so by relying on the timer counting down.
 * This child class adds these potion effects for 10 seconds, then replenishes the effect once it's counted
 * down to allow the potions to take proper effect.
 */
public class ItemDecrementingPotionArmor extends ItemPotionArmor {

    public ItemDecrementingPotionArmor(ArmorMaterial material, EntityEquipmentSlot armorType, Potion potion, String name) {
        super(material, armorType, potion, 200, 0, name);
    }

    public ItemDecrementingPotionArmor(ArmorMaterial material, EntityEquipmentSlot armorType, Potion potion,
                                       int amplifier, String name) {
        super(material, armorType, potion, 200, amplifier, name);
    }


    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        if (!player.isPotionActive(potion))
            player.addPotionEffect(new PotionEffect(potion, duration, amplifier, false, false));
    }
}
