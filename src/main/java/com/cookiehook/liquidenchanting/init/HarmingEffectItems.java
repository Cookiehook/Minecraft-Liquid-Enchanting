package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionSword;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import org.apache.logging.log4j.Logger;

public class HarmingEffectItems {

    public static Item harming_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.INSTANT_DAMAGE, 1, 0, "harming_wooden_sword");
    public static Item harming_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.INSTANT_DAMAGE, 1, 0, "harming_stone_sword");
    public static Item harming_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.INSTANT_DAMAGE, 1, 0, "harming_iron_sword");
    public static Item harming_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.INSTANT_DAMAGE, 1, 0, "harming_golden_sword");
    public static Item harming_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.INSTANT_DAMAGE, 1, 0, "harming_diamond_sword");

    public static Item harmingII_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.INSTANT_DAMAGE, 1, 1, "harmingII_wooden_sword");
    public static Item harmingII_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.INSTANT_DAMAGE, 1, 1, "harmingII_stone_sword");
    public static Item harmingII_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.INSTANT_DAMAGE, 1, 1, "harmingII_iron_sword");
    public static Item harmingII_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.INSTANT_DAMAGE, 1, 1, "harmingII_golden_sword");
    public static Item harmingII_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.INSTANT_DAMAGE, 1, 1, "harmingII_diamond_sword");

    public static void init(Logger logger) {
        System.out.println("Initialising: Harming Items");
    }
}