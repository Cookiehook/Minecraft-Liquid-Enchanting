package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemDecrementingPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionSword;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;

class PoisonEffectItems {

    static void registerItems() {
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD, MobEffects.POISON, "poison_leather_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST, MobEffects.POISON, "poison_leather_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS, MobEffects.POISON, "poison_leather_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET, MobEffects.POISON, "poison_leather_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, MobEffects.POISON, "poison_chainmail_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, MobEffects.POISON, "poison_chainmail_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, MobEffects.POISON, "poison_chainmail_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.FEET, MobEffects.POISON, "poison_chainmail_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, MobEffects.POISON, "poison_iron_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, MobEffects.POISON, "poison_iron_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, MobEffects.POISON, "poison_iron_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, MobEffects.POISON, "poison_iron_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, MobEffects.POISON, "poison_golden_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, MobEffects.POISON, "poison_golden_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.LEGS, MobEffects.POISON, "poison_golden_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.FEET, MobEffects.POISON, "poison_golden_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, MobEffects.POISON, "poison_diamond_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, MobEffects.POISON, "poison_diamond_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, MobEffects.POISON, "poison_diamond_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, MobEffects.POISON, "poison_diamond_boots"));

        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD, MobEffects.POISON, 1, "strong_poison_leather_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST, MobEffects.POISON, 1, "strong_poison_leather_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS, MobEffects.POISON, 1, "strong_poison_leather_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET, MobEffects.POISON, 1, "strong_poison_leather_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, MobEffects.POISON, 1, "strong_poison_chainmail_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, MobEffects.POISON, 1, "strong_poison_chainmail_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, MobEffects.POISON, 1, "strong_poison_chainmail_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.FEET, MobEffects.POISON, 1, "strong_poison_chainmail_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, MobEffects.POISON, 1, "strong_poison_iron_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, MobEffects.POISON, 1, "strong_poison_iron_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, MobEffects.POISON, 1, "strong_poison_iron_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, MobEffects.POISON, 1, "strong_poison_iron_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, MobEffects.POISON, 1, "strong_poison_golden_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, MobEffects.POISON, 1, "strong_poison_golden_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.LEGS, MobEffects.POISON, 1, "strong_poison_golden_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.FEET, MobEffects.POISON, 1, "strong_poison_golden_boots"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, MobEffects.POISON, 1, "strong_poison_diamond_helmet"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, MobEffects.POISON, 1, "strong_poison_diamond_chestplate"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, MobEffects.POISON, 1, "strong_poison_diamond_leggings"));
        ModItems.itemList.add(new ItemDecrementingPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, MobEffects.POISON, 1, "strong_poison_diamond_boots"));

        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.POISON, "poison_wooden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.POISON, "poison_stone_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.POISON, "poison_iron_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.POISON, "poison_golden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.POISON, "poison_diamond_sword"));

        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.POISON, 1, "strong_poison_wooden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.POISON, 1, "strong_poison_stone_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.POISON, 1, "strong_poison_iron_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.POISON, 1, "strong_poison_golden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.POISON, 1, "strong_poison_diamond_sword"));
    }
}
