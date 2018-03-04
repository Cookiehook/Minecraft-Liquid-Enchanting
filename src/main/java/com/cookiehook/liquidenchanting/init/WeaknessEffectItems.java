package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;

public class WeaknessEffectItems {

	
	public static Item weakness_leather_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, 0, Potion.weakness).setUnlocalizedName("weakness_leather_helmet");
	public static Item weakness_leather_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, 1, Potion.weakness).setUnlocalizedName("weakness_leather_chestplate");
	public static Item weakness_leather_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, 2, Potion.weakness).setUnlocalizedName("weakness_leather_leggings");
	public static Item weakness_leather_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, 3, Potion.weakness).setUnlocalizedName("weakness_leather_boots");
	public static Item weakness_chain_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 0, Potion.weakness).setUnlocalizedName("weakness_chain_helmet");
	public static Item weakness_chain_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 1, Potion.weakness).setUnlocalizedName("weakness_chain_chestplate");
	public static Item weakness_chain_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 2, Potion.weakness).setUnlocalizedName("weakness_chain_leggings");
	public static Item weakness_chain_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 3, Potion.weakness).setUnlocalizedName("weakness_chain_boots");
	public static Item weakness_iron_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 0, Potion.weakness).setUnlocalizedName("weakness_iron_helmet");
	public static Item weakness_iron_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 1, Potion.weakness).setUnlocalizedName("weakness_iron_chestplate");
	public static Item weakness_iron_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 2, Potion.weakness).setUnlocalizedName("weakness_iron_leggings");
	public static Item weakness_iron_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 3, Potion.weakness).setUnlocalizedName("weakness_iron_boots");
	public static Item weakness_golden_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 0, Potion.weakness).setUnlocalizedName("weakness_golden_helmet");
	public static Item weakness_golden_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 1, Potion.weakness).setUnlocalizedName("weakness_golden_chestplate");
	public static Item weakness_golden_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 2, Potion.weakness).setUnlocalizedName("weakness_golden_leggings");
	public static Item weakness_golden_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 3, Potion.weakness).setUnlocalizedName("weakness_golden_boots");
	public static Item weakness_diamond_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 0, Potion.weakness).setUnlocalizedName("weakness_diamond_helmet");
	public static Item weakness_diamond_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 1, Potion.weakness).setUnlocalizedName("weakness_diamond_chestplate");
	public static Item weakness_diamond_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 2, Potion.weakness).setUnlocalizedName("weakness_diamond_leggings");
	public static Item weakness_diamond_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 3, Potion.weakness).setUnlocalizedName("weakness_diamond_boots");

	public static Item weakness_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, Potion.weakness).setUnlocalizedName("weakness_wooden_sword");
	public static Item weakness_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, Potion.weakness).setUnlocalizedName("weakness_stone_sword");
	public static Item weakness_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, Potion.weakness).setUnlocalizedName("weakness_iron_sword");
	public static Item weakness_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, Potion.weakness).setUnlocalizedName("weakness_golden_sword");
	public static Item weakness_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.EMERALD, Potion.weakness).setUnlocalizedName("weakness_diamond_sword");
	
	public static void init() {
		System.out.println("Initialising: Weakness Items");
	}
}