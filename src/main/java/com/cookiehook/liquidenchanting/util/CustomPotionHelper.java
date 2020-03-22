package com.cookiehook.liquidenchanting.util;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomPotionHelper {

    /**
     * Returns a list of PotionEffects by interrogating the input NBT tag and PotionType registry.
     * This is where we actually configure what types of potions are allowed.
     * The crafting methods are very simple, copying over the NBT tags without checking them. It has to be this way, as I can't
     * have any clue what other mods might due with their NBT tags, and I don't want to strip any functionality by being selective
     * in what NBT tags I copy.
     *
     * Whenever a potion effect is needed to be applied, it calls this method. This then checks config files to see what
     * potions / combinations are currently allowed. It then passes back a list of all potions that were on that item,
     * minus anything prohibited by the config file.
     *
     * @param nbtTagCompound
     */
    public static List<PotionEffect> getPotionTypeFromNBT(NBTTagCompound nbtTagCompound) {
        List<PotionEffect> potionEffects = new ArrayList<PotionEffect>();

        if (nbtTagCompound != null) {  // Avoids NullPointerException when going for un-enchanted gear.
            String potionName = nbtTagCompound.getString("Potion");
            if (!potionName.equals("") && PotionType.getPotionTypeForName(potionName) != null) {
                potionEffects.addAll(PotionType.getPotionTypeForName(potionName).getEffects());
            }

            if (Config.combinedCraftingEnabled) { // This tag type is used only by "combined" potion mods.
                NBTTagList customPotionList = nbtTagCompound.getTagList("CustomPotionEffects", 10);
                for (NBTBase tag : customPotionList) {
                    potionEffects.add(PotionEffect.readCustomPotionEffectFromNBT((NBTTagCompound) tag));
                }
            }
        }

        //Removes any effects which were configured as "disabled" from the list to be returned.
        //Temporarily add items to remove to a separate collection to avoid ConcurrentModificationExceptions.
        List<PotionEffect> effectsToRemove = new ArrayList<PotionEffect>();
        for (PotionEffect effect : potionEffects) {
            String effectName = effect.getPotion().getRegistryName().toString();
            if (Arrays.asList(Config.disabledPotions).contains(effectName)) {
                effectsToRemove.add(effect);
            }
        }
        potionEffects.removeAll(effectsToRemove);

        return potionEffects;
    }

    /**
     * Calculates the minimum amount of time required for the given potion to be effective, and adds to the entity.
     *
     * @param entity    What entity to add the potion effect to (must be instance of EntityLivingBase
     * @param potion    Which potion to apply
     * @param amplifier What level of potion will be applied (Careful, this is 0-indexed)
     */
    public static void addPotionEffect(EntityLivingBase entity, Potion potion, int amplifier) {
        PotionEffect activeEffect = entity.getActivePotionEffect(potion);
        //Get the minimum amount of time needed for this potion to have an effect. Necessary to allow potions
        // like regeneration and poison to count down and have an effect on the player
        int duration = 10;
        for (int i = duration; i < 1000; i++) {
            if (potion.isReady(i, amplifier)) {
                duration = i;
                break;
            }
        }

        //Night vision specifically flickers when given less than 10 seconds duration, hence hard-coding duration here
        if (potion == MobEffects.NIGHT_VISION) {
            entity.addPotionEffect(new PotionEffect(potion, 210, amplifier, false, false));
            //Add the potion effect to the target if it isn't already effected, or is about to run out.
        } else if (activeEffect == null || activeEffect.getDuration() < 10) {
            entity.addPotionEffect(new PotionEffect(potion, duration, amplifier, false, false));
        }
    }


}
