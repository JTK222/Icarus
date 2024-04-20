package dev.cammiescorner.icarus.integration.figura;

import com.mojang.datafixers.util.Pair;
import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.client.models.WingEntityModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import org.figuramc.figura.entries.FiguraVanillaPart;
import org.figuramc.figura.entries.annotations.FiguraVanillaPartPlugin;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

@SuppressWarnings("unused")
@FiguraVanillaPartPlugin
public class IcarusFiguraModelPartsPlugin implements FiguraVanillaPart {

    @Override
    public String getID() {
        return Icarus.MODID;
    }

    @Override
    public Collection<Pair<String, Function<EntityModel<?>, ModelPart>>> getParts() {
        return List.of(
                new Pair<>("right_wing", model -> model instanceof WingEntityModel<?> wingModel ? wingModel.rightWing : null),
                new Pair<>("left_wing", model -> model instanceof WingEntityModel<?> wingModel ? wingModel.leftWing : null)
        );
    }
}
