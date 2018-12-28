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

/**
 * This class represents a Sword item that inflicts the target with a potion effect when hit.
 * This is achieved by overriding the hitEntity method in Item and adding a PotionEffect to the target entity.
 *
 * Default of 10 seconds is selected as a reasonable weapon buff for most effects.
 */
public class ItemPotionSword extends ItemSword implements IHasModel {

    private Potion potion;
    private int duration, amplifier;


    public ItemPotionSword(ToolMaterial material, Potion potion, String name) {
        this(material, potion, 200, 0, name);
    }

    public ItemPotionSword(ToolMaterial material, Potion potion, int amplifier, String name) {
        this(material, potion, 200, amplifier, name);
    }

    public ItemPotionSword(ToolMaterial material, Potion potion, int duration, int amplifier, String name) {
        super(material);

        this.potion = potion;
        this.duration = duration;
        this.amplifier = amplifier;
        setUnlocalizedName(name);
        setRegistryName(name);

        String materialName = this.getToolMaterialName();
        String potionName = ModItems.getPotionName(potion, amplifier);
        ModItems.ITEMS.add(this);
        ModItems.effectMap.put(materialName + potionName, this);
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase hitEntity, EntityLivingBase attackingEntity) {
        hitEntity.addPotionEffect(new PotionEffect(potion, duration, amplifier));
        return super.hitEntity(stack, hitEntity, attackingEntity); //Call the method from Item to make sure we damage the item on use.
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
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}