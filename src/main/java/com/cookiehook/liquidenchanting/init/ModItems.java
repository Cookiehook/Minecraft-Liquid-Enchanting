package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemBase;
import com.cookiehook.liquidenchanting.items.ItemPotionArmor;
import com.cookiehook.liquidenchanting.items.ItemPotionIronHelmet;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static final Map<String, Item> effectMap = new HashMap<String, Item>();

    public static final Item liquid_enchanting = new ItemBase("liquid_enchanting");

    public static final Item invisibility_iron_helmet = new ItemPotionIronHelmet(MobEffects.INVISIBILITY, "invisibility_iron_helmet", 1);

//    public static final Item invisibility_iron_helmet = new ItemPotionArmor("invisibility_iron_helmet", ItemArmor.ArmorMaterial.IRON, 1, EntityEquipmentSlot.HEAD);


    public static void populateEffectMap() {
        effectMap.put("minecraft:invisibility", invisibility_iron_helmet);
    }

}
