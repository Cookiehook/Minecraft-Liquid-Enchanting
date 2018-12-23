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

public class ItemPotionArmor extends ItemArmor implements IHasModel {

    private Potion potion;
    private int duration, amplifier;

    public ItemPotionArmor(ArmorMaterial material, EntityEquipmentSlot armorType, Potion potion, String name, int renderIndex) {
        this(material, armorType, potion, 10, 0, name, renderIndex);
    }

    private ItemPotionArmor(ArmorMaterial material, EntityEquipmentSlot armorType, Potion potion, int duration, int amplifier, String name, int renderIndex) {
        super(material, renderIndex, armorType);

        this.potion = potion;
        this.duration = duration;
        this.amplifier = amplifier;
        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(CreativeTabs.COMBAT);
        ModItems.ITEMS.add(this);

        String materialName = material.getName();
        String slotName = armorType.getName();
        String potionName = potion.getRegistryName().toString();
        ModItems.effectMap.put(materialName + slotName + potionName, this);

    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        player.addPotionEffect(new PotionEffect(potion, duration, amplifier, false, false));
    }

    public boolean hasEffect(ItemStack itemstack) {
        return true;
    }

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
