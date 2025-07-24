package net.wierdpotato.prophecyofluggage.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.ItemLike;
import net.wierdpotato.prophecyofluggage.block.ModBlocks;
import net.wierdpotato.prophecyofluggage.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> CHARRABLES = List.of(ModItems.JACKBLAKC);

        Object Mod;
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LUGGAGE_BLOCK.get())
                .pattern("lll")
                .pattern("lll")
                .pattern("lll")
                .define('l', ModItems.LUGGAGE.get())
                .unlockedBy("has_luggage", has(ModItems.LUGGAGE));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LUGGAGE.get(), 9)
                .requires(ModBlocks.LUGGAGE_BLOCK.get())
                .unlockedBy("has_luggage_block", has(ModBlocks.LUGGAGE_BLOCK));

        oreSmelting(recipeOutput, CHARRABLES, RecipeCategory.MISC, ModItems.JACKBLAKC_CHAR.get(), 1f, 200, "jackblakc_char");
        oreBlasting(recipeOutput, CHARRABLES, RecipeCategory.MISC, ModItems.JACKBLAKC_CHAR.get(), 1f, 100, "jackblakc_char");
    }
}
