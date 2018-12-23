package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;

import java.util.List;
import org.apache.logging.log4j.Logger;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static final Item liquid_enchanting = new ItemBase("liquid_enchanting");

    public static void initialiseItems(Logger logger) {
        InvisibilityEffectItems.init(logger);
        FireResistanceEffectItems.init(logger);
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
}
