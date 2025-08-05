package com.janko.forgotten_treasures.datagen;

import com.janko.forgotten_treasures.item.ModItems;
import com.janko.forgotten_treasures.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.HAT)
                .add(ModItems.DIVING_HELMET);

        getOrCreateTagBuilder(ModTags.Items.FACE)
                .add(ModItems.NIGHT_VISION_GOGGLES);

        getOrCreateTagBuilder(ModTags.Items.SHOES)
                .add(ModItems.SNEAKERS);
    }
}
