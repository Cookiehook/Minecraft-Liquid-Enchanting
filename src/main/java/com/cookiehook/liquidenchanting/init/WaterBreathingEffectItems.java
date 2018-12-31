package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionSword;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;

class WaterBreathingEffectItems {

    static void registerItems() {
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD, MobEffects.WATER_BREATHING, "water_breathing_leather_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST, MobEffects.WATER_BREATHING, "water_breathing_leather_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS, MobEffects.WATER_BREATHING, "water_breathing_leather_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET, MobEffects.WATER_BREATHING, "water_breathing_leather_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, MobEffects.WATER_BREATHING, "water_breathing_chainmail_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, MobEffects.WATER_BREATHING, "water_breathing_chainmail_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, MobEffects.WATER_BREATHING, "water_breathing_chainmail_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.FEET, MobEffects.WATER_BREATHING, "water_breathing_chainmail_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, MobEffects.WATER_BREATHING, "water_breathing_iron_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, MobEffects.WATER_BREATHING, "water_breathing_iron_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, MobEffects.WATER_BREATHING, "water_breathing_iron_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, MobEffects.WATER_BREATHING, "water_breathing_iron_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, MobEffects.WATER_BREATHING, "water_breathing_golden_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, MobEffects.WATER_BREATHING, "water_breathing_golden_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.LEGS, MobEffects.WATER_BREATHING, "water_breathing_golden_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.FEET, MobEffects.WATER_BREATHING, "water_breathing_golden_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, MobEffects.WATER_BREATHING, "water_breathing_diamond_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, MobEffects.WATER_BREATHING, "water_breathing_diamond_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, MobEffects.WATER_BREATHING, "water_breathing_diamond_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, MobEffects.WATER_BREATHING, "water_breathing_diamond_boots"));

        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.WATER_BREATHING, "water_breathing_wooden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.WATER_BREATHING, "water_breathing_stone_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.WATER_BREATHING, "water_breathing_iron_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.WATER_BREATHING, "water_breathing_golden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.WATER_BREATHING, "water_breathing_diamond_sword"));
    }
}
