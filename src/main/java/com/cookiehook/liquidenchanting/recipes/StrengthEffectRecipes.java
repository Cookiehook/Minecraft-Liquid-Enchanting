package com.cookiehook.liquidenchanting.recipes;

import com.cookiehook.liquidenchanting.init.StrengthEffectItems;
import com.cookiehook.liquidenchanting.util.ShapedArmorUpgradeRecipe;

import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class StrengthEffectRecipes {

	public static ItemStack strengthPotion = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRENGTH);
	public static ItemStack strengthIIPotion = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRONG_STRENGTH);

	public static void addArmorRecipes() {

		// Strength Armor
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_leather_helmet, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.LEATHER_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_leather_chestplate, "AAA", "ABA", "AAA", 'A',
				strengthPotion, 'B', new ItemStack(Items.LEATHER_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_leather_leggings, "AAA", "ABA", "AAA", 'A',
				strengthPotion, 'B', new ItemStack(Items.LEATHER_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_leather_boots, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.LEATHER_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_chain_helmet, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.CHAINMAIL_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_chain_chestplate, "AAA", "ABA", "AAA", 'A',
				strengthPotion, 'B', new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_chain_leggings, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.CHAINMAIL_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_chain_boots, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.CHAINMAIL_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_iron_helmet, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.IRON_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_iron_chestplate, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.IRON_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_iron_leggings, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.IRON_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_iron_boots, "AAA", "ABA", "AAA", 'A', strengthPotion, 'B',
				new ItemStack(Items.IRON_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_golden_helmet, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.GOLDEN_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_golden_chestplate, "AAA", "ABA", "AAA", 'A',
				strengthPotion, 'B', new ItemStack(Items.GOLDEN_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_golden_leggings, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.GOLDEN_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_golden_boots, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.GOLDEN_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_diamond_helmet, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.DIAMOND_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_diamond_chestplate, "AAA", "ABA", "AAA", 'A',
				strengthPotion, 'B', new ItemStack(Items.DIAMOND_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_diamond_leggings, "AAA", "ABA", "AAA", 'A',
				strengthPotion, 'B', new ItemStack(Items.DIAMOND_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_diamond_boots, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.DIAMOND_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));

		// Strength II Armor
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_leather_helmet, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.LEATHER_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_leather_chestplate, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.LEATHER_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_leather_leggings, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.LEATHER_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_leather_boots, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.LEATHER_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_chain_helmet, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.CHAINMAIL_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_chain_chestplate, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_chain_leggings, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.CHAINMAIL_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_chain_boots, "AAA", "ABA", "AAA", 'A', strengthIIPotion,
				'B', new ItemStack(Items.CHAINMAIL_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_iron_helmet, "AAA", "ABA", "AAA", 'A', strengthIIPotion,
				'B', new ItemStack(Items.IRON_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_iron_chestplate, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.IRON_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_iron_leggings, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.IRON_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_iron_boots, "AAA", "ABA", "AAA", 'A', strengthIIPotion,
				'B', new ItemStack(Items.IRON_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_golden_helmet, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.GOLDEN_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_golden_chestplate, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.GOLDEN_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_golden_leggings, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.GOLDEN_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_golden_boots, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.GOLDEN_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_diamond_helmet, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.DIAMOND_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_diamond_chestplate, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.DIAMOND_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_diamond_leggings, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.DIAMOND_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_diamond_boots, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.DIAMOND_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
	}

	public static void addSwordRecipes() {
		// Strength Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_wooden_sword, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_stone_sword, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_iron_sword, "AAA", "ABA", "AAA", 'A', strengthPotion, 'B',
				new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_golden_sword, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strength_diamond_sword, "AAA", "ABA", "AAA", 'A', strengthPotion,
				'B', new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));

		// Strength II Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_wooden_sword, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_stone_sword, "AAA", "ABA", "AAA", 'A', strengthIIPotion,
				'B', new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_iron_sword, "AAA", "ABA", "AAA", 'A', strengthIIPotion,
				'B', new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_golden_sword, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(StrengthEffectItems.strengthII_diamond_sword, "AAA", "ABA", "AAA", 'A',
				strengthIIPotion, 'B', new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
	}
}