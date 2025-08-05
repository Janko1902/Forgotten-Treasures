package com.janko.forgotten_treasures.item.custom;

import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.util.Rarity;

public class TreasureItem extends TrinketItem {
    public TreasureItem(Settings settings) {
        super(settings.maxCount(1).rarity(Rarity.EPIC));
    }
}
