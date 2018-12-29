package com.cookiehook.liquidenchanting.init;

import com.cookiehook.liquidenchanting.items.ItemBase;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

import java.lang.reflect.Field;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static Map<String, Item> effectMap = new HashMap<String, Item>();
    public static final Item liquid_enchanting = new ItemBase("liquid_enchanting");

    /**
     * Simply calls the split ModItems classes, so the item declarations are initialised, allowing them
     * to be registered later.
     * @param logger Mod logger, to allow consistency in STDOUT formatting
     */
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

    /**
     * Iterate through all registered items and register colors, if running on ClientSide.
     * Throws exceptions if color registration is called on a dedicated server.
     */
    public static void registerColors() {
        FMLCommonHandler handler = FMLCommonHandler.instance(); //Get the Singleton instance of Forge's handler.
        Side side = handler.getSide();
        if (side.equals(Side.CLIENT)) {
            for (Item item : ITEMS) {
                registerColor(item);
            }
        } else {
            System.out.println("Not running on client, skipping colour registration");
        }

    }

    /**
     * Converts the name of the input potion to the name from the potion item's NBT tag.
     * Necessary to handle inconsistency between MobEffect and NBT potion naming.
     * @return Name of potion
     */
    public static String getPotionName(Potion potion, int amplifier) {
        // TODO: Convert to switch statement
        String potionName = potion.getRegistryName().toString().split(":")[1];
        if (potionName.equals("jump_boost"))
            potionName = "leaping";
        else if(potionName.equals("speed"))
            potionName = "swiftness";
        else if (potionName.equals("instant_damage"))
            potionName = "harming";
        else if (potionName.equals("instant_health"))
            potionName = "healing";

        if(amplifier == 1)
            potionName = "strong_" + potionName;

        return potionName;
    }

    /**
     * Using reflection, get the name of a given ArmorMaterial. Necessary as the getter method is a ClientSide
     * only method.
     * @param material Instance of an ArmorMaterial
     * @return The value of the private variable name.
     */
    public static String getMaterialName(ItemArmor.ArmorMaterial material) {
        String materialName = null;
        try {
            Field materialField = material.getClass().getDeclaredField("name");
            materialField.setAccessible(true);
            materialName = (String) materialField.get(material);
        } catch (NoSuchFieldException nsfe) {
            System.out.println("A wild NoSuchFieldException appears!");
            System.out.println(nsfe.getLocalizedMessage());
        } catch (IllegalAccessException iae) {
            System.out.println("A wild IllegalAccessException appears!");
            System.out.println(iae.getLocalizedMessage());
        }
        return materialName;
    }

    /**
     * Using reflection, get the EntityEquipmentSlot of a given ItemArmor. Necessary as the getter method is a ClientSide
     * only method.
     * @param armor Instance of an ItemArmor
     * @return The value of the private variable EquipmentSlot.
     */
    public static EntityEquipmentSlot getEquipmentSlot(ItemArmor armor) {
        //Default to a valid but unused EES, so we don't throw NPEs if the try / catch fails
        EntityEquipmentSlot equipmentSlot = EntityEquipmentSlot.OFFHAND;
        try {
            Field slotField = armor.getClass().getDeclaredField("armorType");
            slotField.setAccessible(true);
            equipmentSlot = (EntityEquipmentSlot) slotField.get(armor);
        } catch (NoSuchFieldException nsfe) {
            System.out.println("A wild NoSuchFieldException appears!");
            System.out.println(nsfe.getLocalizedMessage());
        } catch (IllegalAccessException iae) {
            System.out.println("A wild IllegalAccessException appears!");
            System.out.println(iae.getLocalizedMessage());
        }
        return equipmentSlot;
    }


    /**
     * Registers an IItemColor for each item, so that dyed armors have properly shaded item sprites.
     * Has no effect on shading of the armor rendered on the player, that is handled elsewhere.
     * @param item
     */
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
