package com.raptormm4.palegardenplus.datagen;

import com.raptormm4.palegardenplus.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_OAK_PLANKS, 4)
                .input(ModBlocks.PALE_OAK_LOG).criterion(FabricRecipeProvider.hasItem(ModBlocks.PALE_OAK_LOG),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.PALE_OAK_LOG)).offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WHITE_JACK_O_LANTERN)
                .pattern("a")
                .pattern("b")
                .input('a', ModBlocks.CARVED_WHITE_PUMPKIN)
                .input('b', Blocks.TORCH)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CARVED_WHITE_PUMPKIN),
                                FabricRecipeProvider.conditionsFromItem(ModBlocks.CARVED_WHITE_PUMPKIN))
                .criterion(FabricRecipeProvider.hasItem(Blocks.TORCH),
                                FabricRecipeProvider.conditionsFromItem(Blocks.TORCH))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WHITE_SOUL_O_LANTERN)
                .pattern("a")
                .pattern("b")
                .input('a', ModBlocks.CARVED_WHITE_PUMPKIN)
                .input('b', Blocks.SOUL_TORCH)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CARVED_WHITE_PUMPKIN),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.CARVED_WHITE_PUMPKIN))
                .criterion(FabricRecipeProvider.hasItem(Blocks.SOUL_TORCH),
                        FabricRecipeProvider.conditionsFromItem(Blocks.SOUL_TORCH))
                .offerTo(recipeExporter);
    }
}
