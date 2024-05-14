package dev.cammiescorner.icarus.client;

import dev.cammiescorner.icarus.api.IcarusPlayerValues;
import dev.cammiescorner.icarus.util.ServerPlayerFallbackValues;

public class ClientPlayerFallbackValues extends ServerPlayerFallbackValues implements IcarusPlayerValues {

    private final float wingsSpeed;
    private final boolean armorSlows;
    private final float maxSlowedMultiplier;
    private final boolean canLoopDeLoop;
    private final float requiredFoodAmount;

    public ClientPlayerFallbackValues(float wingsSpeed, float maxSlowedMultiplier, boolean armorSlows, boolean canLoopDeLoop, float requiredFoodAmount) {
        this.wingsSpeed = wingsSpeed;
        this.armorSlows = armorSlows;
        this.maxSlowedMultiplier = maxSlowedMultiplier;
        this.canLoopDeLoop = canLoopDeLoop;
        this.requiredFoodAmount = requiredFoodAmount;
    }

    @Override
    public float wingsSpeed() {
        return wingsSpeed;
    }

    @Override
    public float maxSlowedMultiplier() {
        return maxSlowedMultiplier;
    }

    @Override
    public boolean armorSlows() {
        return armorSlows;
    }

    @Override
    public boolean canLoopDeLoop() {
        return canLoopDeLoop;
    }

    @Override
    public float requiredFoodAmount() {
        return requiredFoodAmount;
    }
}
