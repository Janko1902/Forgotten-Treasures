package com.janko.forgotten_treasures.util;

import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;

import java.util.List;

public class TooltipUtil {
    public static void insertAboveItemId(ItemStack stack, List<Text> lines, List<Text> tooltipsToAdd) {
        if (stack == null || lines == null || tooltipsToAdd == null) return;

        var id = Registries.ITEM.getId(stack.getItem());
        if (id == null) {
            lines.addAll(tooltipsToAdd);
            return;
        }
        String itemIdString = id.toString();

        int insertIndex = -1;
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).getString().equals(itemIdString)) {
                insertIndex = i;
                break;
            }
        }

        if (insertIndex != -1) {
            lines.addAll(insertIndex, tooltipsToAdd);
        } else {
            lines.addAll(tooltipsToAdd);
        }
    }
}
