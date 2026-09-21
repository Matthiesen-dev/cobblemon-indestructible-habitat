package dev.matthiesen.cobblemon_indestructible_habitat.fabric;

import dev.matthiesen.cobblemon_indestructible_habitat.common.CobblemonIndestructibleHabitat;
import net.fabricmc.api.ModInitializer;

public final class CobblemonIndestructibleHabitatFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        var instance = CobblemonIndestructibleHabitat.INSTANCE;
        instance.createInfoLog("Loading for Fabric Mod Loader");
        instance.initialize();
    }
}
