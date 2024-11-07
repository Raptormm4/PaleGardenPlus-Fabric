package com.raptormm4.palegardenplus.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.WearableCarvedPumpkinBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Equipment;

public class WearableWhiteCarvedPumpkinBlock extends CarvedWhitePumpkinBlock implements Equipment {
    public static final MapCodec<WearableWhiteCarvedPumpkinBlock> CODEC = createCodec(WearableWhiteCarvedPumpkinBlock::new);

    @Override
    public MapCodec<WearableWhiteCarvedPumpkinBlock> getCodec() {
        return CODEC;
    }

    public WearableWhiteCarvedPumpkinBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public EquipmentSlot getSlotType() {
        return EquipmentSlot.HEAD;
    }
}
