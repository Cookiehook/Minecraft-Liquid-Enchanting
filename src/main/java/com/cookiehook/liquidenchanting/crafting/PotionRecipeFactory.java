package com.cookiehook.liquidenchanting.crafting;

import com.cookiehook.liquidenchanting.util.Reference;
import com.google.gson.JsonObject;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.*;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.oredict.ShapedOreRecipe;

import javax.annotation.Nonnull;

public class PotionRecipeFactory implements IRecipeFactory {
    @Override
    public IRecipe parse(JsonContext context, JsonObject json) {
        ShapedOreRecipe recipe = ShapedOreRecipe.factory(context, json);

        CraftingHelper.ShapedPrimer primer = new CraftingHelper.ShapedPrimer();
        primer.width = recipe.getRecipeWidth();
        primer.height = recipe.getRecipeHeight();
        primer.mirrored = JsonUtils.getBoolean(json, "mirrored", true);
        primer.input = recipe.getIngredients();
        return new PotionImbewRecipe(new ResourceLocation(Reference.MOD_ID, "potion_imbew_crafting"), recipe.getRecipeOutput(), primer);
    }

    public static class PotionImbewRecipe extends ShapedOreRecipe {

        public PotionImbewRecipe(ResourceLocation group, ItemStack result, CraftingHelper.ShapedPrimer primer) {
            super(group, result, primer);
        }

        /**
         * Custom crafting method to return the correct potion imbewed item based on the recipes. This overrides
         * the output from the JSON recipe, as there's no way to specify potion's NBT as an ingredient as of 1.12.2.
         * Method also preserves damage and enchantments from the original item.
         */
        @Override
        @Nonnull
        public ItemStack getCraftingResult(@Nonnull InventoryCrafting inventory) {
            //Get the input item in the central slot, which will always be the sword / armor.
            ItemStack centreItemStack = inventory.getStackInSlot(4);
            ItemStack output = centreItemStack.copy();

            // Calculate incoming item's NBT (used by enchantments in vanilla), add potion tag, and copy to output
            NBTTagCompound inputTag = centreItemStack.getTagCompound();
            NBTTagCompound targetPotionTag = inventory.getStackInSlot(0).getTagCompound().copy();
            // Potion combination mods change the display name of the "combined" potion using NBT tags. We don't want that
            // name on our armor piece, so we strip any display tags from the incoming potion.
            targetPotionTag.removeTag("display");
            targetPotionTag.setTag("liquid_enchanted", new NBTTagInt(1)); // Used in toolTipEvent
            if (inputTag != null) {
                inputTag.setTag("Potion", targetPotionTag.getTag("Potion"));
                inputTag.setTag("liquid_enchanted", new NBTTagInt(1)); // Used in toolTipEvent
                output.setTagCompound(inputTag);
            } else {
                output.setTagCompound(targetPotionTag);
            }

            return output;
        }

        /**
         * This is called by the vanilla crafting mechanics to determine whether the ingredients in the crafting table
         * match any given recipe. Returning false means the ingredients weren't a match, true means they were.
         * If true is returned, then getCraftingResult can be called to determine what item will be crafted.
         *
         * This is predominantly a copy / paste from the vanilla implementation. We need most of the checks
         * from the vanilla, but need a special check for the centre slot. As such, we can't just call the super.
         */
        @Override
        protected boolean checkMatch(InventoryCrafting inventory, int startX, int startY, boolean mirror) {
            NBTTagCompound targetPotion = inventory.getStackInRowAndColumn(0, 0).getTagCompound();
            if (targetPotion == null) {
                return false;
            } else {
                for (int x = 0; x < inventory.getWidth(); x++) {
                    for (int y = 0; y < inventory.getHeight(); y++) {
                        if (x == 1 && y == 1) {
                            ItemStack centreItem = inventory.getStackInRowAndColumn(x, y);
                            // Try to do a level 30 enchantment on the item. If successful, this is a valid item to Liquid Enchant
                            if (EnchantmentHelper.getEnchantmentDatas(30, centreItem, true).size() > 0) {
                                continue;
                            } else {
                                return false;
                            }
                        }
                        int subX = x - startX;
                        int subY = y - startY;
                        Ingredient target = Ingredient.EMPTY;

                        if (subX >= 0 && subY >= 0 && subX < width && subY < height) {
                            if (mirror) {
                                target = input.get(width - subX - 1 + subY * width);
                            } else {
                                target = input.get(subX + subY * width);
                            }
                        }
                        if (!target.apply(inventory.getStackInRowAndColumn(x, y))) {
                            return false;
                        }
                        //Check that the potion on the current item is the same as the first potion.
                        NBTTagCompound currentPotion = inventory.getStackInRowAndColumn(x, y).getTagCompound();
                        if (currentPotion == null || !currentPotion.equals(targetPotion)) {
                            return false;
                        }
                    }
                }

                return true;
            }
        }
    }
}
