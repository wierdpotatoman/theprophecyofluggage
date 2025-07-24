package net.wierdpotato.prophecyofluggage.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.wierdpotato.prophecyofluggage.ProphecyofLuggage;
import net.wierdpotato.prophecyofluggage.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ProphecyofLuggage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.LEAN_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL);
                //.add(ModBlocks.);
        tag(BlockTags.NEEDS_DIAMOND_TOOL);
                //.add(ModBlocks.);



    }
}

