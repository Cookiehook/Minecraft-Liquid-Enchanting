package com.cookiehook.liquidenchanting.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModItems {

    public static List<Item> itemList = new ArrayList<Item>();
    public static Map<String, Item> effectMap = new HashMap<String, Item>();

    public static void registerItems() {
        itemList.add(new Item().setUnlocalizedName("liquid_enchanting").setRegistryName("liquid_enchanting"));
        FireResistanceEffectItems.registerItems();
        HarmingEffectItems.registerItems();
        HasteEffectItems.registerItems();
        HealingEffectItems.registerItems();
        InvisibilityEffectItems.registerItems();
        JumpBoostResistanceEffectItems.registerItems();
        NightVisionEffectItems.registerItems();
        PoisonEffectItems.registerItems();
        RegenerationEffectItems.registerItems();
        ResistanceEffectItems.registerItems();
        SlownessEffectItems.registerItems();
        SpeedEffectItems.registerItems();
        StrengthEffectItems.registerItems();
    }

    /**
     * Registers an IItemColor for each item, so that dyed armors have properly shaded item sprites.
     * Has no effect on shading of the armor rendered on the player, that is handled elsewhere.
     * @param item - Item to be registered
     */
    @SideOnly(Side.CLIENT)
    public static void registerColor(Item item) {
        if (item instanceof ItemArmor) {
            Minecraft.getMinecraft().getItemColors().registerItemColorHandler(new IItemColor() {

                @Override
                public int colorMultiplier(ItemStack stack, int tintIndex) {
                    return tintIndex > 0 ? -1 : (((ItemArmor) stack.getItem()).getColor(stack));
                }
            }, item);
        }
    }

}
