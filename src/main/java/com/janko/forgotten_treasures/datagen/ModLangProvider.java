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
        translationBuilder.add("when_equipped.tooltip", "When equipped:");

        translationBuilder.add(ModItems.DIVING_HELMET, "Diving Helmet");
        translationBuilder.add("diving_helmet.tooltip", "Infinite Water Breathing");

        translationBuilder.add(ModItems.NIGHT_VISION_GOGGLES, "Night Vision Goggles");
        translationBuilder.add("night_vision_goggles.tooltip", "Infinite Night Vision");


        translationBuilder.add(ModItems.SNEAKERS, "Sneakers");
        translationBuilder.add(ModItems.DIVING_FINS, "Diving Fins");
    }
}
