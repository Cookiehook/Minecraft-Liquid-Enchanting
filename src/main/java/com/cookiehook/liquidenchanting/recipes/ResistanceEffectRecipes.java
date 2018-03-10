package com.cookiehook.liquidenchanting.recipes;

import com.cookiehook.liquidenchanting.init.ResistanceEffectItems;
import com.cookiehook.liquidenchanting.util.ShapedArmorUpgradeRecipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ResistanceEffectRecipes {

	public static void addArmorRecipes() {
		// Resistance Armor
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_leather_helmet, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_leather_chestplate, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_leather_leggings, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_leather_boots, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_iron_helmet, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_iron_chestplate, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_iron_leggings, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_iron_boots, "ABA", "ACA", "AAA", 'A', Blocks.IRON_BLOCK,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_chain_helmet, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_chain_chestplate, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_chain_leggings, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_chain_boots, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_golden_helmet, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_golden_chestplate, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_golden_leggings, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_golden_boots, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_diamond_helmet, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_diamond_chestplate, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_diamond_leggings, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_diamond_boots, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));

		// ResistanceII Armor
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_leather_helmet, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_leather_chestplate, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_leather_leggings, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_leather_boots, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.LEATHER_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_iron_helmet, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_iron_chestplate, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_iron_leggings, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_iron_boots, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_chain_helmet, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_chain_chestplate, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_chain_leggings, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_chain_boots, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.CHAINMAIL_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_golden_helmet, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_golden_chestplate, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_golden_leggings, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_golden_boots, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_diamond_helmet, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_diamond_chestplate, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_diamond_leggings, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_diamond_boots, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
	}

	public static void addSwordRecipes() {
		// Resistance Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_wooden_sword, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_stone_sword, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_iron_sword, "ABA", "ACA", "AAA", 'A', Blocks.IRON_BLOCK,
				'B', Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_golden_sword, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistance_diamond_sword, "ABA", "ACA", "AAA", 'A',
				Blocks.IRON_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));

		// ResistanceII Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_wooden_sword, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_stone_sword, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_iron_sword, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_golden_sword, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(ResistanceEffectItems.resistanceII_diamond_sword, "ABA", "ACA", "AAA", 'A',
				Blocks.DIAMOND_BLOCK, 'B', Items.NETHER_STAR, 'C', new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
	}
}