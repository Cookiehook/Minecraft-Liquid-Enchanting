package com.cookiehook.liquidenchanting.recipes;

import static net.minecraftforge.oredict.RecipeSorter.Category.SHAPED;

import com.cookiehook.liquidenchanting.util.Config;
import com.cookiehook.liquidenchanting.util.ShapedArmorUpgradeRecipe;

import net.minecraftforge.oredict.RecipeSorter;

public class ModRecipes {

	public static void registerRecipes() {
		registerRecipeClasses();
		// Check the configuration file to decide which recipes to enable.
		if(Config.enableFireResistanceArmor) FireResistanceEffectRecipes.addArmorRecipes();
		if(Config.enableHasteArmor) HasteEffectRecipes.addArmorRecipes();
		if(Config.enableInvisibilityArmor) InvisibilityEffectRecipes.addArmorRecipes();
		if(Config.enableJumpBoostArmor) JumpBoostEffectRecipes.addArmorRecipes();
		if(Config.enableNightVisionArmor) NightVisionEffectRecipes.addArmorRecipes();
		if(Config.enablePoisonArmor) PoisonEffectRecipes.addArmorRecipes();
		if(Config.enableRegenerationArmor) RegenerationEffectRecipes.addArmorRecipes();
		if(Config.enableResistanceArmor) ResistanceEffectRecipes.addArmorRecipes();
		if(Config.enableSlownessArmor) SlownessEffectRecipes.addArmorRecipes();
		if(Config.enableSpeedArmor) SpeedEffectRecipes.addArmorRecipes();
		if(Config.enableStrengthArmor) StrengthEffectRecipes.addArmorRecipes();
		if(Config.enableWaterBreathingArmor) WaterBreathingEffectRecipes.addArmorRecipes();
		if(Config.enableWeaknessArmor) WeaknessEffectRecipes.addArmorRecipes();
				
		if(Config.enableFireResistanceSword) FireResistanceEffectRecipes.addSwordRecipes();
		if(Config.enableHarmingSword) HarmingEffectRecipes.addSwordRecipes();
		if(Config.enableHasteSword) HasteEffectRecipes.addSwordRecipes();
		if(Config.enableHealingSword) HealingEffectRecipes.addSwordRecipes();
		if(Config.enableInvisibilitySword) InvisibilityEffectRecipes.addSwordRecipes();
		if(Config.enableJumpBoostSword) JumpBoostEffectRecipes.addSwordRecipes();
		if(Config.enableNightVisionSword) NightVisionEffectRecipes.addSwordRecipes();
		if(Config.enablePoisonSword) PoisonEffectRecipes.addSwordRecipes();
		if(Config.enableRegenerationSword) RegenerationEffectRecipes.addSwordRecipes();
		if(Config.enableResistanceSword) ResistanceEffectRecipes.addSwordRecipes();
		if(Config.enableSlownessSword) SlownessEffectRecipes.addSwordRecipes();
		if(Config.enableSpeedSword) SpeedEffectRecipes.addSwordRecipes();
		if(Config.enableStrengthSword) StrengthEffectRecipes.addSwordRecipes();
		if(Config.enableWaterBreathingSword) WaterBreathingEffectRecipes.addSwordRecipes();
		if(Config.enableWeaknessSword) WeaknessEffectRecipes.addSwordRecipes();
	}

	private static void registerRecipeClasses() {
		RecipeSorter.register("liquidenchanting:shapedarmourupgrade", ShapedArmorUpgradeRecipe.class, SHAPED,
				"after:forge:shapedore before:minecraft:shapeless");
	}
}
