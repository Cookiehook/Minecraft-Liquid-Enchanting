package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionArmor;

import com.cookiehook.liquidenchanting.items.ItemPotionSword;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;
import org.apache.logging.log4j.Logger;

public class NightVisionEffectItems {

    public static Item nightVision_leather_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD, MobEffects.NIGHT_VISION, 210, 0, "nightVision_leather_helmet");
    public static Item nightVision_leather_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST, MobEffects.NIGHT_VISION, 210, 0, "nightVision_leather_chestplate");
    public static Item nightVision_leather_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS, MobEffects.NIGHT_VISION, 210, 0, "nightVision_leather_leggings");
    public static Item nightVision_leather_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET, MobEffects.NIGHT_VISION, 210, 0, "nightVision_leather_boots");
    public static Item nightVision_chain_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, MobEffects.NIGHT_VISION, 210, 0, "nightVision_chain_helmet");
    public static Item nightVision_chain_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, MobEffects.NIGHT_VISION, 210, 0, "nightVision_chain_chestplate");
    public static Item nightVision_chain_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, MobEffects.NIGHT_VISION, 210, 0, "nightVision_chain_leggings");
    public static Item nightVision_chain_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.FEET, MobEffects.NIGHT_VISION, 210, 0, "nightVision_chain_boots");
    public static Item nightVision_iron_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, MobEffects.NIGHT_VISION, 210, 0, "nightVision_iron_helmet");
    public static Item nightVision_iron_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, MobEffects.NIGHT_VISION, 210, 0, "nightVision_iron_chestplate");
    public static Item nightVision_iron_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, MobEffects.NIGHT_VISION, 210, 0, "nightVision_iron_leggings");
    public static Item nightVision_iron_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, MobEffects.NIGHT_VISION, 210, 0, "nightVision_iron_boots");
    public static Item nightVision_golden_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, MobEffects.NIGHT_VISION, 210, 0, "nightVision_golden_helmet");
    public static Item nightVision_golden_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, MobEffects.NIGHT_VISION, 210, 0, "nightVision_golden_chestplate");
    public static Item nightVision_golden_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.LEGS, MobEffects.NIGHT_VISION, 210, 0, "nightVision_golden_leggings");
    public static Item nightVision_golden_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.FEET, MobEffects.NIGHT_VISION, 210, 0, "nightVision_golden_boots");
    public static Item nightVision_diamond_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, MobEffects.NIGHT_VISION, 210, 0, "nightVision_diamond_helmet");
    public static Item nightVision_diamond_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, MobEffects.NIGHT_VISION, 210, 0, "nightVision_diamond_chestplate");
    public static Item nightVision_diamond_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, MobEffects.NIGHT_VISION, 210, 0, "nightVision_diamond_leggings");
    public static Item nightVision_diamond_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, MobEffects.NIGHT_VISION, 210, 0, "nightVision_diamond_boots");

    public static Item nightVision_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.NIGHT_VISION, "nightVision_wooden_sword");
    public static Item nightVision_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.NIGHT_VISION, "nightVision_stone_sword");
    public static Item nightVision_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.NIGHT_VISION, "nightVision_iron_sword");
    public static Item nightVision_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.NIGHT_VISION, "nightVision_golden_sword");
    public static Item nightVision_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.NIGHT_VISION, "nightVision_diamond_sword");

    public static void init(Logger logger) {
        logger.info("Initialising: Night Vision Items");
    }
}