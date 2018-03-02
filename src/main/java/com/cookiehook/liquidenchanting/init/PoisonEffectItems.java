package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemDecrementingPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;

public class PoisonEffectItems {
	
	public static Item poison_leather_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 0, Potion.poison).setUnlocalizedName("poison_leather_helmet").setTextureName("minecraft:leather_helmet");
	public static Item poison_leather_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 1, Potion.poison).setUnlocalizedName("poison_leather_chestplate").setTextureName("minecraft:leather_chestplate");
	public static Item poison_leather_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 2, Potion.poison).setUnlocalizedName("poison_leather_leggings").setTextureName("minecraft:leather_leggings");
	public static Item poison_leather_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 3, Potion.poison).setUnlocalizedName("poison_leather_boots").setTextureName("minecraft:leather_boots");
	public static Item poison_chain_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 0, Potion.poison).setUnlocalizedName("poison_chain_helmet").setTextureName("minecraft:chainmail_helmet");
	public static Item poison_chain_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 1, Potion.poison).setUnlocalizedName("poison_chain_chestplate").setTextureName("minecraft:chainmail_chestplate");
	public static Item poison_chain_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 2, Potion.poison).setUnlocalizedName("poison_chain_leggings").setTextureName("minecraft:chainmail_leggings");
	public static Item poison_chain_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 3, Potion.poison).setUnlocalizedName("poison_chain_boots").setTextureName("minecraft:chainmail_boots");
	public static Item poison_iron_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 0, Potion.poison).setUnlocalizedName("poison_iron_helmet").setTextureName("minecraft:iron_helmet");
	public static Item poison_iron_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 1, Potion.poison).setUnlocalizedName("poison_iron_chestplate").setTextureName("minecraft:iron_chestplate");
	public static Item poison_iron_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 2, Potion.poison).setUnlocalizedName("poison_iron_leggings").setTextureName("minecraft:iron_leggings");
	public static Item poison_iron_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 3, Potion.poison).setUnlocalizedName("poison_iron_boots").setTextureName("minecraft:iron_boots");
	public static Item poison_golden_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 0, Potion.poison).setUnlocalizedName("poison_golden_helmet").setTextureName("minecraft:gold_helmet");
	public static Item poison_golden_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 1, Potion.poison).setUnlocalizedName("poison_golden_chestplate").setTextureName("minecraft:gold_chestplate");
	public static Item poison_golden_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 2, Potion.poison).setUnlocalizedName("poison_golden_leggings").setTextureName("minecraft:gold_leggings");
	public static Item poison_golden_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 3, Potion.poison).setUnlocalizedName("poison_golden_boots").setTextureName("minecraft:gold_boots");
	public static Item poison_diamond_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 0, Potion.poison).setUnlocalizedName("poison_diamond_helmet").setTextureName("minecraft:diamond_helmet");
	public static Item poison_diamond_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 1, Potion.poison).setUnlocalizedName("poison_diamond_chestplate").setTextureName("minecraft:diamond_chestplate");
	public static Item poison_diamond_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 2, Potion.poison).setUnlocalizedName("poison_diamond_leggings").setTextureName("minecraft:diamond_leggings");
	public static Item poison_diamond_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 3, Potion.poison).setUnlocalizedName("poison_diamond_boots").setTextureName("minecraft:diamond_boots");
	
	public static Item poisonII_leather_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 0, Potion.poison, 200, 1).setUnlocalizedName("poisonII_leather_helmet").setTextureName("minecraft:leather_helmet");
	public static Item poisonII_leather_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 1, Potion.poison, 200, 1).setUnlocalizedName("poisonII_leather_chestplate").setTextureName("minecraft:leather_chestplate");
	public static Item poisonII_leather_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 2, Potion.poison, 200, 1).setUnlocalizedName("poisonII_leather_leggings").setTextureName("minecraft:leather_leggings");
	public static Item poisonII_leather_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 3, Potion.poison, 200, 1).setUnlocalizedName("poisonII_leather_boots").setTextureName("minecraft:leather_boots");
	public static Item poisonII_chain_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 0, Potion.poison, 200, 1).setUnlocalizedName("poisonII_chain_helmet").setTextureName("minecraft:chainmail_helmet");
	public static Item poisonII_chain_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 1, Potion.poison, 200, 1).setUnlocalizedName("poisonII_chain_chestplate").setTextureName("minecraft:chainmail_chestplate");
	public static Item poisonII_chain_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 2, Potion.poison, 200, 1).setUnlocalizedName("poisonII_chain_leggings").setTextureName("minecraft:chainmail_leggings");
	public static Item poisonII_chain_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 3, Potion.poison, 200, 1).setUnlocalizedName("poisonII_chain_boots").setTextureName("minecraft:chainmail_boots");
	public static Item poisonII_iron_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 0, Potion.poison, 200, 1).setUnlocalizedName("poisonII_iron_helmet").setTextureName("minecraft:iron_helmet");
	public static Item poisonII_iron_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 1, Potion.poison, 200, 1).setUnlocalizedName("poisonII_iron_chestplate").setTextureName("minecraft:iron_chestplate");
	public static Item poisonII_iron_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 2, Potion.poison, 200, 1).setUnlocalizedName("poisonII_iron_leggings").setTextureName("minecraft:iron_leggings");
	public static Item poisonII_iron_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 3, Potion.poison, 200, 1).setUnlocalizedName("poisonII_iron_boots").setTextureName("minecraft:iron_boots");
	public static Item poisonII_golden_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 0, Potion.poison, 200, 1).setUnlocalizedName("poisonII_golden_helmet").setTextureName("minecraft:gold_helmet");
	public static Item poisonII_golden_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 1, Potion.poison, 200, 1).setUnlocalizedName("poisonII_golden_chestplate").setTextureName("minecraft:gold_chestplate");
	public static Item poisonII_golden_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 2, Potion.poison, 200, 1).setUnlocalizedName("poisonII_golden_leggings").setTextureName("minecraft:gold_leggings");
	public static Item poisonII_golden_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 3, Potion.poison, 200, 1).setUnlocalizedName("poisonII_golden_boots").setTextureName("minecraft:gold_boots");
	public static Item poisonII_diamond_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 0, Potion.poison, 200, 1).setUnlocalizedName("poisonII_diamond_helmet").setTextureName("minecraft:diamond_helmet");
	public static Item poisonII_diamond_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 1, Potion.poison, 200, 1).setUnlocalizedName("poisonII_diamond_chestplate").setTextureName("minecraft:diamond_chestplate");
	public static Item poisonII_diamond_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 2, Potion.poison, 200, 1).setUnlocalizedName("poisonII_diamond_leggings").setTextureName("minecraft:diamond_leggings");
	public static Item poisonII_diamond_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 3, Potion.poison, 200, 1).setUnlocalizedName("poisonII_diamond_boots").setTextureName("minecraft:diamond_boots");

	public static Item poison_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, Potion.poison).setUnlocalizedName("poison_wooden_sword").setTextureName("minecraft:wood_sword");
	public static Item poison_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, Potion.poison).setUnlocalizedName("poison_stone_sword").setTextureName("minecraft:stone_sword");
	public static Item poison_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, Potion.poison).setUnlocalizedName("poison_iron_sword").setTextureName("minecraft:iron_sword");
	public static Item poison_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, Potion.poison).setUnlocalizedName("poison_golden_sword").setTextureName("minecraft:gold_sword");
	public static Item poison_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.EMERALD, Potion.poison).setUnlocalizedName("poison_diamond_sword").setTextureName("minecraft:diamond_sword");
	
	public static Item poisonII_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, Potion.poison, 200, 1).setUnlocalizedName("poisonII_wooden_sword").setTextureName("minecraft:wood_sword");
	public static Item poisonII_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, Potion.poison, 200, 1).setUnlocalizedName("poisonII_stone_sword").setTextureName("minecraft:stone_sword");
	public static Item poisonII_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, Potion.poison, 200, 1).setUnlocalizedName("poisonII_iron_sword").setTextureName("minecraft:iron_sword");
	public static Item poisonII_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, Potion.poison, 200, 1).setUnlocalizedName("poisonII_golden_sword").setTextureName("minecraft:gold_sword");
	public static Item poisonII_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.EMERALD, Potion.poison, 200, 1).setUnlocalizedName("poisonII_diamond_sword").setTextureName("minecraft:diamond_sword");

	public static void init() {
		System.out.println("Initialising: Poison Items");
	}
}