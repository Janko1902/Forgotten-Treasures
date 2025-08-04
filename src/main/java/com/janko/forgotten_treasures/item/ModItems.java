package com.janko.forgotten_treasures.item;

import com.janko.forgotten_treasures.ForgottenTreasures;
import com.janko.forgotten_treasures.item.custom.DivingHelmetItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems {
    public static final Item DIVING_HELMET = registerItem("diving_helmet",
            new DivingHelmetItem(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, ForgottenTreasures.ID(name), item);
    }

    public static void registerModItems() {
        ForgottenTreasures.LOGGER.info("Registering Items for " + ForgottenTreasures.MOD_ID);
    }
}
