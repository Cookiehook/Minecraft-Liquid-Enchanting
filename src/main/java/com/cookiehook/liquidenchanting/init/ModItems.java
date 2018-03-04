package com.cookiehook.liquidenchanting.init;

import java.util.ArrayList;
import java.util.List;

import com.cookiehook.liquidenchanting.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	// List to store all items in the mod. Items are added to this list by the item
	// constructors. Used for registration later.
	public static List<Item> itemList = new ArrayList<Item>();

	// Basic item to be used for creative tabs, game demos etc. Only available
	// through command line.
	public static Item liquid_enchanting = new Item().setUnlocalizedName("liquid_enchanting");

	// Calls the init() method of each class in this package, forcing the Item
	// declaration code to run.
	public static void init() {
		FireResistanceEffectItems.init();
		HarmingEffectItems.init();
		HasteEffectItems.init();
		HealingEffectItems.init();
		InvisibilityEffectItems.init();
		JumpBoostEffectItems.init();
		NightVisionEffectItems.init();
		PoisonEffectItems.init();
		RegenerationEffectItems.init();
		ResistanceEffectItems.init();
		SlownessEffectItems.init();
		SpeedEffectItems.init();
		StrengthEffectItems.init();
		WaterBreathingEffectItems.init();
		WeaknessEffectItems.init();
	}

	public static void register() {
		GameRegistry.registerItem(liquid_enchanting, liquid_enchanting.getUnlocalizedName().substring(5));

		// Loops through every Item in the itemList and registers it.
		for (Item item : itemList) {
			GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
		}
	}

	public static void registerRenders() {
		registerRender(liquid_enchanting);

		// Loops through every Item in the itemList and renders it.
		for (Item item : itemList) {
			registerRender(item);
		}
	}

	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
