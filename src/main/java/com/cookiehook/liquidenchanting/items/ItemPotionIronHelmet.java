package com.cookiehook.liquidenchanting.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.potion.Potion;

import java.util.Map;
import java.util.HashMap;

public class ItemPotionIronHelmet extends ItemPotionArmor {

    public static Map<String, ItemPotionArmor> effectMap = new HashMap<String, ItemPotionArmor>();
    private static ArmorMaterial material = ArmorMaterial.IRON;
    private static EntityEquipmentSlot armorType = EntityEquipmentSlot.HEAD;

    public ItemPotionIronHelmet(Potion potion, String name, int renderIndex) {
        super(material, armorType, potion, name, renderIndex);
        this.potion = potion;
        effectMap.put(potion.getRegistryName().toString(), this);
    }
}