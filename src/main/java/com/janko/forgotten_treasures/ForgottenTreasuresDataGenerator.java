package com.janko.forgotten_treasures;

import com.janko.forgotten_treasures.datagen.ModItemTagProvider;
import com.janko.forgotten_treasures.datagen.ModLangProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ForgottenTreasuresDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
			pack.addProvider(ModLangProvider::new);
			pack.addProvider(ModItemTagProvider::new);
	}
}
