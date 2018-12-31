package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemDecrementingPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionSword;

import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;

public class RegenerationEffectItems {
		
	public static Item regeneration_leather_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, "regeneration_leather_helmet");
	public static Item regeneration_leather_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, "regeneration_leather_chestplate");
	public static Item regeneration_leather_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, "regeneration_leather_leggings");
	public static Item regeneration_leather_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, "regeneration_leather_boots");
	public static Item regeneration_chainmail_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, "regeneration_chainmail_helmet");
	public static Item regeneration_chainmail_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, "regeneration_chainmail_chestplate");
	public static Item regeneration_chainmail_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, "regeneration_chainmail_leggings");
	public static Item regeneration_chainmail_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, "regeneration_chainmail_boots");
	public static Item regeneration_iron_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, "regeneration_iron_helmet");
	public static Item regeneration_iron_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, "regeneration_iron_chestplate");
	public static Item regeneration_iron_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, "regeneration_iron_leggings");
	public static Item regeneration_iron_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, "regeneration_iron_boots");
	public static Item regeneration_golden_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, "regeneration_golden_helmet");
	public static Item regeneration_golden_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, "regeneration_golden_chestplate");
	public static Item regeneration_golden_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, "regeneration_golden_leggings");
	public static Item regeneration_golden_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, "regeneration_golden_boots");
	public static Item regeneration_diamond_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, "regeneration_diamond_helmet");
	public static Item regeneration_diamond_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, "regeneration_diamond_chestplate");
	public static Item regeneration_diamond_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, "regeneration_diamond_leggings");
	public static Item regeneration_diamond_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, "regeneration_diamond_boots");
        
	public static Item strong_regeneration_leather_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, 200, 1, "strong_regeneration_leather_helmet");
	public static Item strong_regeneration_leather_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, 200, 1, "strong_regeneration_leather_chestplate");
	public static Item strong_regeneration_leather_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, 200, 1, "strong_regeneration_leather_leggings");
	public static Item strong_regeneration_leather_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, 200, 1, "strong_regeneration_leather_boots");
	public static Item strong_regeneration_chainmail_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, 200, 1, "strong_regeneration_chainmail_helmet");
	public static Item strong_regeneration_chainmail_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, 200, 1, "strong_regeneration_chainmail_chestplate");
	public static Item strong_regeneration_chainmail_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, 200, 1, "strong_regeneration_chainmail_leggings");
	public static Item strong_regeneration_chainmail_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, 200, 1, "strong_regeneration_chainmail_boots");
	public static Item strong_regeneration_iron_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, 200, 1, "strong_regeneration_iron_helmet");
	public static Item strong_regeneration_iron_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, 200, 1, "strong_regeneration_iron_chestplate");
	public static Item strong_regeneration_iron_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, 200, 1, "strong_regeneration_iron_leggings");
	public static Item strong_regeneration_iron_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, 200, 1, "strong_regeneration_iron_boots");
	public static Item strong_regeneration_golden_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, 200, 1, "strong_regeneration_golden_helmet");
	public static Item strong_regeneration_golden_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, 200, 1, "strong_regeneration_golden_chestplate");
	public static Item strong_regeneration_golden_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, 200, 1, "strong_regeneration_golden_leggings");
	public static Item strong_regeneration_golden_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, 200, 1, "strong_regeneration_golden_boots");
	public static Item strong_regeneration_diamond_helmet = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, 200, 1, "strong_regeneration_diamond_helmet");
	public static Item strong_regeneration_diamond_chestplate = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, 200, 1, "strong_regeneration_diamond_chestplate");
	public static Item strong_regeneration_diamond_leggings = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, 200, 1, "strong_regeneration_diamond_leggings");
	public static Item strong_regeneration_diamond_boots = new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, 200, 1, "strong_regeneration_diamond_boots");

	public static Item regeneration_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.REGENERATION, "regeneration_wooden_sword");
	public static Item regeneration_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.REGENERATION, "regeneration_stone_sword");
	public static Item regeneration_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.REGENERATION, "regeneration_iron_sword");
	public static Item regeneration_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.REGENERATION, "regeneration_golden_sword");
	public static Item regeneration_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.REGENERATION, "regeneration_diamond_sword");
		
	public static Item strong_regeneration_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.REGENERATION, 200, 1, "strong_regeneration_wooden_sword");
	public static Item strong_regeneration_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.REGENERATION, 200, 1, "strong_regeneration_stone_sword");
	public static Item strong_regeneration_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.REGENERATION, 200, 1, "strong_regeneration_iron_sword");
	public static Item strong_regeneration_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.REGENERATION, 200, 1, "strong_regeneration_golden_sword");
	public static Item strong_regeneration_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.REGENERATION, 200, 1, "strong_regeneration_diamond_sword");
	
	public static void init() {
		System.out.println("Initialising: Regeneration Items");
	}
}