package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionSword;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;

class ResistanceEffectItems {

    static void registerItems() {
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD, MobEffects.RESISTANCE, "resistance_leather_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST, MobEffects.RESISTANCE, "resistance_leather_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS, MobEffects.RESISTANCE, "resistance_leather_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET, MobEffects.RESISTANCE, "resistance_leather_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, MobEffects.RESISTANCE, "resistance_chainmail_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, MobEffects.RESISTANCE, "resistance_chainmail_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, MobEffects.RESISTANCE, "resistance_chainmail_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.FEET, MobEffects.RESISTANCE, "resistance_chainmail_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, MobEffects.RESISTANCE, "resistance_iron_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, MobEffects.RESISTANCE, "resistance_iron_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, MobEffects.RESISTANCE, "resistance_iron_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, MobEffects.RESISTANCE, "resistance_iron_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, MobEffects.RESISTANCE, "resistance_golden_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, MobEffects.RESISTANCE, "resistance_golden_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.LEGS, MobEffects.RESISTANCE, "resistance_golden_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.FEET, MobEffects.RESISTANCE, "resistance_golden_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, MobEffects.RESISTANCE, "resistance_diamond_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, MobEffects.RESISTANCE, "resistance_diamond_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, MobEffects.RESISTANCE, "resistance_diamond_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, MobEffects.RESISTANCE, "resistance_diamond_boots"));

        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD, MobEffects.RESISTANCE, 1, "strong_resistance_leather_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST, MobEffects.RESISTANCE, 1, "strong_resistance_leather_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS, MobEffects.RESISTANCE, 1, "strong_resistance_leather_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET, MobEffects.RESISTANCE, 1, "strong_resistance_leather_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, MobEffects.RESISTANCE, 1, "strong_resistance_chainmail_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, MobEffects.RESISTANCE, 1, "strong_resistance_chainmail_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, MobEffects.RESISTANCE, 1, "strong_resistance_chainmail_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.FEET, MobEffects.RESISTANCE, 1, "strong_resistance_chainmail_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, MobEffects.RESISTANCE, 1, "strong_resistance_iron_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, MobEffects.RESISTANCE, 1, "strong_resistance_iron_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, MobEffects.RESISTANCE, 1, "strong_resistance_iron_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, MobEffects.RESISTANCE, 1, "strong_resistance_iron_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, MobEffects.RESISTANCE, 1, "strong_resistance_golden_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, MobEffects.RESISTANCE, 1, "strong_resistance_golden_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.LEGS, MobEffects.RESISTANCE, 1, "strong_resistance_golden_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.FEET, MobEffects.RESISTANCE, 1, "strong_resistance_golden_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, MobEffects.RESISTANCE, 1, "strong_resistance_diamond_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, MobEffects.RESISTANCE, 1, "strong_resistance_diamond_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, MobEffects.RESISTANCE, 1, "strong_resistance_diamond_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, MobEffects.RESISTANCE, 1, "strong_resistance_diamond_boots"));

        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.RESISTANCE, "resistance_wooden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.RESISTANCE, "resistance_stone_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.RESISTANCE, "resistance_iron_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.RESISTANCE, "resistance_golden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.RESISTANCE, "resistance_diamond_sword"));

        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.RESISTANCE, 1, "strong_resistance_wooden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.RESISTANCE, 1, "strong_resistance_stone_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.RESISTANCE, 1, "strong_resistance_iron_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.RESISTANCE, 1, "strong_resistance_golden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.RESISTANCE, 1, "strong_resistance_diamond_sword"));
    }
}
