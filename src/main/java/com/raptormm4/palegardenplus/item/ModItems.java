package com.raptormm4.palegardenplus.item;

import com.raptormm4.palegardenplus.PaleGardenPlus;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WHITE_PUMPKIN_SEEDS = registerItem("white_pumpkin_seeds", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PaleGardenPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PaleGardenPlus.LOGGER.info("Registering mod items for " + PaleGardenPlus.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(WHITE_PUMPKIN_SEEDS);
        });
    }
}
