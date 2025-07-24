package net.wierdpotato.prophecyofluggage.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.wierdpotato.prophecyofluggage.ProphecyofLuggage;
import net.wierdpotato.prophecyofluggage.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ProphecyofLuggage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.JACKBLAKC.get());
        basicItem(ModItems.JACKBLAKC_CHAR.get());
        basicItem(ModItems.LUGGAGE.get());

    }
}
