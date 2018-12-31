package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionSword;

import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;

public class FireResistanceEffectItems {
	
	public static Item fire_resistance_leather_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.HEAD, MobEffects.FIRE_RESISTANCE, "fire_resistance_leather_helmet");
	public static Item fire_resistance_leather_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.CHEST, MobEffects.FIRE_RESISTANCE, "fire_resistance_leather_chestplate");
	public static Item fire_resistance_leather_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.LEGS, MobEffects.FIRE_RESISTANCE, "fire_resistance_leather_leggings");
	public static Item fire_resistance_leather_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.FEET, MobEffects.FIRE_RESISTANCE, "fire_resistance_leather_boots");
	public static Item fire_resistance_chainmail_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.HEAD, MobEffects.FIRE_RESISTANCE, "fire_resistance_chainmail_helmet");
	public static Item fire_resistance_chainmail_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.CHEST, MobEffects.FIRE_RESISTANCE, "fire_resistance_chainmail_chestplate");
	public static Item fire_resistance_chainmail_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.LEGS, MobEffects.FIRE_RESISTANCE, "fire_resistance_chainmail_leggings");
	public static Item fire_resistance_chainmail_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.FEET, MobEffects.FIRE_RESISTANCE, "fire_resistance_chainmail_boots");
	public static Item fire_resistance_iron_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, EntityEquipmentSlot.HEAD, MobEffects.FIRE_RESISTANCE, "fire_resistance_iron_helmet");
	public static Item fire_resistance_iron_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, EntityEquipmentSlot.CHEST, MobEffects.FIRE_RESISTANCE, "fire_resistance_iron_chestplate");
	public static Item fire_resistance_iron_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, EntityEquipmentSlot.LEGS, MobEffects.FIRE_RESISTANCE, "fire_resistance_iron_leggings");
	public static Item fire_resistance_iron_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, EntityEquipmentSlot.FEET, MobEffects.FIRE_RESISTANCE, "fire_resistance_iron_boots");
	public static Item fire_resistance_golden_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, EntityEquipmentSlot.HEAD, MobEffects.FIRE_RESISTANCE, "fire_resistance_golden_helmet");
	public static Item fire_resistance_golden_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, EntityEquipmentSlot.CHEST, MobEffects.FIRE_RESISTANCE, "fire_resistance_golden_chestplate");
	public static Item fire_resistance_golden_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, EntityEquipmentSlot.LEGS, MobEffects.FIRE_RESISTANCE, "fire_resistance_golden_leggings");
	public static Item fire_resistance_golden_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, EntityEquipmentSlot.FEET, MobEffects.FIRE_RESISTANCE, "fire_resistance_golden_boots");
	public static Item fire_resistance_diamond_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, EntityEquipmentSlot.HEAD, MobEffects.FIRE_RESISTANCE, "fire_resistance_diamond_helmet");
	public static Item fire_resistance_diamond_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, EntityEquipmentSlot.CHEST, MobEffects.FIRE_RESISTANCE, "fire_resistance_diamond_chestplate");
	public static Item fire_resistance_diamond_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, EntityEquipmentSlot.LEGS, MobEffects.FIRE_RESISTANCE, "fire_resistance_diamond_leggings");
	public static Item fire_resistance_diamond_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, EntityEquipmentSlot.FEET, MobEffects.FIRE_RESISTANCE, "fire_resistance_diamond_boots");
	
	public static Item fire_resistance_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.FIRE_RESISTANCE, "fire_resistance_wooden_sword");
	public static Item fire_resistance_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.FIRE_RESISTANCE, "fire_resistance_stone_sword");
	public static Item fire_resistance_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.FIRE_RESISTANCE, "fire_resistance_iron_sword");
	public static Item fire_resistance_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.FIRE_RESISTANCE, "fire_resistance_golden_sword");
	public static Item fire_resistance_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.FIRE_RESISTANCE, "fire_resistance_diamond_sword");

	public static void init() {
		System.out.println("Initialising: Fire Resistance Items");
	}
}