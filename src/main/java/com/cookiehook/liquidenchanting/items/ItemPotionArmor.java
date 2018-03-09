package com.cookiehook.liquidenchanting.items;

import java.util.List;

import com.cookiehook.liquidenchanting.init.ModItems;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemPotionArmor extends ItemArmor {

	private Potion potion;
	private int duration, amplifier;
	
	public ItemPotionArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType, Potion potion, String name) {
		this(material, renderIndex, armorType, potion, 10, 0, name);
	}
	
	public ItemPotionArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType, Potion potion, int duration, int amplifier, String name) {
		super(material, renderIndex, armorType);
		
		ModItems.itemList.add(this);
		this.potion = potion;
		this.duration = duration;
		this.amplifier = amplifier;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
		player.addPotionEffect(new PotionEffect(potion, duration, amplifier, false, false));
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
