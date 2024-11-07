package com.raptormm4.palegardenplus.datagen;

import com.raptormm4.palegardenplus.block.ModBlocks;
import com.raptormm4.palegardenplus.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALE_MOSS_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALE_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALE_OAK_LEAVES);
        blockStateModelGenerator.registerLog(ModBlocks.PALE_OAK_LOG).log(ModBlocks.PALE_OAK_LOG).wood(ModBlocks.PALE_OAK_WOOD);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WHITE_PUMPKIN_SEEDS, Models.GENERATED);
    }
}
