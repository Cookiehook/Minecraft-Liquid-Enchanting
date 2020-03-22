package com.cookiehook.liquidenchanting.crafting;

import com.cookiehook.liquidenchanting.util.Reference;
import com.google.gson.JsonObject;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.*;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.oredict.ShapedOreRecipe;

import javax.annotation.Nonnull;

public class BeaconRecipeFactory implements IRecipeFactory {
    @Override
    public IRecipe parse(JsonContext context, JsonObject json) {
        ShapedOreRecipe recipe = ShapedOreRecipe.factory(context, json);

        CraftingHelper.ShapedPrimer primer = new CraftingHelper.ShapedPrimer();
        primer.width = recipe.getRecipeWidth();
        primer.height = recipe.getRecipeHeight();
        primer.mirrored = JsonUtils.getBoolean(json, "mirrored", true);
        primer.input = recipe.getIngredients();
        return new CopyNBTRecipe(new ResourceLocation(Reference.MOD_ID, "copy_nbt_crafting"), recipe.getRecipeOutput(), primer);
    }

    public static class CopyNBTRecipe extends ShapedOreRecipe {

        public CopyNBTRecipe(ResourceLocation group, ItemStack result, CraftingHelper.ShapedPrimer primer) {
            super(group, result, primer);
        }


        @Override
        @Nonnull
        public ItemStack getCraftingResult(@Nonnull InventoryCrafting inventory) {
            //Get the input item in the central slot, which will always be the sword / armor.
            ItemStack centreItemStack = inventory.getStackInSlot(4);
            Item recipeIndicator = inventory.getStackInSlot(7).getItem();
            ItemStack output = centreItemStack.copy();

            //Construct potion NBT tag for the appropriate beacon effect
            NBTTagCompound targetPotionTag = new NBTTagCompound();
            NBTTagString potionName = new NBTTagString(getPotionFromItem(recipeIndicator));
            targetPotionTag.setTag("Potion", potionName);
            targetPotionTag.setTag("liquid_enchanted", new NBTTagInt(1)); // Used in toolTipEvent

            // Calculate incoming item's NBT (used by enchantments in vanilla), add potion tag, and copy to output
            NBTTagCompound inputTag = centreItemStack.getTagCompound();
            if (inputTag != null) {
                // We shouldn't change the inputTag, as if the user removes the original item from the crafting table
                // without crafting, the potion effect is applied as we've set it here. Hence, create a copy.
                NBTTagCompound newInputTag = inputTag.copy();
                newInputTag.setTag("Potion", targetPotionTag.getTag("Potion"));
                newInputTag.setTag("liquid_enchanted", new NBTTagInt(1)); // Used in toolTipEvent
                output.setTagCompound(newInputTag);
            } else {
                output.setTagCompound(targetPotionTag);
            }
            return output;
        }

        private String getPotionFromItem(Item item) {
            if (item == Items.IRON_CHESTPLATE) {
                return "minecraft:resistance";
            } else if (item == Items.DIAMOND_CHESTPLATE) {
                return "minecraft:strong_resistance";
            } else if (item == Items.IRON_PICKAXE) {
                return "minecraft:haste";
            } else if (item == Items.DIAMOND_PICKAXE) {
                return "minecraft:strong_haste";
            } else {
                return "minecraft:water";
            }
        }

        /**
         * Checks whether the items in the crafting grid match any recipes.
         * Pretty much a copy of the vanilla implementation, except the central item is only checked for type of item.
         * This makes the recipe intentionally ambiguous, allowing cross-mod compatibility.
         */
        @Override
        protected boolean checkMatch(InventoryCrafting inv, int startX, int startY, boolean mirror) {
            for (int x = 0; x < inv.getWidth(); x++) {
                for (int y = 0; y < inv.getHeight(); y++) {

                    if (x == 1 && y == 1) {
                        ItemStack centreItem = inv.getStackInRowAndColumn(x, y);
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
                    if (!target.apply(inv.getStackInRowAndColumn(x, y))) {
                        return false;
                    }
                }
            }

            return true;
        }
    }
}