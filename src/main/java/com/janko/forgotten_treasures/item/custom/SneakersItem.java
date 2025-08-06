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

public class SneakersItem extends TreasureItem {
    public SneakersItem(Settings settings) {
        super(settings);
    }

    public Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, Identifier identifier) {
        var modifiers = super.getModifiers(stack, slot, entity, identifier);
        modifiers.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(ForgottenTreasures.ID("generic_movement_speed"), 0.2, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
        return modifiers;
    }
}
