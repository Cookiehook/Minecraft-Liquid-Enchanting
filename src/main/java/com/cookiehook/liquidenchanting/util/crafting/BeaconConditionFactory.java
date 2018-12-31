package com.cookiehook.liquidenchanting.util.crafting;

import com.cookiehook.liquidenchanting.util.Config;
import com.cookiehook.liquidenchanting.util.Reference;
import com.google.gson.JsonObject;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;

import java.util.function.BooleanSupplier;

public class BeaconConditionFactory implements IConditionFactory {

    @Override
    public BooleanSupplier parse(JsonContext context, JsonObject json) {

        String key = JsonUtils.getString(json, "type");
        boolean value = JsonUtils.getBoolean(json , "value", true);

        switch (key) {
        case Reference.MOD_ID + ":haste_armor_enabled": return () -> Config.configMap.get("haste_armor") == value;
        case Reference.MOD_ID + ":strong_haste_armor_enabled": return () -> Config.configMap.get("strong_haste_armor") == value;
        case Reference.MOD_ID + ":resistance_armor_enabled": return () -> Config.configMap.get("resistance_armor") == value;
        case Reference.MOD_ID + ":strong_resistance_armor_enabled": return () -> Config.configMap.get("strong_resistance_armor") == value;
        case Reference.MOD_ID + ":haste_sword_enabled": return () -> Config.configMap.get("haste_sword") == value;
        case Reference.MOD_ID + ":strong_haste_sword_enabled": return () -> Config.configMap.get("strong_haste_sword") == value;
        case Reference.MOD_ID + ":resistance_sword_enabled": return () -> Config.configMap.get("resistance_sword") == value;
        case Reference.MOD_ID + ":strong_resistance_sword_enabled": return () -> Config.configMap.get("strong_resistance_sword") == value;
            default: return () -> !value;
        }
    }
}
