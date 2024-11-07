package com.raptormm4.palegardenplus.block;

import com.raptormm4.palegardenplus.PaleGardenPlus;
import com.raptormm4.palegardenplus.block.custom.BriarShrubBlock;
import com.raptormm4.palegardenplus.block.custom.CarvedWhitePumpkinBlock;
import com.raptormm4.palegardenplus.block.custom.WearableWhiteCarvedPumpkinBlock;
import com.raptormm4.palegardenplus.block.custom.WhitePumpkinBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block PALE_MOSS_BLOCK = registerBlock("pale_moss_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(.1f)
                    .sounds(BlockSoundGroup.MOSS_BLOCK)));

    public static final Block PALE_OAK_PLANKS = registerBlock("pale_oak_planks",
            new Block(AbstractBlock.Settings.create()
                    .strength(1f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block PALE_OAK_LOG = registerBlock("pale_oak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LOG)));
    public static final Block PALE_OAK_WOOD = registerBlock("pale_oak_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD)));
    public static final Block PALE_OAK_LEAVES = registerBlock("pale_oak_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .strength(0.1f)
                    .sounds(BlockSoundGroup.CHERRY_LEAVES)
                    .burnable()
                    .nonOpaque()));

    public static final Block WHITE_PUMPKIN = registerBlock("white_pumpkin",
            new WhitePumpkinBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .strength(1.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .allowsSpawning(Blocks::always)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CARVED_WHITE_PUMPKIN = registerBlock("carved_white_pumpkin",
            new WearableWhiteCarvedPumpkinBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .strength(1.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .allowsSpawning(Blocks::always)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_JACK_O_LANTERN = registerBlock("white_jack_o_lantern",
            new CarvedWhitePumpkinBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .strength(1.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .luminance(state -> 14)
                    .allowsSpawning(Blocks::always)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_SOUL_O_LANTERN = registerBlock("white_soul_o_lantern",
            new CarvedWhitePumpkinBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .strength(1.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .luminance(state -> 10)
                    .allowsSpawning(Blocks::always)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    /*
    public static final Block BRIAR_SHRUB = registerBlock("briar_shrub",
            new BriarShrubBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_GRAY)
                    .strength(0.4f)
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH)
                    .noCollision()
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    */

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PaleGardenPlus.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(PaleGardenPlus.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        PaleGardenPlus.LOGGER.info("Registering ModBlocks for " + PaleGardenPlus.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.PALE_MOSS_BLOCK);
            entries.add(ModBlocks.PALE_OAK_LOG);
            entries.add(ModBlocks.WHITE_PUMPKIN);
            entries.add(ModBlocks.CARVED_WHITE_PUMPKIN);
            entries.add(ModBlocks.WHITE_JACK_O_LANTERN);
            entries.add(ModBlocks.WHITE_SOUL_O_LANTERN);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.PALE_OAK_PLANKS);
            entries.add(ModBlocks.PALE_OAK_WOOD);
        });
    }
}
