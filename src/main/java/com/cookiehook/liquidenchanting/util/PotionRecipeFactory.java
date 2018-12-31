package com.cookiehook.liquidenchanting.util;

import com.cookiehook.liquidenchanting.init.ModItems;
import com.google.gson.JsonObject;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
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
            NBTTagCompound targetPotion = inventory.getStackInSlot(0).getTagCompound();
            ItemStack output = new ItemStack(getModItemFromDictionary(targetPotion, centreItemStack.getItem()));

            // Check that we have an item in the centre slot and it is the correct item type, protects against NullPointerExceptions.
            if (centreItemStack != null && (centreItemStack.getItem() instanceof ItemArmor || centreItemStack.getItem() instanceof ItemSword)) {
                // Calculate incoming item's damage value, adding it to the output.
                int newDamage = MathHelper.clamp(centreItemStack.getItemDamage(), 0, output.getMaxDamage());
                output.setItemDamage(newDamage);

                // Calculate incoming item's enchantments, add it to the output.
                NBTTagCompound enchant = centreItemStack.getTagCompound();
                output.setTagCompound(enchant);
            }
            return output;
        }

        /**
         * This is called by the vanilla crafting mechanics to determine whether the ingredients in the crafting table
         * match any given recipe. Returning false means the ingredients weren't a match, true means they were.
         * If true is returned, then getCraftingResult can be called to determine what item will be crafted.
         */
        protected boolean checkMatch(InventoryCrafting inventory, int startX, int startY, boolean mirror) {
            //First, call the standard check for ingredient matching. (All the right items in all the right places)
            boolean itemsMatch = super.checkMatch(inventory, startX, startY, mirror);

            //Only check that potions match if the standard check passes.
            if (itemsMatch) {
                //Get the potion tag for the first potion.
                NBTTagCompound targetPotion = inventory.getStackInSlot(0).getTagCompound();
                if (targetPotion == null) {
                    return false;
                } else {
                    for (int i = 0; i < inventory.getSizeInventory(); ++i) { //For each slot in the crafing grid...
                        if (i == 4) {
                            continue; //Skip the central slot, as it will be armor / sword.
                        }
                        //Check that the potion on the current item is the same as the first potion.
                        NBTTagCompound currentPotion = inventory.getStackInSlot(i).getTagCompound();
                        if (currentPotion == null || !currentPotion.equals(targetPotion)) {
                            return false;
                        }
                    }
                    // Check that a mod item for this potion has been implemented
                    if (getModItemFromDictionary(targetPotion, inventory.getStackInSlot(4).getItem()) == null) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        }

        /**
         * Checks that the combination of potions and item have been implemented and are enabled in the config.
         * This method works by interrogating registry names. The unique combination of vanilla item and potion names are
         * used to identify the config entry and item to return.
         *
         * @param potionTag NBT Tag Compound from the potion, used to get potion name.
         * @param item      Vanilla armor / sword used in crafting recipe, used to get material and armor slot.
         * @return Instance of mod armor / sword
         */
        private Item getModItemFromDictionary(NBTTagCompound potionTag, Item item) {
            // Get the name of the vanilla potion and item, then concatenate together.
            String potionName = potionTag.getTag("Potion").toString().split(":")[1].replace("\"", "");
            String itemName = item.getRegistryName().toString().split(":")[1];
            String itemKey = potionName + "_" + itemName;

            // Replace item specific names in the itemKey, so we end with names like "fire_resistance_sword" or "haste_armor"
            String configKey = itemKey.replaceAll("(wooden|stone|iron|golden|diamond|leather|chainmail)_", "");
            configKey = configKey.replaceAll("(helmet|chestplate|leggings|boots)", "armor");

            // Check that the desired item is enabled in the config file, then return an instance of it if true.
            Boolean configEnabled = Config.configMap.get(configKey);
            if(configEnabled)
                return ModItems.effectMap.get(itemKey);
            else
                return null;
        }
    }
}