package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionArmor;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

import org.apache.logging.log4j.Logger;

public class InvisibilityEffectItems {

    public static Item invisibility_leather_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD, MobEffects.INVISIBILITY, "invisibility_leather_helmet");
    public static Item invisibility_leather_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST, MobEffects.INVISIBILITY, "invisibility_leather_chestplate");
    public static Item invisibility_leather_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS, MobEffects.INVISIBILITY, "invisibility_leather_leggings");
    public static Item invisibility_leather_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET, MobEffects.INVISIBILITY, "invisibility_leather_boots");
    public static Item invisibility_chain_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, MobEffects.INVISIBILITY, "invisibility_chain_helmet");
    public static Item invisibility_chain_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, MobEffects.INVISIBILITY, "invisibility_chain_chestplate");
    public static Item invisibility_chain_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, MobEffects.INVISIBILITY, "invisibility_chain_leggings");
    public static Item invisibility_chain_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.FEET, MobEffects.INVISIBILITY, "invisibility_chain_boots");
    public static Item invisibility_iron_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, MobEffects.INVISIBILITY, "invisibility_iron_helmet");
    public static Item invisibility_iron_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, MobEffects.INVISIBILITY, "invisibility_iron_chestplate");
    public static Item invisibility_iron_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, MobEffects.INVISIBILITY, "invisibility_iron_leggings");
    public static Item invisibility_iron_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, MobEffects.INVISIBILITY, "invisibility_iron_boots");
    public static Item invisibility_golden_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, MobEffects.INVISIBILITY, "invisibility_golden_helmet");
    public static Item invisibility_golden_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, MobEffects.INVISIBILITY, "invisibility_golden_chestplate");
    public static Item invisibility_golden_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.LEGS, MobEffects.INVISIBILITY, "invisibility_golden_leggings");
    public static Item invisibility_golden_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.FEET, MobEffects.INVISIBILITY, "invisibility_golden_boots");
    public static Item invisibility_diamond_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, MobEffects.INVISIBILITY, "invisibility_diamond_helmet");
    public static Item invisibility_diamond_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, MobEffects.INVISIBILITY, "invisibility_diamond_chestplate");
    public static Item invisibility_diamond_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, MobEffects.INVISIBILITY, "invisibility_diamond_leggings");
    public static Item invisibility_diamond_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, MobEffects.INVISIBILITY, "invisibility_diamond_boots");

//    public static Item invisibility_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.INVISIBILITY, "invisibility_wooden_sword");
//    public static Item invisibility_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.INVISIBILITY, "invisibility_stone_sword");
//    public static Item invisibility_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.INVISIBILITY, "invisibility_iron_sword");
//    public static Item invisibility_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.INVISIBILITY, "invisibility_golden_sword");
//    public static Item invisibility_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.INVISIBILITY, "invisibility_diamond_sword");

    public static void init(Logger logger) {
        logger.info("Initialising: Invisibility Items");
    }
}
