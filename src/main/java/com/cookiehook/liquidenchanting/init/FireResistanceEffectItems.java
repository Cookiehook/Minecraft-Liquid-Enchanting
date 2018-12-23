package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionArmor;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import org.apache.logging.log4j.Logger;

public class FireResistanceEffectItems {

    public static Item fireResistance_leather_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD, MobEffects.FIRE_RESISTANCE, "fireResistance_leather_helmet");
    public static Item fireResistance_leather_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST, MobEffects.FIRE_RESISTANCE, "fireResistance_leather_chestplate");
    public static Item fireResistance_leather_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS, MobEffects.FIRE_RESISTANCE, "fireResistance_leather_leggings");
    public static Item fireResistance_leather_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET, MobEffects.FIRE_RESISTANCE, "fireResistance_leather_boots");
    public static Item fireResistance_chain_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, MobEffects.FIRE_RESISTANCE, "fireResistance_chain_helmet");
    public static Item fireResistance_chain_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, MobEffects.FIRE_RESISTANCE, "fireResistance_chain_chestplate");
    public static Item fireResistance_chain_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, MobEffects.FIRE_RESISTANCE, "fireResistance_chain_leggings");
    public static Item fireResistance_chain_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.FEET, MobEffects.FIRE_RESISTANCE, "fireResistance_chain_boots");
    public static Item fireResistance_iron_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, MobEffects.FIRE_RESISTANCE, "fireResistance_iron_helmet");
    public static Item fireResistance_iron_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, MobEffects.FIRE_RESISTANCE, "fireResistance_iron_chestplate");
    public static Item fireResistance_iron_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, MobEffects.FIRE_RESISTANCE, "fireResistance_iron_leggings");
    public static Item fireResistance_iron_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, MobEffects.FIRE_RESISTANCE, "fireResistance_iron_boots");
    public static Item fireResistance_golden_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, MobEffects.FIRE_RESISTANCE, "fireResistance_golden_helmet");
    public static Item fireResistance_golden_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, MobEffects.FIRE_RESISTANCE, "fireResistance_golden_chestplate");
    public static Item fireResistance_golden_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.LEGS, MobEffects.FIRE_RESISTANCE, "fireResistance_golden_leggings");
    public static Item fireResistance_golden_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.FEET, MobEffects.FIRE_RESISTANCE, "fireResistance_golden_boots");
    public static Item fireResistance_diamond_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, MobEffects.FIRE_RESISTANCE, "fireResistance_diamond_helmet");
    public static Item fireResistance_diamond_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, MobEffects.FIRE_RESISTANCE, "fireResistance_diamond_chestplate");
    public static Item fireResistance_diamond_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, MobEffects.FIRE_RESISTANCE, "fireResistance_diamond_leggings");
    public static Item fireResistance_diamond_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, MobEffects.FIRE_RESISTANCE, "fireResistance_diamond_boots");

//    public static Item fireResistance_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.FIRE_RESISTANCE, "fireResistance_wooden_sword");
//    public static Item fireResistance_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.FIRE_RESISTANCE, "fireResistance_stone_sword");
//    public static Item fireResistance_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.FIRE_RESISTANCE, "fireResistance_iron_sword");
//    public static Item fireResistance_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.FIRE_RESISTANCE, "fireResistance_golden_sword");
//    public static Item fireResistance_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.FIRE_RESISTANCE, "fireResistance_diamond_sword");

    public static void init(Logger logger) {
        System.out.println("Initialising: Fire Resistance Items");
    }
}
