package com.cookiehook.liquidenchanting.util;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class Config {

	public static Configuration config;

	public static boolean enableFireResistanceArmor, enableHasteArmor, enableInvisibilityArmor, enableJumpBoostArmor, enableNightVisionArmor,
			enablePoisonArmor, enableRegenerationArmor, enableResistanceArmor, enableSlownessArmor, enableSpeedArmor, enableStrengthArmor,
			enableWaterBreathingArmor, enableWeaknessArmor, enableFireResistanceSword, enableHarmingSword, enableHasteSword, enableHealingSword,
			enableInvisibilitySword, enableJumpBoostSword, enableNightVisionSword, enablePoisonSword, enableRegenerationSword, enableResistanceSword,
			enableSlownessSword, enableSpeedSword, enableStrengthSword, enableWaterBreathingSword, enableWeaknessSword;

	public static void init(File file) {
		config = new Configuration(file);
		syncConfig();
	}

	public static void syncConfig() {
		String category;
		category = "Armor Recipes";
		config.addCustomCategoryComment(category, "Whether to allow crafting of each armor type");

		enableFireResistanceArmor = config.getBoolean("Fire Resistance Armor", category, true, "");
		enableHasteArmor = config.getBoolean("Haste Armor", category, true, "");
		enableInvisibilityArmor = config.getBoolean("Invisibility Armor", category, true, "");
		enableJumpBoostArmor = config.getBoolean("Jump Boost Armor", category, true, "");
		enableNightVisionArmor = config.getBoolean("Night Vision Armor", category, true, "");
		enablePoisonArmor = config.getBoolean("Poison Armor", category, true, "");
		enableRegenerationArmor = config.getBoolean("Regeneration Armor", category, true, "");
		enableResistanceArmor = config.getBoolean("Resistance Armor", category, true, "");
		enableSlownessArmor = config.getBoolean("Slowness Armor", category, true, "");
		enableSpeedArmor = config.getBoolean("Speed Armor", category, true, "");
		enableStrengthArmor = config.getBoolean("Strength Armor", category, true, "");
		enableWaterBreathingArmor = config.getBoolean("Water Breathing Armor", category, true, "");
		enableWeaknessArmor = config.getBoolean("Weakness Armor", category, true, "");

		category = "Sword Recipes";
		config.addCustomCategoryComment(category, "Whether to allow crafting of each sword type");

		enableFireResistanceSword = config.getBoolean("Fire Resistance Sword", category, true, "");
		enableHarmingSword = config.getBoolean("Harming Sword", category, true, "");
		enableHasteSword = config.getBoolean("Haste Sword", category, true, "");
		enableHealingSword = config.getBoolean("Healing Sword", category, true, "");
		enableInvisibilitySword = config.getBoolean("Invisibility Sword", category, true, "");
		enableJumpBoostSword = config.getBoolean("Jump Boost Sword", category, true, "");
		enableNightVisionSword = config.getBoolean("Night Vision Sword", category, true, "");
		enablePoisonSword = config.getBoolean("Poison Sword", category, true, "");
		enableRegenerationSword = config.getBoolean("Regeneration Sword", category, true, "");
		enableResistanceSword = config.getBoolean("Resistance Sword", category, true, "");
		enableSlownessSword = config.getBoolean("Slowness Sword", category, true, "");
		enableSpeedSword = config.getBoolean("Speed Sword", category, true, "");
		enableStrengthSword = config.getBoolean("Strength Sword", category, true, "");
		enableWaterBreathingSword = config.getBoolean("Water Breathing Sword", category, true, "");
		enableWeaknessSword = config.getBoolean("Weakness Sword", category, true, "");

		config.save();
	}
}
