package com.cookiehook.liquidenchanting.recipes;

import com.cookiehook.liquidenchanting.init.HealingEffectItems;
import com.cookiehook.liquidenchanting.util.ShapedArmorUpgradeRecipe;

import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class HealingEffectRecipes {

	public static ItemStack healingPotion = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.HEALING);
	public static ItemStack healingIIPotion = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRONG_HEALING);
	
	public static void addSwordRecipes() {
		// Healing Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.healing_wooden_sword, "AAA", "ABA", "AAA", 'A', healingPotion, 'B',
				new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.healing_stone_sword, "AAA", "ABA", "AAA", 'A', healingPotion, 'B',
				new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.healing_iron_sword, "AAA", "ABA", "AAA", 'A', healingPotion, 'B',
				new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.healing_golden_sword, "AAA", "ABA", "AAA", 'A', healingPotion, 'B',
				new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.healing_diamond_sword, "AAA", "ABA", "AAA", 'A', healingPotion, 'B',
				new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));

		// HealingII Sword
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.healing_wooden_sword, "AAA", "ABA", "AAA", 'A', healingIIPotion, 'B',
				new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.healing_stone_sword, "AAA", "ABA", "AAA", 'A', healingIIPotion, 'B',
				new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.healing_iron_sword, "AAA", "ABA", "AAA", 'A', healingIIPotion, 'B',
				new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.healing_golden_sword, "AAA", "ABA", "AAA", 'A', healingIIPotion, 'B',
				new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
		GameRegistry.addRecipe(new ShapedArmorUpgradeRecipe(HealingEffectItems.healing_diamond_sword, "AAA", "ABA", "AAA", 'A', healingIIPotion, 'B',
				new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE)));
	}
}