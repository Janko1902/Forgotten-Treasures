package com.janko.forgotten_treasures;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForgottenTreasures implements ModInitializer {
	public static final String MOD_ID = "forgotten-treasures";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier ID(String path){
		return Identifier.of(MOD_ID, path);
	}

	@Override
	public void onInitialize() {

	}
}