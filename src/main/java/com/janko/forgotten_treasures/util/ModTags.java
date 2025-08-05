package com.janko.forgotten_treasures.util;

import com.janko.forgotten_treasures.ForgottenTreasures;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> HAT = createTag("head/hat");

        public static final TagKey<Item> SHOES = createTag("feet/shoes");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ForgottenTreasures.MOD_ID, name));
        }
    }
}
