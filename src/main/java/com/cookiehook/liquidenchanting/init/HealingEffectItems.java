package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionSword;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemTool;

class HealingEffectItems {

    static void registerItems() {
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.INSTANT_HEALTH, 1, 0, "healing_wooden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.INSTANT_HEALTH, 1, 0, "healing_stone_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.INSTANT_HEALTH, 1, 0, "healing_iron_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.INSTANT_HEALTH, 1, 0, "healing_golden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.INSTANT_HEALTH, 1, 0, "healing_diamond_sword"));

        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.INSTANT_HEALTH, 1, 1, "strong_healing_wooden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.INSTANT_HEALTH, 1, 1, "strong_healing_stone_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.INSTANT_HEALTH, 1, 1, "strong_healing_iron_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.INSTANT_HEALTH, 1, 1, "strong_healing_golden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.INSTANT_HEALTH, 1, 1, "strong_healing_diamond_sword"));
    }
}
