package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionSword;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;

class NightVisionEffectItems {

    static void registerItems() {
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD, MobEffects.NIGHT_VISION, "night_vision_leather_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST, MobEffects.NIGHT_VISION, "night_vision_leather_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS, MobEffects.NIGHT_VISION, "night_vision_leather_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET, MobEffects.NIGHT_VISION, "night_vision_leather_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, MobEffects.NIGHT_VISION, "night_vision_chainmail_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, MobEffects.NIGHT_VISION, "night_vision_chainmail_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, MobEffects.NIGHT_VISION, "night_vision_chainmail_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.FEET, MobEffects.NIGHT_VISION, "night_vision_chainmail_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, MobEffects.NIGHT_VISION, "night_vision_iron_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, MobEffects.NIGHT_VISION, "night_vision_iron_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, MobEffects.NIGHT_VISION, "night_vision_iron_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, MobEffects.NIGHT_VISION, "night_vision_iron_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, MobEffects.NIGHT_VISION, "night_vision_golden_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, MobEffects.NIGHT_VISION, "night_vision_golden_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.LEGS, MobEffects.NIGHT_VISION, "night_vision_golden_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.FEET, MobEffects.NIGHT_VISION, "night_vision_golden_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, MobEffects.NIGHT_VISION, "night_vision_diamond_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, MobEffects.NIGHT_VISION, "night_vision_diamond_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, MobEffects.NIGHT_VISION, "night_vision_diamond_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, MobEffects.NIGHT_VISION, "night_vision_diamond_boots"));

        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.NIGHT_VISION, "night_vision_wooden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.NIGHT_VISION, "night_vision_stone_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.NIGHT_VISION, "night_vision_iron_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.NIGHT_VISION, "night_vision_golden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.NIGHT_VISION, "night_vision_diamond_sword"));
    }
}
