package com.cookiehook.liquidenchanting.util;

import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.oredict.OreDictionary;
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
	 */
	@Override
	public ItemStack getCraftingResult(InventoryCrafting inv) {
		ItemStack output = super.getCraftingResult(inv);

		// Loop through all slots in the table, then break out once armor or a sword
		// have been found.
		for (int i = 0; i < inv.getSizeInventory(); i++) {
			ItemStack ingredient = inv.getStackInSlot(i);

			if (ingredient != null && (ingredient.getItem() instanceof ItemArmor || ingredient.getItem() instanceof ItemSword)) {
				// Calculate incoming item's damage value, adding it to the output.
				int newDamage = MathHelper.clamp(ingredient.getItemDamage(), 0, output.getMaxDamage());
				output.setItemDamage(newDamage);

				// Calculate incoming item's enchantments, add it to the output.
				NBTTagCompound enchant = ingredient.getTagCompound();
				output.setTagCompound(enchant);

				break;
			}
		}
		return output;
	}

	protected boolean checkMatch(InventoryCrafting inv, int startX, int startY, boolean mirror) {

		for (int x = 0; x < MAX_CRAFT_GRID_WIDTH; x++) {
			for (int y = 0; y < MAX_CRAFT_GRID_HEIGHT; y++) {
				int subX = x - startX;
				int subY = y - startY;
				Object target = null;

				if (subX >= 0 && subY >= 0 && subX < width && subY < height) {
					if (mirror) {
						target = input[width - subX - 1 + subY * width];
					} else {
						target = input[subX + subY * width];
					}
				}

				ItemStack slot = inv.getStackInRowAndColumn(x, y);

				if (target instanceof ItemStack) {
					if (!OreDictionary.itemMatches((ItemStack) target, slot, false)) {
						return false;
					} else if (PotionUtils.getPotionFromItem((ItemStack) target) != PotionUtils.getPotionFromItem(slot)) {
						return false;
					}

				} else if (target == null && slot != null) {
					return false;
				}
			}
		}

		return true;
	}
}
