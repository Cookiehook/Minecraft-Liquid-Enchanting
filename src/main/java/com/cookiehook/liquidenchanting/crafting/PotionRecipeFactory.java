package com.cookiehook.liquidenchanting.crafting;

import com.cookiehook.liquidenchanting.util.Config;
import com.cookiehook.liquidenchanting.util.LiquidEnchantmentHelper;
import com.cookiehook.liquidenchanting.util.Reference;
import com.google.gson.JsonObject;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.oredict.ShapedOreRecipe;

import javax.annotation.Nonnull;
import java.util.List;

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
            ItemStack outputItemStack = inventory.getStackInSlot(4).copy();
            NBTTagCompound outputTag = outputItemStack.getTagCompound();
            NBTTagCompound potionTag = inventory.getStackInSlot(0).getTagCompound().copy();
            potionTag.setBoolean("liquid_enchanted", true);
            potionTag.removeTag("display");  // Remove the custom name added by PotionCraft combined potions

            if (outputTag != null) {
                outputTag.merge(potionTag);
            } else {
                outputTag = potionTag;
                outputItemStack.setTagCompound(outputTag);
            }

            // Remove liquid enchantments from output if the input potion has no effects
            if (LiquidEnchantmentHelper.getPotionTypeFromNBT(potionTag).size() == 0) {
                // Remove vanilla potion tags
                outputTag.removeTag("Potion");
                outputTag.removeTag("liquid_enchanted");

                // Remove custom potion tags
                if (outputTag.getBoolean("CustomPotionEffects")) {
                    outputTag.removeTag("CustomPotionEffects");
                    outputTag.removeTag("CustomPotionColor");
                    outputTag.removeTag("danger");
                }
            }

            // If the tag now has nothing in it, remove entirely, to remove the vanilla NBT Tooltip
            if (outputTag.getSize() == 0) {
                outputItemStack.setTagCompound(null);
            }
            return outputItemStack;
        }

        /**
         * This is called by the vanilla crafting mechanics to determine whether the ingredients in the crafting table
         * match any given recipe. Returning false means the ingredients weren't a match, true means they were.
         * If true is returned, then getCraftingResult can be called to determine what item will be crafted.
         */
        @Override
        protected boolean checkMatch(InventoryCrafting inventory, int startX, int startY, boolean mirror) {
            NBTTagCompound initialPotion = inventory.getStackInRowAndColumn(0, 0).getTagCompound();
            ItemStack centreItem = inventory.getStackInRowAndColumn(1, 1);

            // Check the top-left item has an NBT tag. Likely unnecessary, but if someone manages to get a potionItem
            // without an NBT tag, the call to getTagCompound.copy() in getCraftingResult will raise a NullPointerException.
            // If we don't have an NBT tag, we can't get potion effects, so the recipe will be a failure anyway.
            if (initialPotion == null) {
                return false;
            }

            // Prevent instant potions being crafted onto armor if disabled in the config
            List<PotionEffect> potionEffects = LiquidEnchantmentHelper.getPotionTypeFromNBT(initialPotion);
            for (PotionEffect potionEffect : potionEffects) {
                if (centreItem.getItem() instanceof ItemArmor
                        && potionEffect.getPotion().isInstant()
                        && !Config.instantEffectEnabled) {
                    return false;
                }
            }

            // Centre item must be enchantable with level 30 enchantment. Allows other mods to build their classes
            // however they want. If the item supports regular enchantments, we support liquid enchantment.
            if (EnchantmentHelper.getEnchantmentDatas(30, centreItem, true).size() == 0) {
                return false;
            }

            // This is predominantly a copy / paste from the vanilla implementation.
            // Difference being skip the centre item, and check the NBT tags all match each other.
            for (int x = 0; x < inventory.getWidth(); x++) {
                for (int y = 0; y < inventory.getHeight(); y++) {
                    if (x == 1 && y == 1) {
                        continue;  // Don't check the centre item here, we already did that above.
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
                    // Check the ingredient in the recipe matches that in the crafting table slot
                    if (!target.apply(inventory.getStackInRowAndColumn(x, y))) {
                        return false;
                    }
                    //Check that the potion on the current item is the same as the first potion.
                    NBTTagCompound currentPotion = inventory.getStackInRowAndColumn(x, y).getTagCompound();
                    if (currentPotion == null || !currentPotion.equals(initialPotion)) {
                        return false;
                    }
                }
            }

            return true;
        }
    }
}
