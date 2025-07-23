package net.wierdpotato.prophecyofluggage.sound;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, "prophecyofluggage");

    public static final DeferredHolder<SoundEvent, SoundEvent> FLINTNSTEEL = SOUND_EVENTS.register(
            "flintnsteel",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("prophecyofluggage","flintnsteel"))
    );
}
