package com.cookiehook.liquidenchanting.items;

import java.util.List;

import com.cookiehook.liquidenchanting.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemPotionArmor extends ItemArmor {

    private Potion potion;
    private int duration, amplifier;


    public ItemPotionArmor(ArmorMaterial material, int renderIndex, int armorType, Potion potion) {
        //Passes a default duration 0.5 seconds and amplifier 0 to the main constructor.
        this(material, renderIndex, armorType, potion, 10, 0);
    }

    /**
     * Creates an Armor Item, inheriting all vanilla behaviour from ItemArmor.
     *
     * @param material    - An armor material such as Cloth, Iron, Gold. e.g. ArmorMaterial.CLOTH
     * @param renderIndex - Used on RenderPlayer to select the correspondent armor to be rendered on the player:
     *                    0 is cloth, 1 is chain, 2 is iron, 3 is diamond and 4 is gold.
     * @param armorType   - Whether this is a helmet (0), chestplate (1), leggings (2) or boots (3).
     * @param potion      - A Potion object, used to decide which effect to add.
     * @param duration    - How many ticks the effect is added for. 20 ticks = 1 second.
     * @param amplifier   - Level of the effect, starting from 0.
     */
    public ItemPotionArmor(ArmorMaterial material, int renderIndex, int armorType, Potion potion, int duration, int amplifier) {
        //Passes all arguments to the ItemArmor constructor, which actually does the work.
        super(material, renderIndex, armorType);

        //Adds the created item to the itemList for registration.
        ModItems.itemList.add(this);
        this.potion = potion;
        this.duration = duration;
        this.amplifier = amplifier;
    }

    // This method is called on every game tick (20x per second), adding a potion effect to the player.
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        player.addPotionEffect(new PotionEffect(potion.id, duration, amplifier));
    }

    //Gives the "enchanted" animation.
    public boolean hasEffect(ItemStack itemstack) {
        return true;
    }


    // Adds the potion type as a tooltip.
    @SuppressWarnings({"rawtypes", "unchecked"})
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
        // Gets the potion name from the potion effect, and registers with the localisation resources.
        // This allows it to be translated by .lang files.
        String potionName = I18n.format(potion.getName());
        String level = "";
        if (amplifier == 1)
            level = "II";
        tooltip.add(potionName + " " + level);
    }
}
