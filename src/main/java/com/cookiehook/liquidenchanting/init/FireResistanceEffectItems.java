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
		
	public static Item fireresistance_leather_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, 0, Potion.fireResistance).setUnlocalizedName("fireresistance_leather_helmet");
	public static Item fireresistance_leather_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, 1, Potion.fireResistance).setUnlocalizedName("fireresistance_leather_chestplate");
	public static Item fireresistance_leather_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, 2, Potion.fireResistance).setUnlocalizedName("fireresistance_leather_leggings");
	public static Item fireresistance_leather_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, 3, Potion.fireResistance).setUnlocalizedName("fireresistance_leather_boots");
	public static Item fireresistance_chain_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 0, Potion.fireResistance).setUnlocalizedName("fireresistance_chain_helmet");
	public static Item fireresistance_chain_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 1, Potion.fireResistance).setUnlocalizedName("fireresistance_chain_chestplate");
	public static Item fireresistance_chain_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 2, Potion.fireResistance).setUnlocalizedName("fireresistance_chain_leggings");
	public static Item fireresistance_chain_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 3, Potion.fireResistance).setUnlocalizedName("fireresistance_chain_boots");
	public static Item fireresistance_iron_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 0, Potion.fireResistance).setUnlocalizedName("fireresistance_iron_helmet");
	public static Item fireresistance_iron_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 1, Potion.fireResistance).setUnlocalizedName("fireresistance_iron_chestplate");
	public static Item fireresistance_iron_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 2, Potion.fireResistance).setUnlocalizedName("fireresistance_iron_leggings");
	public static Item fireresistance_iron_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 3, Potion.fireResistance).setUnlocalizedName("fireresistance_iron_boots");
	public static Item fireresistance_golden_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 0, Potion.fireResistance).setUnlocalizedName("fireresistance_golden_helmet");
	public static Item fireresistance_golden_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 1, Potion.fireResistance).setUnlocalizedName("fireresistance_golden_chestplate");
	public static Item fireresistance_golden_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 2, Potion.fireResistance).setUnlocalizedName("fireresistance_golden_leggings");
	public static Item fireresistance_golden_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 3, Potion.fireResistance).setUnlocalizedName("fireresistance_golden_boots");
	public static Item fireresistance_diamond_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 0, Potion.fireResistance).setUnlocalizedName("fireresistance_diamond_helmet");
	public static Item fireresistance_diamond_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 1, Potion.fireResistance).setUnlocalizedName("fireresistance_diamond_chestplate");
	public static Item fireresistance_diamond_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 2, Potion.fireResistance).setUnlocalizedName("fireresistance_diamond_leggings");
	public static Item fireresistance_diamond_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 3, Potion.fireResistance).setUnlocalizedName("fireresistance_diamond_boots");
	
	public static Item fireresistance_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, Potion.fireResistance).setUnlocalizedName("fireresistance_wooden_sword");
	public static Item fireresistance_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, Potion.fireResistance).setUnlocalizedName("fireresistance_stone_sword");
	public static Item fireresistance_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, Potion.fireResistance).setUnlocalizedName("fireresistance_iron_sword");
	public static Item fireresistance_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, Potion.fireResistance).setUnlocalizedName("fireresistance_golden_sword");
	public static Item fireresistance_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.EMERALD, Potion.fireResistance).setUnlocalizedName("fireresistance_diamond_sword");

	public static void init() {
		System.out.println("Initialising: Fire Resistance Items");
	}
}