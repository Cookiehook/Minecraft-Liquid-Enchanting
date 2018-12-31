package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;

public class HarmingEffectItems {
	
	public static Item harming_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, Potion.harm, 1, 0).setUnlocalizedName("harming_wooden_sword");
	public static Item harming_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, Potion.harm, 1, 0).setUnlocalizedName("harming_stone_sword");
	public static Item harming_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, Potion.harm, 1, 0).setUnlocalizedName("harming_iron_sword");
	public static Item harming_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, Potion.harm, 1, 0).setUnlocalizedName("harming_golden_sword");
	public static Item harming_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.EMERALD, Potion.harm, 1, 0).setUnlocalizedName("harming_diamond_sword");
	
	public static Item strong_harming_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, Potion.harm, 1, 1).setUnlocalizedName("strong_harming_wooden_sword");
	public static Item strong_harming_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, Potion.harm, 1, 1).setUnlocalizedName("strong_harming_stone_sword");
	public static Item strong_harming_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, Potion.harm, 1, 1).setUnlocalizedName("strong_harming_iron_sword");
	public static Item strong_harming_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, Potion.harm, 1, 1).setUnlocalizedName("strong_harming_golden_sword");
	public static Item strong_harming_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.EMERALD, Potion.harm, 1, 1).setUnlocalizedName("strong_harming_diamond_sword");

	public static void init() {
		System.out.println("Initialising: Harming Items");
	}
}