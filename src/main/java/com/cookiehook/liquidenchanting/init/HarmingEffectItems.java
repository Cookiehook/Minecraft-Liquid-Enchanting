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
	
	public static Item harmingII_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, Potion.harm, 1, 1).setUnlocalizedName("harmingII_wooden_sword");
	public static Item harmingII_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, Potion.harm, 1, 1).setUnlocalizedName("harmingII_stone_sword");
	public static Item harmingII_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, Potion.harm, 1, 1).setUnlocalizedName("harmingII_iron_sword");
	public static Item harmingII_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, Potion.harm, 1, 1).setUnlocalizedName("harmingII_golden_sword");
	public static Item harmingII_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.EMERALD, Potion.harm, 1, 1).setUnlocalizedName("harmingII_diamond_sword");

	public static void init() {
		System.out.println("Initialising: Harming Items");
	}
}