package com.cookiehook.liquidenchanting.items;

import com.cookiehook.liquidenchanting.Main;
import com.cookiehook.liquidenchanting.init.ModItems;
import com.cookiehook.liquidenchanting.util.IHasModel;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


import javax.annotation.Nullable;
import java.util.List;

/**
 * This class represents an Armor item, that adds a potion effect to the player when worn.
 * This is achieved by overriding the vanilla onArmorTick (called every server tick, or 20x a second) to add the given
 * potion effect to the player wearing the armor.
 *
 * A default duration of 10 ticks (0.5s) has been chosen to prevent de-syncs between client and server. If we only add 1 tick of
 * effect every tick, the server can think the player has an effect when the client doesn't. Odd behaviour ensues...
 */
public class ItemPotionArmor extends ItemArmor implements IHasModel {

    protected Potion potion;
    protected int duration, amplifier;

    public ItemPotionArmor(ArmorMaterial material, EntityEquipmentSlot armorType, Potion potion, String name) {
        this(material, armorType, potion, 10, 0, name);
    }

    public ItemPotionArmor(ArmorMaterial material, EntityEquipmentSlot armorType, Potion potion, int amplifier, String name) {
        this(material, armorType, potion, 10, amplifier, name);
    }

    public ItemPotionArmor(ArmorMaterial material, EntityEquipmentSlot armorType, Potion potion, int duration, int amplifier, String name) {
        super(material, 0, armorType);

        this.potion = potion;
        this.duration = duration;
        this.amplifier = amplifier;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        String materialName = ModItems.getMaterialName(material);
        String slotName = armorType.getName();
        String potionName = ModItems.getPotionName(potion, amplifier);
        ModItems.effectMap.put(materialName + slotName + potionName, this);
        ModItems.ITEMS.add(this);
    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        player.addPotionEffect(new PotionEffect(potion, duration, amplifier, false, false));
    }

    // Overridden method from Item. Adds the shiny "Enchanted" effect to the item.
    public boolean hasEffect(ItemStack itemstack) {
        return true;
    }

    /**
     * The addInformation method is a method in Item allowing tooltips to be added to the player's inventory.
     * I'm using it here to add the name and strength of the potion appliied to the current item.
     */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        String potionName = I18n.format(potion.getName());
        String level = "";
        if (amplifier == 1)
            level = "II";
        tooltip.add(potionName + " " + level);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }



}
