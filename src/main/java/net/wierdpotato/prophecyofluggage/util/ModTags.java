package net.wierdpotato.prophecyofluggage.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.wierdpotato.prophecyofluggage.ProphecyofLuggage;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ProphecyofLuggage.MOD_ID, name));
        }

    }

    public static class Items {
        public static final TagKey<Item> LEANBLOCK_STEVE = createTag("leanblock_steve");
        public static final TagKey<Item> LEANBLOCK_LEANSLOP = createTag("leanblock_leanslop");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ProphecyofLuggage.MOD_ID, name));
        }
    }
}

