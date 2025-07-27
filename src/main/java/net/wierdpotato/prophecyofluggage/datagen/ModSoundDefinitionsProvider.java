package net.wierdpotato.prophecyofluggage.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SoundDefinition;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;
import net.wierdpotato.prophecyofluggage.ProphecyofLuggage;
import net.wierdpotato.prophecyofluggage.sound.ModSoundEvents;

public class ModSoundDefinitionsProvider extends SoundDefinitionsProvider {
    public ModSoundDefinitionsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ProphecyofLuggage.MOD_ID, existingFileHelper);
    }

    @Override
    public void registerSounds() {
        add(ModSoundEvents.FLINTNSTEEL, SoundDefinition.definition()
                .with(
                        sound("prophecyofluggage:flintnsteel", SoundDefinition.SoundType.SOUND)
                                .volume(1f)
                )
                .subtitle("jackblack")
        );

        add(ModSoundEvents.ANDROIDNOTIF, SoundDefinition.definition()
                .with(
                        sound("prophecyofluggage:androidnotif", SoundDefinition.SoundType.SOUND)
                                .volume(1f)
                )
                .subtitle("androidnotificationsoundeffectorsomething")

        );


    }
}
