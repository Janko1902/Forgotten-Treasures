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
                        Text.translatable("when_equipped.tooltip").formatted(Formatting.GRAY),
                        Text.translatable("diving_helmet.tooltip").formatted(Formatting.BLUE)
                );
                TooltipUtil.insertAboveItemId(stack, lines, lore);
            } else if (stack.getItem() == ModItems.NIGHT_VISION_GOGGLES) {
                List<Text> lore = List.of(
                        Text.translatable("when_equipped.tooltip").formatted(Formatting.GRAY),
                        Text.translatable("night_vision_goggles.tooltip").formatted(Formatting.BLUE)
                );
                TooltipUtil.insertAboveItemId(stack, lines, lore);
            }
        });
    }
}