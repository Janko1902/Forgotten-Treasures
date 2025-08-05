package com.janko.forgotten_treasures.datagen;

import com.janko.forgotten_treasures.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLangProvider extends FabricLanguageProvider {
    public ModLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.DIVING_HELMET, "Diving Helmet");
        translationBuilder.add("diving_helmet.tooltip_1", "When equipped:");
        translationBuilder.add("diving_helmet.tooltip_2", "Infinite Water Breathing");

        translationBuilder.add(ModItems.SNEAKERS, "Sneakers");
    }
}
