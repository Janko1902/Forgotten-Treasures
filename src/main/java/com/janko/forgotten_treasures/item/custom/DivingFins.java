package com.janko.forgotten_treasures.item.custom;

import com.google.common.collect.Multimap;
import com.janko.forgotten_treasures.ForgottenTreasures;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class DivingFins extends TreasureItem {
    public DivingFins(Settings settings) {
        super(settings);
    }

    public Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, Identifier identifier) {
        var modifiers = super.getModifiers(stack, slot, entity, identifier);
        modifiers.put(EntityAttributes.GENERIC_WATER_MOVEMENT_EFFICIENCY, new EntityAttributeModifier(ForgottenTreasures.ID("generic_water_movement_efficiency"), 0.5, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
        return modifiers;
    }
}
