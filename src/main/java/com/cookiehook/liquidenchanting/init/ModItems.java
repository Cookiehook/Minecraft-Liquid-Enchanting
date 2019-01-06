package com.cookiehook.liquidenchanting.init;

import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModItems {

    public static List<Item> itemList = new ArrayList<Item>();

    public static void registerItems() {
        itemList.add(new Item().setUnlocalizedName("liquid_enchanting").setRegistryName("liquid_enchanting"));
    }
}
