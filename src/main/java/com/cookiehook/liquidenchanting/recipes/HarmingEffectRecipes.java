package com.cookiehook.liquidenchanting.recipes;

import com.cookiehook.liquidenchanting.init.HarmingEffectItems;
import com.cookiehook.liquidenchanting.util.ShapedArmorUpgradeRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class HarmingEffectRecipes {
	
	public static void addSwordRecipes() {
		//Harming Sword		
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.harming_wooden_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8204), 'B', new ItemStack(Items.wooden_sword, 1, OreDictionary.WILDCARD_VALUE)));	
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.harming_stone_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8204), 'B', new ItemStack(Items.stone_sword, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.harming_iron_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8204), 'B', new ItemStack(Items.iron_sword, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.harming_golden_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8204), 'B', new ItemStack(Items.golden_sword, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.harming_diamond_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8204), 'B', new ItemStack(Items.diamond_sword, 1, OreDictionary.WILDCARD_VALUE)));
		
		//HarmingII Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.strong_harming_wooden_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8236), 'B', new ItemStack(Items.wooden_sword, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.strong_harming_stone_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8236), 'B', new ItemStack(Items.stone_sword, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.strong_harming_iron_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8236), 'B', new ItemStack(Items.iron_sword, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.strong_harming_golden_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8236), 'B', new ItemStack(Items.golden_sword, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HarmingEffectItems.strong_harming_diamond_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8236), 'B', new ItemStack(Items.diamond_sword, 1, OreDictionary.WILDCARD_VALUE)));
	}
}