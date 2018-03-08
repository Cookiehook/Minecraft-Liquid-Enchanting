package com.cookiehook.liquidenchanting.recipes;

import com.cookiehook.liquidenchanting.init.SlownessEffectItems;
import com.cookiehook.liquidenchanting.util.ShapedArmorUpgradeRecipe;

import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class SlownessEffectRecipes {

	public static ItemStack slownessPotion = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.SLOWNESS);

	public static void addArmorRecipes() {

		// Slowness Armor
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_leather_helmet, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.LEATHER_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_leather_chestplate, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.LEATHER_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_leather_leggings, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.LEATHER_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_leather_boots, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.LEATHER_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_chain_helmet, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.CHAINMAIL_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_chain_chestplate, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_chain_leggings, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.CHAINMAIL_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_chain_boots, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.CHAINMAIL_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_iron_helmet, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.IRON_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_iron_chestplate, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.IRON_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_iron_leggings, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.IRON_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_iron_boots, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.IRON_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_golden_helmet, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.GOLDEN_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_golden_chestplate, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.GOLDEN_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_golden_leggings, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.GOLDEN_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_golden_boots, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.GOLDEN_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_diamond_helmet, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.DIAMOND_HELMET, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_diamond_chestplate, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.DIAMOND_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_diamond_leggings, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.DIAMOND_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_diamond_boots, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.DIAMOND_BOOTS, 1, OreDictionary.WILDCARD_VALUE)));
	}

	public static void addSwordRecipes() {
		// Slowness Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_wooden_sword, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_stone_sword, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_iron_sword, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_golden_sword, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(SlownessEffectItems.slowness_diamond_sword, "AAA", "ABA", "AAA", 'A', slownessPotion, 'B',
				new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
	}
}