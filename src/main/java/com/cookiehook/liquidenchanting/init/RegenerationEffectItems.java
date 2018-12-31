package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemDecrementingPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;

public class RegenerationEffectItems {
		
	public static Item regeneration_leather_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 0, Potion.regeneration).setUnlocalizedName("regeneration_leather_helmet").setTextureName("minecraft:leather_helmet");
	public static Item regeneration_leather_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 1, Potion.regeneration).setUnlocalizedName("regeneration_leather_chestplate").setTextureName("minecraft:leather_chestplate");
	public static Item regeneration_leather_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 2, Potion.regeneration).setUnlocalizedName("regeneration_leather_leggings").setTextureName("minecraft:leather_leggings");
	public static Item regeneration_leather_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 3, Potion.regeneration).setUnlocalizedName("regeneration_leather_boots").setTextureName("minecraft:leather_boots");
	public static Item regeneration_chainmail_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 0, Potion.regeneration).setUnlocalizedName("regeneration_chainmail_helmet").setTextureName("minecraft:chainmail_helmet");
	public static Item regeneration_chainmail_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 1, Potion.regeneration).setUnlocalizedName("regeneration_chainmail_chestplate").setTextureName("minecraft:chainmail_chestplate");
	public static Item regeneration_chainmail_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 2, Potion.regeneration).setUnlocalizedName("regeneration_chainmail_leggings").setTextureName("minecraft:chainmail_leggings");
	public static Item regeneration_chainmail_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 3, Potion.regeneration).setUnlocalizedName("regeneration_chainmail_boots").setTextureName("minecraft:chainmail_boots");
	public static Item regeneration_iron_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 0, Potion.regeneration).setUnlocalizedName("regeneration_iron_helmet").setTextureName("minecraft:iron_helmet");
	public static Item regeneration_iron_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 1, Potion.regeneration).setUnlocalizedName("regeneration_iron_chestplate").setTextureName("minecraft:iron_chestplate");
	public static Item regeneration_iron_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 2, Potion.regeneration).setUnlocalizedName("regeneration_iron_leggings").setTextureName("minecraft:iron_leggings");
	public static Item regeneration_iron_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 3, Potion.regeneration).setUnlocalizedName("regeneration_iron_boots").setTextureName("minecraft:iron_boots");
	public static Item regeneration_golden_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 0, Potion.regeneration).setUnlocalizedName("regeneration_golden_helmet").setTextureName("minecraft:gold_helmet");
	public static Item regeneration_golden_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 1, Potion.regeneration).setUnlocalizedName("regeneration_golden_chestplate").setTextureName("minecraft:gold_chestplate");
	public static Item regeneration_golden_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 2, Potion.regeneration).setUnlocalizedName("regeneration_golden_leggings").setTextureName("minecraft:gold_leggings");
	public static Item regeneration_golden_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 3, Potion.regeneration).setUnlocalizedName("regeneration_golden_boots").setTextureName("minecraft:gold_boots");
	public static Item regeneration_diamond_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 0, Potion.regeneration).setUnlocalizedName("regeneration_diamond_helmet").setTextureName("minecraft:diamond_helmet");
	public static Item regeneration_diamond_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 1, Potion.regeneration).setUnlocalizedName("regeneration_diamond_chestplate").setTextureName("minecraft:diamond_chestplate");
	public static Item regeneration_diamond_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 2, Potion.regeneration).setUnlocalizedName("regeneration_diamond_leggings").setTextureName("minecraft:diamond_leggings");
	public static Item regeneration_diamond_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 3, Potion.regeneration).setUnlocalizedName("regeneration_diamond_boots").setTextureName("minecraft:diamond_boots");
        
	public static Item strong_regeneration_leather_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 0, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_leather_helmet").setTextureName("minecraft:leather_helmet");
	public static Item strong_regeneration_leather_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 1, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_leather_chestplate").setTextureName("minecraft:leather_chestplate");
	public static Item strong_regeneration_leather_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 2, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_leather_leggings").setTextureName("minecraft:leather_leggings");
	public static Item strong_regeneration_leather_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 3, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_leather_boots").setTextureName("minecraft:leather_boots");
	public static Item strong_regeneration_chainmail_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 0, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_chainmail_helmet").setTextureName("minecraft:chainmail_helmet");
	public static Item strong_regeneration_chainmail_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 1, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_chainmail_chestplate").setTextureName("minecraft:chainmail_chestplate");
	public static Item strong_regeneration_chainmail_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 2, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_chainmail_leggings").setTextureName("minecraft:chainmail_leggings");
	public static Item strong_regeneration_chainmail_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 3, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_chainmail_boots").setTextureName("minecraft:chainmail_boots");
	public static Item strong_regeneration_iron_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 0, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_iron_helmet").setTextureName("minecraft:iron_helmet");
	public static Item strong_regeneration_iron_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 1, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_iron_chestplate").setTextureName("minecraft:iron_chestplate");
	public static Item strong_regeneration_iron_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 2, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_iron_leggings").setTextureName("minecraft:iron_leggings");
	public static Item strong_regeneration_iron_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 3, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_iron_boots").setTextureName("minecraft:iron_boots");
	public static Item strong_regeneration_golden_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 0, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_golden_helmet").setTextureName("minecraft:gold_helmet");
	public static Item strong_regeneration_golden_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 1, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_golden_chestplate").setTextureName("minecraft:gold_chestplate");
	public static Item strong_regeneration_golden_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 2, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_golden_leggings").setTextureName("minecraft:gold_leggings");
	public static Item strong_regeneration_golden_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 3, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_golden_boots").setTextureName("minecraft:gold_boots");
	public static Item strong_regeneration_diamond_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 0, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_diamond_helmet").setTextureName("minecraft:diamond_helmet");
	public static Item strong_regeneration_diamond_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 1, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_diamond_chestplate").setTextureName("minecraft:diamond_chestplate");
	public static Item strong_regeneration_diamond_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 2, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_diamond_leggings").setTextureName("minecraft:diamond_leggings");
	public static Item strong_regeneration_diamond_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 3, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_diamond_boots").setTextureName("minecraft:diamond_boots");

	
	public static Item regeneration_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, Potion.regeneration).setUnlocalizedName("regeneration_wooden_sword").setTextureName("minecraft:wood_sword");
	public static Item regeneration_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, Potion.regeneration).setUnlocalizedName("regeneration_stone_sword").setTextureName("minecraft:stone_sword");
	public static Item regeneration_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, Potion.regeneration).setUnlocalizedName("regeneration_iron_sword").setTextureName("minecraft:iron_sword");
	public static Item regeneration_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, Potion.regeneration).setUnlocalizedName("regeneration_golden_sword").setTextureName("minecraft:gold_sword");
	public static Item regeneration_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.EMERALD, Potion.regeneration).setUnlocalizedName("regeneration_diamond_sword").setTextureName("minecraft:diamond_sword");
	
	public static Item strong_regeneration_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_wooden_sword").setTextureName("minecraft:wood_sword");
	public static Item strong_regeneration_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_stone_sword").setTextureName("minecraft:stone_sword");
	public static Item strong_regeneration_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_iron_sword").setTextureName("minecraft:iron_sword");
	public static Item strong_regeneration_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_golden_sword").setTextureName("minecraft:gold_sword");
	public static Item strong_regeneration_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.EMERALD, Potion.regeneration, 200, 1).setUnlocalizedName("strong_regeneration_diamond_sword").setTextureName("minecraft:diamond_sword");

	public static void init() {
		System.out.println("Initialising: Regeneration Items");
	}
}