package dev.matthiesen.cobblemon_indestructible_habitat.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class CobblemonIndestructibleHabitat {
    public static final String MOD_ID = "cobblemon_indestructible_habitat";
    public static final String MOD_NAME = "Cobblemon Indestructible Habitat";
    private static final Logger LOGGER = LogManager.getLogger(MOD_NAME);
    public static final CobblemonIndestructibleHabitat INSTANCE = new CobblemonIndestructibleHabitat();

    public CobblemonIndestructibleHabitat() {
    }

    public void initialize() {
        createInfoLog("Initializing " + MOD_NAME + " (" + MOD_ID + ")");
    }

    public void createInfoLog(String message) {
        LOGGER.info(message);
    }
}
