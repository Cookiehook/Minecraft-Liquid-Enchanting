
package com.cookiehook.liquidenchanting.recipes;

import com.cookiehook.liquidenchanting.init.WaterBreathingEffectItems;
import com.cookiehook.liquidenchanting.util.ShapedArmorUpgradeRecipe;

import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class WaterBreathingEffectRecipes {

	public static ItemStack waterBreathingPotion = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER_BREATHING);

	public static void addArmorRecipes() {

		// WaterBreathing Armor
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_leather_helmet, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.LEATHER_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_leather_chestplate, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.LEATHER_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_leather_leggings, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.LEATHER_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_leather_boots, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.LEATHER_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_chain_helmet, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.CHAINMAIL_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_chain_chestplate, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_chain_leggings, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.CHAINMAIL_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_chain_boots, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.CHAINMAIL_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_iron_helmet, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.IRON_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_iron_chestplate, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.IRON_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_iron_leggings, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.IRON_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_iron_boots, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.IRON_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_golden_helmet, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.GOLDEN_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_golden_chestplate, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.GOLDEN_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_golden_leggings, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.GOLDEN_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_golden_boots, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.GOLDEN_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_diamond_helmet, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.DIAMOND_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_diamond_chestplate, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.DIAMOND_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_diamond_leggings, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.DIAMOND_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_diamond_boots, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.DIAMOND_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
	}

	public static void addSwordRecipes() {
		// WaterBreathing Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_wooden_sword, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_stone_sword, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_iron_sword, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_golden_sword, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(WaterBreathingEffectItems.waterBreathing_diamond_sword, "AAA", "ABA", "AAA", 'A', waterBreathingPotion, 'B',
				new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
	}
}