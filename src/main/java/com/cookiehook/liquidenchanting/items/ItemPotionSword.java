package com.cookiehook.liquidenchanting.items;

import java.util.List;

import com.cookiehook.liquidenchanting.Main;
import com.cookiehook.liquidenchanting.init.ModItems;

import com.cookiehook.liquidenchanting.util.IHasModel;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class ItemPotionSword extends ItemSword implements IHasModel {

    private Potion potion;
    private int duration, amplifier;


    public ItemPotionSword(ToolMaterial material, Potion potion, String name) {
        this(material, potion, 0, name);
    }

    public ItemPotionSword(ToolMaterial material, Potion potion, int amplifier, String name) {
        super(material);

        ModItems.ITEMS.add(this);
        this.potion = potion;
        this.duration = 200;
        this.amplifier = amplifier;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase hitEntity, EntityLivingBase attackingEntity) {
        hitEntity.addPotionEffect(new PotionEffect(potion, duration, amplifier));
        return true;
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
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}