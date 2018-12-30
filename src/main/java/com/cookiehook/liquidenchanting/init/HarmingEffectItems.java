package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionSword;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemTool;

class HarmingEffectItems {

    static void registerItems() {
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.INSTANT_DAMAGE, 1, 0, "harming_wooden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.INSTANT_DAMAGE, 1, 0, "harming_stone_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.INSTANT_DAMAGE, 1, 0, "harming_iron_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.INSTANT_DAMAGE, 1, 0, "harming_golden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.INSTANT_DAMAGE, 1, 0, "harming_diamond_sword"));

        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.INSTANT_DAMAGE, 1, 1, "strong_harming_wooden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.INSTANT_DAMAGE, 1, 1, "strong_harming_stone_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.INSTANT_DAMAGE, 1, 1, "strong_harming_iron_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.INSTANT_DAMAGE, 1, 1, "strong_harming_golden_sword"));
        ModItems.itemList.add(new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.INSTANT_DAMAGE, 1, 1, "strong_harming_diamond_sword"));
    }
}
