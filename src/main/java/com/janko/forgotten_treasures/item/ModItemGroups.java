package com.janko.forgotten_treasures.item;

import com.janko.forgotten_treasures.ForgottenTreasures;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FORGOTTEN_TREASURES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ForgottenTreasures.MOD_ID, "forgotten_treasures"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.NIGHT_VISION_GOGGLES))
                    .displayName(Text.translatable("itemgroup.forgotten_treasures"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DIVING_HELMET);

                        entries.add(ModItems.NIGHT_VISION_GOGGLES);

                        entries.add(ModItems.SNEAKERS);
                        entries.add(ModItems.DIVING_FINS);
                    }).build());

    public static void registerItemGroups() {
        ForgottenTreasures.LOGGER.info("Registering Item Groups for " + ForgottenTreasures.MOD_ID);
    }
}
