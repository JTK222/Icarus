package dev.cammiescorner.icarus.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class FlightlessStatusEffect extends MobEffect {

    public FlightlessStatusEffect(MobEffectCategory category, String color) {
        super(category, Integer.decode(color));
    }

}
