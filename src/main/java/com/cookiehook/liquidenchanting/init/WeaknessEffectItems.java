package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionSword;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;

class WeaknessEffectItems {

    static void registerItems() {
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD, MobEffects.WEAKNESS, "weakness_leather_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST, MobEffects.WEAKNESS, "weakness_leather_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS, MobEffects.WEAKNESS, "weakness_leather_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET, MobEffects.WEAKNESS, "weakness_leather_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, MobEffects.WEAKNESS, "weakness_chainmail_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, MobEffects.WEAKNESS, "weakness_chainmail_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, MobEffects.WEAKNESS, "weakness_chainmail_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.FEET, MobEffects.WEAKNESS, "weakness_chainmail_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, MobEffects.WEAKNESS, "weakness_iron_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, MobEffects.WEAKNESS, "weakness_iron_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, MobEffects.WEAKNESS, "weakness_iron_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, MobEffects.WEAKNESS, "weakness_iron_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, MobEffects.WEAKNESS, "weakness_golden_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, MobEffects.WEAKNESS, "weakness_golden_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.LEGS, MobEffects.WEAKNESS, "weakness_golden_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.FEET, MobEffects.WEAKNESS, "weakness_golden_boots"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, MobEffects.WEAKNESS, "weakness_diamond_helmet"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, MobEffects.WEAKNESS, "weakness_diamond_chestplate"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, MobEffects.WEAKNESS, "weakness_diamond_leggings"));
        ModItems.itemList.add(new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, MobEffects.WEAKNESS, "weakness_diamond_boots"));

        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.WEAKNESS, "weakness_wooden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.WEAKNESS, "weakness_stone_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.WEAKNESS, "weakness_iron_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.WEAKNESS, "weakness_golden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.WEAKNESS, "weakness_diamond_sword"));
    }
}
