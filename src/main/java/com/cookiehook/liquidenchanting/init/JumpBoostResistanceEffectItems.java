package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionSword;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;

class JumpBoostResistanceEffectItems {

    static void registerItems() {
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD, MobEffects.JUMP_BOOST, "leaping_leather_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST, MobEffects.JUMP_BOOST, "leaping_leather_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS, MobEffects.JUMP_BOOST, "leaping_leather_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET, MobEffects.JUMP_BOOST, "leaping_leather_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, MobEffects.JUMP_BOOST, "leaping_chainmail_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, MobEffects.JUMP_BOOST, "leaping_chainmail_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, MobEffects.JUMP_BOOST, "leaping_chainmail_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.FEET, MobEffects.JUMP_BOOST, "leaping_chainmail_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, MobEffects.JUMP_BOOST, "leaping_iron_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, MobEffects.JUMP_BOOST, "leaping_iron_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, MobEffects.JUMP_BOOST, "leaping_iron_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, MobEffects.JUMP_BOOST, "leaping_iron_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, MobEffects.JUMP_BOOST, "leaping_golden_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, MobEffects.JUMP_BOOST, "leaping_golden_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.LEGS, MobEffects.JUMP_BOOST, "leaping_golden_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.FEET, MobEffects.JUMP_BOOST, "leaping_golden_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, MobEffects.JUMP_BOOST, "leaping_diamond_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, MobEffects.JUMP_BOOST, "leaping_diamond_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, MobEffects.JUMP_BOOST, "leaping_diamond_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, MobEffects.JUMP_BOOST, "leaping_diamond_boots"));

        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD, MobEffects.JUMP_BOOST, 1, "strong_leaping_leather_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST, MobEffects.JUMP_BOOST, 1, "strong_leaping_leather_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS, MobEffects.JUMP_BOOST, 1, "strong_leaping_leather_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET, MobEffects.JUMP_BOOST, 1, "strong_leaping_leather_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, MobEffects.JUMP_BOOST, 1, "strong_leaping_chainmail_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, MobEffects.JUMP_BOOST, 1, "strong_leaping_chainmail_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, MobEffects.JUMP_BOOST, 1, "strong_leaping_chainmail_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.FEET, MobEffects.JUMP_BOOST, 1, "strong_leaping_chainmail_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, MobEffects.JUMP_BOOST, 1, "strong_leaping_iron_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, MobEffects.JUMP_BOOST, 1, "strong_leaping_iron_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, MobEffects.JUMP_BOOST, 1, "strong_leaping_iron_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, MobEffects.JUMP_BOOST, 1, "strong_leaping_iron_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, MobEffects.JUMP_BOOST, 1, "strong_leaping_golden_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, MobEffects.JUMP_BOOST, 1, "strong_leaping_golden_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.LEGS, MobEffects.JUMP_BOOST, 1, "strong_leaping_golden_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.FEET, MobEffects.JUMP_BOOST, 1, "strong_leaping_golden_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, MobEffects.JUMP_BOOST, 1, "strong_leaping_diamond_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, MobEffects.JUMP_BOOST, 1, "strong_leaping_diamond_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, MobEffects.JUMP_BOOST, 1, "strong_leaping_diamond_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, MobEffects.JUMP_BOOST, 1, "strong_leaping_diamond_boots"));

        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.JUMP_BOOST, "leaping_wooden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.JUMP_BOOST, "leaping_stone_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.JUMP_BOOST, "leaping_iron_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.JUMP_BOOST, "leaping_golden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.JUMP_BOOST, "leaping_diamond_sword"));

        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.JUMP_BOOST, 1, "strong_leaping_wooden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.JUMP_BOOST, 1, "strong_leaping_stone_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.JUMP_BOOST, 1, "strong_leaping_iron_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.JUMP_BOOST, 1, "strong_leaping_golden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.JUMP_BOOST, 1, "strong_leaping_diamond_sword"));
    }
}
