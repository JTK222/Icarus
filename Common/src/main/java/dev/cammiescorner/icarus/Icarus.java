package dev.cammiescorner.icarus;

import com.teamresourceful.resourcefulconfig.common.config.Configurator;
import commonnetwork.api.Network;
import dev.cammiescorner.icarus.network.s2c.SyncConfigValuesPacket;
import net.minecraft.resources.ResourceLocation;

public class Icarus {

    public static final String MODID = "icarus";
    public static final Configurator CONFIGURATOR = new Configurator();

    public static void init() {
        CONFIGURATOR.registerConfig(IcarusConfig.class);

        Network.registerPacket(SyncConfigValuesPacket.ID, SyncConfigValuesPacket.class, SyncConfigValuesPacket::encode, SyncConfigValuesPacket::decode, SyncConfigValuesPacket::handle);
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MODID, path);
    }
}
