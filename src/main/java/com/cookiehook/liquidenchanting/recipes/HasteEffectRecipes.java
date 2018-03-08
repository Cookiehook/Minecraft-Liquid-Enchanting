package com.cookiehook.liquidenchanting.recipes;

import com.cookiehook.liquidenchanting.init.HasteEffectItems;
import com.cookiehook.liquidenchanting.util.ShapedArmorUpgradeRecipe;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class HasteEffectRecipes {

	public static void addArmorRecipes() {
		// Haste Armor
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_leather_helmet, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_leather_chestplate, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_leather_leggings, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_leather_boots, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_iron_helmet, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_iron_chestplate, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_iron_leggings, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_iron_boots, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_chain_helmet, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_chain_chestplate, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_chain_leggings, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_chain_boots, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_golden_helmet, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_golden_chestplate, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_golden_leggings, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_golden_boots, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_diamond_helmet, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_diamond_chestplate, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_diamond_leggings, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_diamond_boots, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));

		// HasteII Armor
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_leather_helmet, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_leather_chestplate, "ABA", "ACA", "AAA", 'A',
				Items.DIAMOND_PICKAXE, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_leather_leggings, "ABA", "ACA", "AAA", 'A',
				Items.DIAMOND_PICKAXE, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_leather_boots, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_iron_helmet, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_iron_chestplate, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_iron_leggings, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_iron_boots, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_chain_helmet, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_chain_chestplate, "ABA", "ACA", "AAA", 'A',
				Items.DIAMOND_PICKAXE, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_chain_leggings, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_chain_boots, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_golden_helmet, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_golden_chestplate, "ABA", "ACA", "AAA", 'A',
				Items.DIAMOND_PICKAXE, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_golden_leggings, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_golden_boots, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_diamond_helmet, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_diamond_chestplate, "ABA", "ACA", "AAA", 'A',
				Items.DIAMOND_PICKAXE, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_diamond_leggings, "ABA", "ACA", "AAA", 'A',
				Items.DIAMOND_PICKAXE, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_diamond_boots, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
	}

	public static void addSwordRecipes() {
		// Haste Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_wooden_sword, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_stone_sword, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_iron_sword, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_golden_sword, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.haste_diamond_sword, "ABA", "ACA", "AAA", 'A', Items.IRON_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));

		// HasteII Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_wooden_sword, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_stone_sword, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_iron_sword, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE, 'B',
				Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_golden_sword, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HasteEffectItems.hasteII_diamond_sword, "ABA", "ACA", "AAA", 'A', Items.DIAMOND_PICKAXE,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
	}
}