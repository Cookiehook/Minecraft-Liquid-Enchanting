package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemBase;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.Item;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static Map<String, Item> effectMap = new HashMap<String, Item>();
    public static final Item liquid_enchanting = new ItemBase("liquid_enchanting");

    public static void initialiseItems(Logger logger) {
        FireResistanceEffectItems.init(logger);
        HarmingEffectItems.init(logger);
        HealingEffectItems.init(logger);
        InvisibilityEffectItems.init(logger);
        JumpBoostEffectItems.init(logger);
        NightVisionEffectItems.init(logger);
        PoisonEffectItems.init(logger);
        RegenerationEffectItems.init(logger);
        SlownessEffectItems.init(logger);
        SpeedEffectItems.init(logger);
        StrengthEffectItems.init(logger);
        WaterBreathingEffectItems.init(logger);
        WeaknessEffectItems.init(logger);
    }

    public static void registerColors() {
        for (Item item : ITEMS) {
            registerColor(item);
        }

    }

    // Registers the overlay color for leather armor on the item sprites.
    // If omitted, the items always show a white color, regardless of dyes.
    @SideOnly(Side.CLIENT)
    private static void registerColor(Item item) {
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
