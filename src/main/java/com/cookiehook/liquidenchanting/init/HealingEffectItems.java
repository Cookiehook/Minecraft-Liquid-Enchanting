package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionSword;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import org.apache.logging.log4j.Logger;

public class HealingEffectItems {

    public static Item healing_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.INSTANT_HEALTH, 1, 0, "healing_wooden_sword");
    public static Item healing_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.INSTANT_HEALTH, 1, 0, "healing_stone_sword");
    public static Item healing_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.INSTANT_HEALTH, 1, 0, "healing_iron_sword");
    public static Item healing_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.INSTANT_HEALTH, 1, 0, "healing_golden_sword");
    public static Item healing_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.INSTANT_HEALTH, 1, 0, "healing_diamond_sword");

    public static Item healingII_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, MobEffects.INSTANT_HEALTH, 1, 1, "healingII_wooden_sword");
    public static Item healingII_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, MobEffects.INSTANT_HEALTH, 1, 1, "healingII_stone_sword");
    public static Item healingII_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, MobEffects.INSTANT_HEALTH, 1, 1, "healingII_iron_sword");
    public static Item healingII_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, MobEffects.INSTANT_HEALTH, 1, 1, "healingII_golden_sword");
    public static Item healingII_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.DIAMOND, MobEffects.INSTANT_HEALTH, 1, 1, "healingII_diamond_sword");

    public static void init(Logger logger) {
        logger.info("Initialising: Healing Items");
    }
}