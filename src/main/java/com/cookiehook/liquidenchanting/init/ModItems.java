package com.cookiehook.liquidenchanting.init;

import java.util.ArrayList;
import java.util.List;

import com.cookiehook.liquidenchanting.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	// List to store all items in the mod. Items are added to this list by the item
	// constructors. Used for registration later.
	public static List<Item> itemList = new ArrayList<Item>();

	// Basic item to be used for creative tabs, game demos etc. Only available
	// through command line.
	public static Item liquid_enchanting = new Item().setUnlocalizedName("liquid_enchanting").setRegistryName("liquid_enchanting");

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
		GameRegistry.register(liquid_enchanting);

		// Loops through every Item in the itemList and registers it.
		for (Item item : itemList) {
			GameRegistry.register(item);
		}
	}

	public static void registerRenders() {
		registerRender(liquid_enchanting);

		// Loops through every Item in the itemList and renders it.
		for (Item item : itemList) {
			registerRender(item);
			registerColor(item);
		}
	}

	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	// Registers the overlay color for leather armor on the item sprites.
	// If omitted, the items always show a white color, regardless of dyes.
	private static void registerColor(Item item) {
		if (item instanceof ItemArmor) {
			Minecraft.getMinecraft().getItemColors().registerItemColorHandler(new IItemColor() {

				@Override
				public int getColorFromItemstack(ItemStack stack, int tintIndex) {
					return tintIndex > 0 ? -1 : (((ItemArmor) stack.getItem()).getColor(stack));
				}
			}, item);
		}
	}
}
