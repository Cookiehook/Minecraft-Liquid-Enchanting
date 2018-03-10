package com.cookiehook.liquidenchanting.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemDecrementingPotionArmor extends ItemPotionArmor {

	private Potion potion;
	private int duration, amplifier;

	public ItemDecrementingPotionArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType, Potion potion, String name) {
		this(material, renderIndex, armorType, potion, 200, 0, name);
	}

	public ItemDecrementingPotionArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType, Potion potion, int duration,
			int amplifier, String name) {
		super(material, renderIndex, armorType, potion, duration, amplifier, name);
		this.potion = potion;
		this.duration = duration;
		this.amplifier = amplifier;
	}

	// Potions that effect health rely on the counter ticking down. This method lets potions count down and give their effect.
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
		if (!player.isPotionActive(potion))
			player.addPotionEffect(new PotionEffect(potion, duration, amplifier, false, false));
	}
}
