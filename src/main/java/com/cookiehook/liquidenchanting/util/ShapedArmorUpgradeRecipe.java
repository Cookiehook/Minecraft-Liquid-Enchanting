package com.cookiehook.liquidenchanting.util;

import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ShapedArmorUpgradeRecipe extends ShapedOreRecipe {

	public ShapedArmorUpgradeRecipe(Block result, Object... recipe) {
		super(result, recipe);
	}

	public ShapedArmorUpgradeRecipe(Item result, Object... recipe) {
		super(result, recipe);
	}

	public ShapedArmorUpgradeRecipe(ItemStack result, Object... recipe) {
		super(result, recipe);
	}

	/**
	 * Method to copy damage and enchantments from vanilla armor onto output, with
	 * thanks to Choonster of MinecraftForums.
	 * <p>
	 * Test for this thread:
	 * http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/modification-development/2513998-help-needed-creating-crafting-recipe-with-damaged
	 */
	@Override
	public ItemStack getCraftingResult(InventoryCrafting inv) {
		ItemStack output = super.getCraftingResult(inv);

		// Loop through all slots in the table, then break out once armor or a sword have been found.
		for (int i = 0; i < inv.getSizeInventory(); i++) {
			ItemStack ingredient = inv.getStackInSlot(i);

			if (ingredient != null && (ingredient.getItem() instanceof ItemArmor || ingredient.getItem() instanceof ItemSword)) {
				// Calculate incoming item's damage value, adding it to the output.
				int newDamage = MathHelper.clamp_int(ingredient.getItemDamage(), 0, output.getMaxDamage());
				output.setItemDamage(newDamage);

				// Calculate incoming item's enchantments, add it to the output.
				NBTTagCompound enchant = ingredient.getTagCompound();
				output.setTagCompound(enchant);
				break;
			}
		}
		return output;
	}
}
