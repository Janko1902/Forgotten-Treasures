package com.janko.forgotten_treasures;

import com.janko.forgotten_treasures.item.ModItemGroups;
import com.janko.forgotten_treasures.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForgottenTreasures implements ModInitializer {
	public static final String MOD_ID = "forgotten_treasures";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier ID(String path){
		return Identifier.of(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}