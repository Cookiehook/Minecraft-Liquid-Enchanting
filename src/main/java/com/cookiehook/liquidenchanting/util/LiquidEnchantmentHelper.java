package com.cookiehook.liquidenchanting.util;


import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;


public class LiquidEnchantmentHelper {

    /**
     * Calculates the minimum amount of time required for the given potion to be effective, and adds to the entity.
     *
     * @param entity    What entity to add the potion effect to (must be instance of EntityLivingBase
     * @param potion    Which potion to apply
     * @param amplifier What level of potion will be applied (Careful, this is 0-indexed)
     */
    public static void addPotionEffect(LivingEntity entity, Effect potion, int amplifier) {
        EffectInstance activeEffect = entity.getActivePotionEffect(potion);
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
        if (potion == Effects.NIGHT_VISION) {
            entity.addPotionEffect(new EffectInstance(potion, 210, amplifier, false, false));
            //Add the potion effect to the target if it isn't already effected, or is about to run out.
        } else if (activeEffect == null || activeEffect.getDuration() < 10) {
            entity.addPotionEffect(new EffectInstance(potion, duration, amplifier, false, false));
        }
    }


}
