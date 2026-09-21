package dev.matthiesen.cobblemon_indestructible_habitat.neoforge;

import dev.matthiesen.cobblemon_indestructible_habitat.common.CobblemonIndestructibleHabitat;
import net.neoforged.fml.common.Mod;

@Mod(CobblemonIndestructibleHabitat.MOD_ID)
public final class CobblemonIndestructibleHabitatNeoForge {
    public static final CobblemonIndestructibleHabitat INSTANCE = CobblemonIndestructibleHabitat.INSTANCE;

    public CobblemonIndestructibleHabitatNeoForge() {
        INSTANCE.createInfoLog("Loading for NeoForge Mod Loader");
        INSTANCE.initialize();
    }
}
