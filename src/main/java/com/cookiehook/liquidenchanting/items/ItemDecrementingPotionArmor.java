package com.cookiehook.liquidenchanting.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemDecrementingPotionArmor extends ItemPotionArmor {
	
	private Potion potion;
	private int duration, amplifier;
	
	public ItemDecrementingPotionArmor(ArmorMaterial material, int renderIndex, int armorType, Potion potion) {
		//Passes a default duration 10 seconds and amplifier 0 to the main constructor.
		this(material, renderIndex, armorType, potion, 200, 0);
	}
	
	public ItemDecrementingPotionArmor(ArmorMaterial material, int renderIndex, int armorType, Potion potion, int duration, int amplifier) {
		super(material, renderIndex, armorType, potion, duration, amplifier);
		this.potion = potion;
		this.duration = duration;
		this.amplifier = amplifier;
	}

	// Adds the given effect to player, if not currently active.
	// Potions that effect health rely on the counter ticking down. This method lets potions count down and give their effect.
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
		if (!player.isPotionActive(potion))
			player.addPotionEffect(new PotionEffect(potion.id, duration, amplifier));
	}
}
