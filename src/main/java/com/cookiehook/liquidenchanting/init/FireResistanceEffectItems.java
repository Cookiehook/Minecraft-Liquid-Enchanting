package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;

public class FireResistanceEffectItems {
	
	/*
	 * As these items are static variables, they will be initialised when the class is called.
	 * The class is called by calling the init() method, which forces the code below to run.
	 * 
	 * Hover over the constructor (the part after new) to see what the arguments are for.
	 * The .setUnlocalisedName method gives a name which will be used to register the item, and display in game.
	 * The .setTextureName method points to the texture used in the inventory. This mod uses the vanilla textures,
	 * so any texture packs applied will also be applied to this mod.
	 */
		
	public static Item fire_resistance_leather_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, 0, Potion.fireResistance).setUnlocalizedName("fire_resistance_leather_helmet");
	public static Item fire_resistance_leather_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, 1, Potion.fireResistance).setUnlocalizedName("fire_resistance_leather_chestplate");
	public static Item fire_resistance_leather_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, 2, Potion.fireResistance).setUnlocalizedName("fire_resistance_leather_leggings");
	public static Item fire_resistance_leather_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, 3, Potion.fireResistance).setUnlocalizedName("fire_resistance_leather_boots");
	public static Item fire_resistance_chainmail_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 0, Potion.fireResistance).setUnlocalizedName("fire_resistance_chainmail_helmet");
	public static Item fire_resistance_chainmail_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 1, Potion.fireResistance).setUnlocalizedName("fire_resistance_chainmail_chestplate");
	public static Item fire_resistance_chainmail_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 2, Potion.fireResistance).setUnlocalizedName("fire_resistance_chainmail_leggings");
	public static Item fire_resistance_chainmail_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 3, Potion.fireResistance).setUnlocalizedName("fire_resistance_chainmail_boots");
	public static Item fire_resistance_iron_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 0, Potion.fireResistance).setUnlocalizedName("fire_resistance_iron_helmet");
	public static Item fire_resistance_iron_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 1, Potion.fireResistance).setUnlocalizedName("fire_resistance_iron_chestplate");
	public static Item fire_resistance_iron_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 2, Potion.fireResistance).setUnlocalizedName("fire_resistance_iron_leggings");
	public static Item fire_resistance_iron_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 3, Potion.fireResistance).setUnlocalizedName("fire_resistance_iron_boots");
	public static Item fire_resistance_golden_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 0, Potion.fireResistance).setUnlocalizedName("fire_resistance_golden_helmet");
	public static Item fire_resistance_golden_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 1, Potion.fireResistance).setUnlocalizedName("fire_resistance_golden_chestplate");
	public static Item fire_resistance_golden_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 2, Potion.fireResistance).setUnlocalizedName("fire_resistance_golden_leggings");
	public static Item fire_resistance_golden_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 3, Potion.fireResistance).setUnlocalizedName("fire_resistance_golden_boots");
	public static Item fire_resistance_diamond_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 0, Potion.fireResistance).setUnlocalizedName("fire_resistance_diamond_helmet");
	public static Item fire_resistance_diamond_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 1, Potion.fireResistance).setUnlocalizedName("fire_resistance_diamond_chestplate");
	public static Item fire_resistance_diamond_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 2, Potion.fireResistance).setUnlocalizedName("fire_resistance_diamond_leggings");
	public static Item fire_resistance_diamond_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 3, Potion.fireResistance).setUnlocalizedName("fire_resistance_diamond_boots");
	
	public static Item fire_resistance_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, Potion.fireResistance).setUnlocalizedName("fire_resistance_wooden_sword");
	public static Item fire_resistance_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, Potion.fireResistance).setUnlocalizedName("fire_resistance_stone_sword");
	public static Item fire_resistance_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, Potion.fireResistance).setUnlocalizedName("fire_resistance_iron_sword");
	public static Item fire_resistance_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, Potion.fireResistance).setUnlocalizedName("fire_resistance_golden_sword");
	public static Item fire_resistance_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.EMERALD, Potion.fireResistance).setUnlocalizedName("fire_resistance_diamond_sword");

	public static void init() {
		System.out.println("Initialising: Fire Resistance Items");
	}
}