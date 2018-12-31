package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;

public class InvisibilityEffectItems {
			
	public static Item invisibility_leather_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 0, Potion.invisibility).setUnlocalizedName("invisibility_leather_helmet").setTextureName("minecraft:leather_helmet");
	public static Item invisibility_leather_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 1, Potion.invisibility).setUnlocalizedName("invisibility_leather_chestplate").setTextureName("minecraft:leather_chestplate");
	public static Item invisibility_leather_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 2, Potion.invisibility).setUnlocalizedName("invisibility_leather_leggings").setTextureName("minecraft:leather_leggings");
	public static Item invisibility_leather_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 3, Potion.invisibility).setUnlocalizedName("invisibility_leather_boots").setTextureName("minecraft:leather_boots");
	public static Item invisibility_chainmail_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 0, Potion.invisibility).setUnlocalizedName("invisibility_chainmail_helmet").setTextureName("minecraft:chainmail_helmet");
	public static Item invisibility_chainmail_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 1, Potion.invisibility).setUnlocalizedName("invisibility_chainmail_chestplate").setTextureName("minecraft:chainmail_chestplate");
	public static Item invisibility_chainmail_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 2, Potion.invisibility).setUnlocalizedName("invisibility_chainmail_leggings").setTextureName("minecraft:chainmail_leggings");
	public static Item invisibility_chainmail_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 3, Potion.invisibility).setUnlocalizedName("invisibility_chainmail_boots").setTextureName("minecraft:chainmail_boots");
	public static Item invisibility_iron_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 0, Potion.invisibility).setUnlocalizedName("invisibility_iron_helmet").setTextureName("minecraft:iron_helmet");
	public static Item invisibility_iron_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 1, Potion.invisibility).setUnlocalizedName("invisibility_iron_chestplate").setTextureName("minecraft:iron_chestplate");
	public static Item invisibility_iron_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 2, Potion.invisibility).setUnlocalizedName("invisibility_iron_leggings").setTextureName("minecraft:iron_leggings");
	public static Item invisibility_iron_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 3, Potion.invisibility).setUnlocalizedName("invisibility_iron_boots").setTextureName("minecraft:iron_boots");
	public static Item invisibility_golden_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 0, Potion.invisibility).setUnlocalizedName("invisibility_golden_helmet").setTextureName("minecraft:gold_helmet");
	public static Item invisibility_golden_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 1, Potion.invisibility).setUnlocalizedName("invisibility_golden_chestplate").setTextureName("minecraft:gold_chestplate");
	public static Item invisibility_golden_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 2, Potion.invisibility).setUnlocalizedName("invisibility_golden_leggings").setTextureName("minecraft:gold_leggings");
	public static Item invisibility_golden_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 3, Potion.invisibility).setUnlocalizedName("invisibility_golden_boots").setTextureName("minecraft:gold_boots");
	public static Item invisibility_diamond_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 0, Potion.invisibility).setUnlocalizedName("invisibility_diamond_helmet").setTextureName("minecraft:diamond_helmet");
	public static Item invisibility_diamond_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 1, Potion.invisibility).setUnlocalizedName("invisibility_diamond_chestplate").setTextureName("minecraft:diamond_chestplate");
	public static Item invisibility_diamond_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 2, Potion.invisibility).setUnlocalizedName("invisibility_diamond_leggings").setTextureName("minecraft:diamond_leggings");
	public static Item invisibility_diamond_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 3, Potion.invisibility).setUnlocalizedName("invisibility_diamond_boots").setTextureName("minecraft:diamond_boots");

	public static Item invisibility_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, Potion.invisibility).setUnlocalizedName("invisibility_wooden_sword").setTextureName("minecraft:wood_sword");
	public static Item invisibility_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, Potion.invisibility).setUnlocalizedName("invisibility_stone_sword").setTextureName("minecraft:stone_sword");
	public static Item invisibility_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, Potion.invisibility).setUnlocalizedName("invisibility_iron_sword").setTextureName("minecraft:iron_sword");
	public static Item invisibility_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, Potion.invisibility).setUnlocalizedName("invisibility_golden_sword").setTextureName("minecraft:gold_sword");
	public static Item invisibility_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.EMERALD, Potion.invisibility).setUnlocalizedName("invisibility_diamond_sword").setTextureName("minecraft:diamond_sword");

	public static void init() {
		System.out.println("Initialising: Invisibility Items");
	}
}