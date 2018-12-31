package com.cookiehook.liquidenchanting.items;

import java.util.List;

import com.cookiehook.liquidenchanting.init.ModItems;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemPotionSword extends ItemSword{
	
	Potion potion;
	private int duration, amplifier;
	
	
	public ItemPotionSword(ToolMaterial material, Potion potion) {
		//Passes a default duration 200 and amplifier 0 to the main constructor.
		this(material, potion, 200, 0);
	}
	
	/**
	 * Creates a sword object, using the following parameters:
	 * @param material - The ToolMaterial needed. This sets properties such as efficiency, durability reduction etc.
	 * @param potionEffect - A PotionEffect object, which will be added to the hit entity.
	 */
	public ItemPotionSword(ToolMaterial material, Potion potion, int duration, int amplifier) {
		//Passes the toolMaterial parameter to the ItemSword constructor, which actually does the work.
		super(material);
		
		//Adds the created item to the itemList for registration.
		ModItems.itemList.add(this);
		this.potion = potion;
		this.duration = duration;
		this.amplifier = amplifier;
	}
	
	//Adds the potion effect to any entity hit by the sword.
	public boolean hitEntity(ItemStack stack, EntityLivingBase hitEntity, EntityLivingBase attackingEntity) {
		hitEntity.addPotionEffect(new PotionEffect(potion.id, duration, amplifier));
		return super.hitEntity(stack, hitEntity, attackingEntity);
	}
	
	//Gives the "enchanted" animation.
	public boolean hasEffect(ItemStack itemstack) {
		return true;
	}
	
	// Adds the potion type as a tooltip.
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
		// Gets the potion name from the potion effect, and registers with the
		// localisation resources.
		// This allows it to be translated by .lang files.
		String potionName = I18n.format(potion.getName());
		String level = "";
		if (amplifier == 1)
			level = "II";
		tooltip.add(potionName + " " + level);
	}
}
