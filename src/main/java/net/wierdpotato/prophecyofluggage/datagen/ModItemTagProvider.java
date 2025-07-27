package net.wierdpotato.prophecyofluggage.datagen;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.wierdpotato.prophecyofluggage.ProphecyofLuggage;
import net.wierdpotato.prophecyofluggage.block.ModBlocks;
import net.wierdpotato.prophecyofluggage.item.ModItems;
import net.wierdpotato.prophecyofluggage.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {

    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, ProphecyofLuggage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.LEANBLOCK_LEANSLOP)
                .add(ModBlocks.LUGGAGE_BLOCK.asItem())
                .add(ModItems.LUGGAGE.get());


        tag(ModTags.Items.LEANBLOCK_STEVE)
                .add(ModItems.JACKBLAKC_CHAR.get())
                .add(ModItems.JACKBLAKC.get());



    }
}
