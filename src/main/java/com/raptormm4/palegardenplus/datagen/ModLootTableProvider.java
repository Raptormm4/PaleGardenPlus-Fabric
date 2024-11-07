package com.raptormm4.palegardenplus.datagen;

import com.raptormm4.palegardenplus.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PALE_MOSS_BLOCK);
        addDrop(ModBlocks.PALE_OAK_PLANKS);
        addDrop(ModBlocks.PALE_OAK_WOOD);
        addDrop(ModBlocks.PALE_OAK_LOG);
        addDrop(ModBlocks.WHITE_PUMPKIN);
        addDrop(ModBlocks.CARVED_WHITE_PUMPKIN);
        addDrop(ModBlocks.WHITE_JACK_O_LANTERN);
        addDrop(ModBlocks.WHITE_SOUL_O_LANTERN);

        leavesDrops(ModBlocks.PALE_OAK_LEAVES, ModBlocks.PALE_OAK_PLANKS, SAPLING_DROP_CHANCE);
    }
}
