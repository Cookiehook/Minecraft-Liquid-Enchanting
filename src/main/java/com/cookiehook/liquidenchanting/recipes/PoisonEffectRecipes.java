package com.cookiehook.liquidenchanting.recipes;

import com.cookiehook.liquidenchanting.init.PoisonEffectItems;
import com.cookiehook.liquidenchanting.util.ShapedArmorUpgradeRecipe;

import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class PoisonEffectRecipes {

	public static ItemStack poisonPotion = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.POISON);
	public static ItemStack poisonIIPotion = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRONG_POISON);

	public static void addArmorRecipes() {

		// Poison Armor
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_leather_helmet, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.LEATHER_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_leather_chestplate, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.LEATHER_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_leather_leggings, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.LEATHER_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_leather_boots, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.LEATHER_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_chain_helmet, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.CHAINMAIL_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_chain_chestplate, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_chain_leggings, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.CHAINMAIL_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_chain_boots, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.CHAINMAIL_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_iron_helmet, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.IRON_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_iron_chestplate, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.IRON_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_iron_leggings, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.IRON_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_iron_boots, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.IRON_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_golden_helmet, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.GOLDEN_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_golden_chestplate, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.GOLDEN_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_golden_leggings, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.GOLDEN_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_golden_boots, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.GOLDEN_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_diamond_helmet, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.DIAMOND_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_diamond_chestplate, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.DIAMOND_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_diamond_leggings, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.DIAMOND_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_diamond_boots, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.DIAMOND_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));

		// Poison II Armor
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_leather_helmet, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.LEATHER_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_leather_chestplate, "AAA", "ABA", "AAA", 'A', poisonIIPotion,
				'B', new ItemStack(Items.LEATHER_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_leather_leggings, "AAA", "ABA", "AAA", 'A', poisonIIPotion,
				'B', new ItemStack(Items.LEATHER_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_leather_boots, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.LEATHER_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_chain_helmet, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.CHAINMAIL_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_chain_chestplate, "AAA", "ABA", "AAA", 'A', poisonIIPotion,
				'B', new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_chain_leggings, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.CHAINMAIL_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_chain_boots, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.CHAINMAIL_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_iron_helmet, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.IRON_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_iron_chestplate, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.IRON_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_iron_leggings, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.IRON_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_iron_boots, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.IRON_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_golden_helmet, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.GOLDEN_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_golden_chestplate, "AAA", "ABA", "AAA", 'A', poisonIIPotion,
				'B', new ItemStack(Items.GOLDEN_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_golden_leggings, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.GOLDEN_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_golden_boots, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.GOLDEN_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_diamond_helmet, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.DIAMOND_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_diamond_chestplate, "AAA", "ABA", "AAA", 'A', poisonIIPotion,
				'B', new ItemStack(Items.DIAMOND_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_diamond_leggings, "AAA", "ABA", "AAA", 'A', poisonIIPotion,
				'B', new ItemStack(Items.DIAMOND_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_diamond_boots, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.DIAMOND_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
	}

	public static void addSwordRecipes() {
		// Poison Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_wooden_sword, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_stone_sword, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_iron_sword, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_golden_sword, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poison_diamond_sword, "AAA", "ABA", "AAA", 'A', poisonPotion, 'B',
				new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));

		// Poison II Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_wooden_sword, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_stone_sword, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_iron_sword, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_golden_sword, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(PoisonEffectItems.poisonII_diamond_sword, "AAA", "ABA", "AAA", 'A', poisonIIPotion, 'B',
				new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
	}
}