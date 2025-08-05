package com.janko.forgotten_treasures;

import com.janko.forgotten_treasures.item.ModItems;
import com.janko.forgotten_treasures.util.TooltipUtil;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class ForgottenTreasuresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ItemTooltipCallback.EVENT.register((stack, context, type, lines) -> {
            if (stack.getItem() == ModItems.DIVING_HELMET) {
                List<Text> lore = List.of(
                        Text.translatable("diving_helmet.tooltip_1").formatted(Formatting.GRAY),
                        Text.translatable("diving_helmet.tooltip_2").formatted(Formatting.BLUE)
                );
                TooltipUtil.insertAboveItemId(stack, lines, lore);
            }
        });
    }
}