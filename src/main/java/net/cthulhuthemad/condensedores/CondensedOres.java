package net.cthulhuthemad.condensedores;

import net.cthulhuthemad.condensedores.block.ModBlocks;
import net.cthulhuthemad.condensedores.world.feature.ModConfiguredFeature;
import net.cthulhuthemad.condensedores.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CondensedOres implements ModInitializer {
	public static final String MOD_ID = "condensedores";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeature.registerConfiguredFeatures();

		ModBlocks.registerBlocks();

		ModWorldGen.generateModWorldGen();

		LOGGER.info("Now loading " + CondensedOres.MOD_ID);
	}
}
