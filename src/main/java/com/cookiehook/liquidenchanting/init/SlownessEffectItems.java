package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class SlownessEffectItems {
	
	public static PotionEffect slowness = new PotionEffect(Potion.moveSlowdown.id, 10, 0);
	public static PotionEffect longSlowness = new PotionEffect(Potion.moveSlowdown.id, 200, 0);
	
	public static Item slowness_leather_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 0, Potion.moveSlowdown).setUnlocalizedName("slowness_leather_helmet").setTextureName("minecraft:leather_helmet");
	public static Item slowness_leather_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 1, Potion.moveSlowdown).setUnlocalizedName("slowness_leather_chestplate").setTextureName("minecraft:leather_chestplate");
	public static Item slowness_leather_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 2, Potion.moveSlowdown).setUnlocalizedName("slowness_leather_leggings").setTextureName("minecraft:leather_leggings");
	public static Item slowness_leather_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 3, Potion.moveSlowdown).setUnlocalizedName("slowness_leather_boots").setTextureName("minecraft:leather_boots");
	public static Item slowness_chain_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 0, Potion.moveSlowdown).setUnlocalizedName("slowness_chain_helmet").setTextureName("minecraft:chainmail_helmet");
	public static Item slowness_chain_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 1, Potion.moveSlowdown).setUnlocalizedName("slowness_chain_chestplate").setTextureName("minecraft:chainmail_chestplate");
	public static Item slowness_chain_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 2, Potion.moveSlowdown).setUnlocalizedName("slowness_chain_leggings").setTextureName("minecraft:chainmail_leggings");
	public static Item slowness_chain_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.CHAIN, 1, 3, Potion.moveSlowdown).setUnlocalizedName("slowness_chain_boots").setTextureName("minecraft:chainmail_boots");
	public static Item slowness_iron_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 0, Potion.moveSlowdown).setUnlocalizedName("slowness_iron_helmet").setTextureName("minecraft:iron_helmet");
	public static Item slowness_iron_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 1, Potion.moveSlowdown).setUnlocalizedName("slowness_iron_chestplate").setTextureName("minecraft:iron_chestplate");
	public static Item slowness_iron_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 2, Potion.moveSlowdown).setUnlocalizedName("slowness_iron_leggings").setTextureName("minecraft:iron_leggings");
	public static Item slowness_iron_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.IRON, 2, 3, Potion.moveSlowdown).setUnlocalizedName("slowness_iron_boots").setTextureName("minecraft:iron_boots");
	public static Item slowness_golden_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 0, Potion.moveSlowdown).setUnlocalizedName("slowness_golden_helmet").setTextureName("minecraft:gold_helmet");
	public static Item slowness_golden_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 1, Potion.moveSlowdown).setUnlocalizedName("slowness_golden_chestplate").setTextureName("minecraft:gold_chestplate");
	public static Item slowness_golden_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 2, Potion.moveSlowdown).setUnlocalizedName("slowness_golden_leggings").setTextureName("minecraft:gold_leggings");
	public static Item slowness_golden_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.GOLD, 4, 3, Potion.moveSlowdown).setUnlocalizedName("slowness_golden_boots").setTextureName("minecraft:gold_boots");
	public static Item slowness_diamond_helmet = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 0, Potion.moveSlowdown).setUnlocalizedName("slowness_diamond_helmet").setTextureName("minecraft:diamond_helmet");
	public static Item slowness_diamond_chestplate = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 1, Potion.moveSlowdown).setUnlocalizedName("slowness_diamond_chestplate").setTextureName("minecraft:diamond_chestplate");
	public static Item slowness_diamond_leggings = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 2, Potion.moveSlowdown).setUnlocalizedName("slowness_diamond_leggings").setTextureName("minecraft:diamond_leggings");
	public static Item slowness_diamond_boots = new ItemPotionArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 3, Potion.moveSlowdown).setUnlocalizedName("slowness_diamond_boots").setTextureName("minecraft:diamond_boots");

	public static Item slowness_wooden_sword = new ItemPotionSword(ItemTool.ToolMaterial.WOOD, Potion.moveSlowdown).setUnlocalizedName("slowness_wooden_sword").setTextureName("minecraft:wood_sword");
	public static Item slowness_stone_sword = new ItemPotionSword(ItemTool.ToolMaterial.STONE, Potion.moveSlowdown).setUnlocalizedName("slowness_stone_sword").setTextureName("minecraft:stone_sword");
	public static Item slowness_iron_sword = new ItemPotionSword(ItemTool.ToolMaterial.IRON, Potion.moveSlowdown).setUnlocalizedName("slowness_iron_sword").setTextureName("minecraft:iron_sword");
	public static Item slowness_golden_sword = new ItemPotionSword(ItemTool.ToolMaterial.GOLD, Potion.moveSlowdown).setUnlocalizedName("slowness_golden_sword").setTextureName("minecraft:gold_sword");
	public static Item slowness_diamond_sword = new ItemPotionSword(ItemTool.ToolMaterial.EMERALD, Potion.moveSlowdown).setUnlocalizedName("slowness_diamond_sword").setTextureName("minecraft:diamond_sword");

	public static void init() {
		System.out.println("Initialising: Slowness Items");
	}
}