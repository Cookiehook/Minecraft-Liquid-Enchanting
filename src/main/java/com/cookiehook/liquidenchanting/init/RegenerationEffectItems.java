package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemDecrementingPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionSword;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;

class RegenerationEffectItems {

    static void registerItems() {
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, "regeneration_leather_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, "regeneration_leather_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, "regeneration_leather_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, "regeneration_leather_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, "regeneration_chainmail_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, "regeneration_chainmail_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, "regeneration_chainmail_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, "regeneration_chainmail_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, "regeneration_iron_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, "regeneration_iron_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, "regeneration_iron_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, "regeneration_iron_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, "regeneration_golden_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, "regeneration_golden_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, "regeneration_golden_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, "regeneration_golden_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, "regeneration_diamond_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, "regeneration_diamond_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, "regeneration_diamond_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, "regeneration_diamond_boots"));

        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, 1, "strong_regeneration_leather_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, 1, "strong_regeneration_leather_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, 1, "strong_regeneration_leather_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, 1, "strong_regeneration_leather_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, 1, "strong_regeneration_chainmail_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, 1, "strong_regeneration_chainmail_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, 1, "strong_regeneration_chainmail_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, 1, "strong_regeneration_chainmail_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, 1, "strong_regeneration_iron_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, 1, "strong_regeneration_iron_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, 1, "strong_regeneration_iron_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, 1, "strong_regeneration_iron_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, 1, "strong_regeneration_golden_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, 1, "strong_regeneration_golden_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, 1, "strong_regeneration_golden_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, 1, "strong_regeneration_golden_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, MobEffects.REGENERATION, 1, "strong_regeneration_diamond_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, MobEffects.REGENERATION, 1, "strong_regeneration_diamond_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, MobEffects.REGENERATION, 1, "strong_regeneration_diamond_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, MobEffects.REGENERATION, 1, "strong_regeneration_diamond_boots"));

        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.REGENERATION, "regeneration_wooden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.REGENERATION, "regeneration_stone_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.REGENERATION, "regeneration_iron_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.REGENERATION, "regeneration_golden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.REGENERATION, "regeneration_diamond_sword"));

        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.REGENERATION, 1, "strong_regeneration_wooden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.REGENERATION, 1, "strong_regeneration_stone_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.REGENERATION, 1, "strong_regeneration_iron_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.REGENERATION, 1, "strong_regeneration_golden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.REGENERATION, 1, "strong_regeneration_diamond_sword"));
    }
}
