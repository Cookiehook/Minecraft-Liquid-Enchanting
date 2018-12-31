package com.cookiehook.liquidenchanting.util;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.common.config.Configuration;

public class Config {

    private static Configuration config;
    public static Map<String, Boolean> configMap = new HashMap<String, Boolean>();

    public static void init(File file) {
        config = new Configuration(file);
        syncConfig();
    }

    /***
     * Reads / Creates the configuration file.
     * All options are stored in a dictionary, with their name as key and boolean value as the value. This map
     * is used when checking recipe matches during crafting.
     */
    private static void syncConfig() {
        String category;
        category = "Armor Recipes";
        config.addCustomCategoryComment(category, "Whether to allow crafting of each armor type");

        configMap.put("fire_resistance_armor", config.getBoolean("Fire Resistance Armor", category, true, ""));
        configMap.put("haste_armor", config.getBoolean("Haste Armor", category, true, ""));
        configMap.put("strong_haste_armor", config.getBoolean("Strong Haste Armor", category, true, ""));
        configMap.put("invisibility_armor", config.getBoolean("Invisibility Armor", category, true, ""));
        configMap.put("jump_boost_armor", config.getBoolean("Jump Boost Armor", category, true, ""));
        configMap.put("night_vision_armor", config.getBoolean("Night Vision Armor", category, true, ""));
        configMap.put("poison_armor", config.getBoolean("Poison Armor", category, true, ""));
        configMap.put("strong_poison_armor", config.getBoolean("Strong Poison Armor", category, true, ""));
        configMap.put("regeneration_armor", config.getBoolean("Regeneration Armor", category, true, ""));
        configMap.put("strong_regeneration_armor", config.getBoolean("Strong Regeneration Armor", category, true, ""));
        configMap.put("resistance_armor", config.getBoolean("Resistance Armor", category, true, ""));
        configMap.put("strong_resistance_armor", config.getBoolean("Strong Resistance Armor", category, true, ""));
        configMap.put("slowness_armor", config.getBoolean("Slowness Armor", category, true, ""));
        configMap.put("swiftness_armor", config.getBoolean("Speed Armor", category, true, ""));
        configMap.put("strong_swiftness_armor", config.getBoolean("Strong Speed Armor", category, true, ""));
        configMap.put("strength_armor", config.getBoolean("Strength Armor", category, true, ""));
        configMap.put("strong_strength_armor", config.getBoolean("Strong Strength Armor", category, true, ""));
        configMap.put("water_breathing_armor", config.getBoolean("Water Breathing Armor", category, true, ""));
        configMap.put("weakness_armor", config.getBoolean("Weakness Armor", category, true, ""));

        category = "Sword Recipes";
        config.addCustomCategoryComment(category, "Whether to allow crafting of each sword type");

        configMap.put("fire_resistance_sword", config.getBoolean("Fire Resistance Sword", category, true, ""));
        configMap.put("harming_sword", config.getBoolean("Harming Sword", category, true, ""));
        configMap.put("strong_harming_sword", config.getBoolean("Strong Harming Sword", category, true, ""));
        configMap.put("haste_sword", config.getBoolean("Haste Sword", category, true, ""));
        configMap.put("strong_haste_sword", config.getBoolean("Strong Haste Sword", category, true, ""));
        configMap.put("healing_sword", config.getBoolean("Healing Sword", category, true, ""));
        configMap.put("strong_healing_sword", config.getBoolean("Strong Healing Sword", category, true, ""));
        configMap.put("invisibility_sword", config.getBoolean("Invisibility Sword", category, true, ""));
        configMap.put("jump_boost_sword", config.getBoolean("Jump Boost Sword", category, true, ""));
        configMap.put("night_vision_sword", config.getBoolean("Night Vision Sword", category, true, ""));
        configMap.put("poison_sword", config.getBoolean("Poison Sword", category, true, ""));
        configMap.put("strong_poison_sword", config.getBoolean("Strong Poison Sword", category, true, ""));
        configMap.put("regeneration_sword", config.getBoolean("Regeneration Sword", category, true, ""));
        configMap.put("strong_regeneration_sword", config.getBoolean("Strong Regeneration Sword", category, true, ""));
        configMap.put("resistance_sword", config.getBoolean("Resistance Sword", category, true, ""));
        configMap.put("strong_resistance_sword", config.getBoolean("Strong Resistance Sword", category, true, ""));
        configMap.put("slowness_sword", config.getBoolean("Slowness Sword", category, true, ""));
        configMap.put("swiftness_sword", config.getBoolean("Speed Sword", category, true, ""));
        configMap.put("strong_swiftness_sword", config.getBoolean("Strong Speed Sword", category, true, ""));
        configMap.put("strength_sword", config.getBoolean("Strength Sword", category, true, ""));
        configMap.put("strong_strength_sword", config.getBoolean("Strong Strength Sword", category, true, ""));
        configMap.put("water_breathing_sword", config.getBoolean("Water Breathing Sword", category, true, ""));
        configMap.put("weakness_sword", config.getBoolean("Weakness Sword", category, true, ""));

        config.save();
    }
}