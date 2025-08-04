package com.janko.forgotten_treasures.item.custom;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DivingHelmetItem extends TrinketItem {
    public DivingHelmetItem(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        World world = entity.getWorld();
        if (!world.isClient) {
            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.WATER_BREATHING,
                    105,
                    0,
                    false,
                    false
            ));
        }
    }
}
