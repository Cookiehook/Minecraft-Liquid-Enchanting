package com.cookiehook.liquidenchanting.recipes;

import com.cookiehook.liquidenchanting.init.HarmingEffectItems;
import com.cookiehook.liquidenchanting.util.ShapedArmorUpgradeRecipe;

import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class HarmingEffectRecipes {

	public static ItemStack harmingPotion = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.HARMING);
	public static ItemStack harmingIIPotion = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRONG_HARMING);

	public static void addSwordRecipes() {
		// Harming Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.harming_wooden_sword, "AAA", "ABA", "AAA", 'A', harmingPotion, 'B',
				new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.harming_stone_sword, "AAA", "ABA", "AAA", 'A', harmingPotion, 'B',
				new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.harming_iron_sword, "AAA", "ABA", "AAA", 'A', harmingPotion, 'B',
				new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.harming_golden_sword, "AAA", "ABA", "AAA", 'A', harmingPotion, 'B',
				new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.harming_diamond_sword, "AAA", "ABA", "AAA", 'A', harmingPotion, 'B',
				new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));

		// HarmingII Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.harmingII_wooden_sword, "AAA", "ABA", "AAA", 'A', harmingIIPotion, 'B',
				new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.harmingII_stone_sword, "AAA", "ABA", "AAA", 'A', harmingIIPotion, 'B',
				new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.harmingII_iron_sword, "AAA", "ABA", "AAA", 'A', harmingIIPotion, 'B',
				new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.harmingII_golden_sword, "AAA", "ABA", "AAA", 'A', harmingIIPotion, 'B',
				new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.harmingII_diamond_sword, "AAA", "ABA", "AAA", 'A', harmingIIPotion, 'B',
				new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
	}
}