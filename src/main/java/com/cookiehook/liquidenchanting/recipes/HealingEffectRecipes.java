package com.cookiehook.liquidenchanting.recipes;

import com.cookiehook.liquidenchanting.init.HealingEffectItems;
import com.cookiehook.liquidenchanting.util.ShapedArmorUpgradeRecipe;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class HealingEffectRecipes {
	
	public static void addSwordRecipes() {
		//Healing Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.healing_wooden_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8197), 'B', new ItemStack(Items.wooden_sword, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.healing_stone_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8197), 'B', new ItemStack(Items.stone_sword, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.healing_iron_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8197), 'B', new ItemStack(Items.iron_sword, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.healing_golden_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8197), 'B', new ItemStack(Items.golden_sword, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.healing_diamond_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8197), 'B', new ItemStack(Items.diamond_sword, 1, OreDictionary.WILDCARD_VALUE)));
		
		//HealingII Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.strong_healing_wooden_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8229), 'B', new ItemStack(Items.wooden_sword, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.strong_healing_stone_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8229), 'B', new ItemStack(Items.stone_sword, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.strong_healing_iron_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8229), 'B', new ItemStack(Items.iron_sword, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.strong_healing_golden_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8229), 'B', new ItemStack(Items.golden_sword, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.strong_healing_diamond_sword,
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Items.potionitem, 1, 8229), 'B', new ItemStack(Items.diamond_sword, 1, OreDictionary.WILDCARD_VALUE)));
	}
}