package com.teammetallurgy.atum.blocks.glass;

import com.teammetallurgy.atum.utils.IOreDictEntry;
import com.teammetallurgy.atum.utils.OreDictHelper;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockAtumGlass extends BlockGlass implements IOreDictEntry {

    public BlockAtumGlass() {
        super(Material.GLASS, false);
        this.setSoundType(SoundType.GLASS);
        this.setHardness(0.3F);
    }

    @Override
    public void getOreDictEntries() {
        OreDictHelper.add(this, "blockGlass");
    }
}