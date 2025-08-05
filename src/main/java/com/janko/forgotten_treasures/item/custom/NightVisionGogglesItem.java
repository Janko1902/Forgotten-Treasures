package com.janko.forgotten_treasures.item.custom;

import com.google.common.collect.Multimap;
import com.janko.forgotten_treasures.ForgottenTreasures;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class NightVisionGogglesItem extends TreasureItem{
    public NightVisionGogglesItem(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        World world = entity.getWorld();
        if (!world.isClient) {
            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.NIGHT_VISION,
                    105,
                    0,
                    false,
                    false
            ));
        }
    }
}
