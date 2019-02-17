package com.cookiehook.liquidenchanting.util;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class Config {

    private static Configuration config;
    public static boolean combinedCraftingEnabled, instantEffectEnabled;
    public static int weaponEffectTime;
    public static String[] disabledPotions;

    public static void init(File file) {
        config = new Configuration(file);
        syncConfig();
    }

    private static void syncConfig() {
        String category;
        category = "General";
        config.addCustomCategoryComment(category, "General configuration for " + Reference.MOD_NAME);
        weaponEffectTime = config.getInt("Weapon Effect Time", category, 10, 1, 60,
                                "How long (in seconds) to effect entities when hit with a potion fused weapon") * 20;
        combinedCraftingEnabled = config.getBoolean("Enable Combined Crafting", category, false, "Set to True to allow combined potions to be used as ingredients");
        instantEffectEnabled = config.getBoolean("Enable Instant Effect", category, false, "Set to True to allow 'instant' effects like health / damage to be applied to armor. " +
                "Warning: This is probably overpowered, and certainly hilarious");

        disabledPotions = config.getStringList("Disabled Potions", category, new String[] {"minecraft:luck", "liquidenchanting:example_potion"}, "Potions to be disabled. " +
                "Search for '[" + Reference.MOD_ID  + "]: Registry names for all potions' in logs to see list of all possible names");

        config.save();
    }
}