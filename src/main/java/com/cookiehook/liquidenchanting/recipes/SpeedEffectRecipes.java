package com.cookiehook.liquidenchanting.recipes;

import com.cookiehook.liquidenchanting.init.SpeedEffectItems;
import com.cookiehook.liquidenchanting.util.ShapedArmorUpgradeRecipe;

import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class SpeedEffectRecipes {

	public static ItemStack swiftnessPotion = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.SWIFTNESS);
	public static ItemStack strong_swiftnessPotion = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRONG_SWIFTNESS);

	public static void addArmorRecipes() {

		// Speed Armor
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_leather_helmet, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.LEATHER_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_leather_chestplate, "AAA", "ABA", "AAA", 'A',
				swiftnessPotion, 'B', new ItemStack(Items.LEATHER_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_leather_leggings, "AAA", "ABA", "AAA", 'A',
				swiftnessPotion, 'B', new ItemStack(Items.LEATHER_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_leather_boots, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.LEATHER_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_chainmail_helmet, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.CHAINMAIL_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_chainmail_chestplate, "AAA", "ABA", "AAA", 'A',
				swiftnessPotion, 'B', new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_chainmail_leggings, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.CHAINMAIL_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_chainmail_boots, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.CHAINMAIL_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_iron_helmet, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.IRON_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_iron_chestplate, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.IRON_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_iron_leggings, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.IRON_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_iron_boots, "AAA", "ABA", "AAA", 'A', swiftnessPotion, 'B',
				new ItemStack(Items.IRON_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_golden_helmet, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.GOLDEN_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_golden_chestplate, "AAA", "ABA", "AAA", 'A',
				swiftnessPotion, 'B', new ItemStack(Items.GOLDEN_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_golden_leggings, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.GOLDEN_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_golden_boots, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.GOLDEN_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_diamond_helmet, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.DIAMOND_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_diamond_chestplate, "AAA", "ABA", "AAA", 'A',
				swiftnessPotion, 'B', new ItemStack(Items.DIAMOND_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_diamond_leggings, "AAA", "ABA", "AAA", 'A',
				swiftnessPotion, 'B', new ItemStack(Items.DIAMOND_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_diamond_boots, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.DIAMOND_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));

		// Speed II Armor
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_leather_helmet, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.LEATHER_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_leather_chestplate, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.LEATHER_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_leather_leggings, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.LEATHER_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_leather_boots, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.LEATHER_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_chainmail_helmet, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.CHAINMAIL_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_chainmail_chestplate, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_chainmail_leggings, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.CHAINMAIL_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_chainmail_boots, "AAA", "ABA", "AAA", 'A', strong_swiftnessPotion,
				'B', new ItemStack(Items.CHAINMAIL_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_iron_helmet, "AAA", "ABA", "AAA", 'A', strong_swiftnessPotion,
				'B', new ItemStack(Items.IRON_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_iron_chestplate, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.IRON_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_iron_leggings, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.IRON_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_iron_boots, "AAA", "ABA", "AAA", 'A', strong_swiftnessPotion,
				'B', new ItemStack(Items.IRON_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_golden_helmet, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.GOLDEN_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_golden_chestplate, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.GOLDEN_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_golden_leggings, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.GOLDEN_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_golden_boots, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.GOLDEN_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_diamond_helmet, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.DIAMOND_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_diamond_chestplate, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.DIAMOND_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_diamond_leggings, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.DIAMOND_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_diamond_boots, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.DIAMOND_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
	}

	public static void addSwordRecipes() {
		// Speed Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_wooden_sword, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_stone_sword, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_iron_sword, "AAA", "ABA", "AAA", 'A', swiftnessPotion, 'B',
				new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_golden_sword, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.swiftness_diamond_sword, "AAA", "ABA", "AAA", 'A', swiftnessPotion,
				'B', new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));

		// Speed II Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_wooden_sword, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_stone_sword, "AAA", "ABA", "AAA", 'A', strong_swiftnessPotion,
				'B', new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_iron_sword, "AAA", "ABA", "AAA", 'A', strong_swiftnessPotion,
				'B', new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_golden_sword, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SpeedEffectItems.strong_swiftness_diamond_sword, "AAA", "ABA", "AAA", 'A',
				strong_swiftnessPotion, 'B', new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
	}
}