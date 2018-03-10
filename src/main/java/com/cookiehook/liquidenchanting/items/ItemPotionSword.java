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

public class ItemPotionSword extends ItemSword {
	
	Potion potion;
	private int duration, amplifier;
	
	
	public ItemPotionSword(ToolMaterial material, Potion potion, String name) {
		this(material, potion, 200, 0, name);
	}
	
	public ItemPotionSword(ToolMaterial material, Potion potion, int duration, int amplifier, String name) {
		super(material);
		
		ModItems.itemList.add(this);
		this.potion = potion;
		this.duration = duration;
		this.amplifier = amplifier;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase hitEntity, EntityLivingBase attackingEntity) {
		hitEntity.addPotionEffect(new PotionEffect(potion, duration, amplifier));
		return true;
	}
	
	public boolean hasEffect(ItemStack itemstack) {
		return true;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
		String potionName = I18n.format(potion.getName());
		String level = "";
		if (amplifier == 1)
			level = "II";
		tooltip.add(potionName + " " + level);
	}
}
