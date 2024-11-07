package com.raptormm4.palegardenplus.datagen;

import com.raptormm4.palegardenplus.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.PALE_MOSS_BLOCK);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.PALE_OAK_PLANKS)
                .add(ModBlocks.PALE_OAK_WOOD)
                .add(ModBlocks.PALE_OAK_LOG)
                .add(ModBlocks.WHITE_PUMPKIN)
                .add(ModBlocks.CARVED_WHITE_PUMPKIN)
                .add(ModBlocks.WHITE_JACK_O_LANTERN)
                .add(ModBlocks.WHITE_SOUL_O_LANTERN);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.PALE_OAK_LEAVES);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.PALE_OAK_LOG)
                .add(ModBlocks.PALE_OAK_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PALE_OAK_LOG)
                .add(ModBlocks.PALE_OAK_WOOD);
    }
}
