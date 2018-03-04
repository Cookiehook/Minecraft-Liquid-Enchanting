package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;

public class HealingEffectItems {
	
	public static Item healing_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, Potion.heal, 1, 0).setUnlocalizedName("healing_wooden_sword");
	public static Item healing_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, Potion.heal, 1, 0).setUnlocalizedName("healing_stone_sword");
	public static Item healing_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, Potion.heal, 1, 0).setUnlocalizedName("healing_iron_sword");
	public static Item healing_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, Potion.heal, 1, 0).setUnlocalizedName("healing_golden_sword");
	public static Item healing_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.EMERALD, Potion.heal, 1, 0).setUnlocalizedName("healing_diamond_sword");
	
	public static Item healingII_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, Potion.heal, 1, 1).setUnlocalizedName("healingII_wooden_sword");
	public static Item healingII_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, Potion.heal, 1, 1).setUnlocalizedName("healingII_stone_sword");
	public static Item healingII_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, Potion.heal, 1, 1).setUnlocalizedName("healingII_iron_sword");
	public static Item healingII_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, Potion.heal, 1, 1).setUnlocalizedName("healingII_golden_sword");
	public static Item healingII_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.EMERALD, Potion.heal, 1, 1).setUnlocalizedName("healingII_diamond_sword");

	public static void init() {
		System.out.println("Initialising: Healing Items");
	}
}