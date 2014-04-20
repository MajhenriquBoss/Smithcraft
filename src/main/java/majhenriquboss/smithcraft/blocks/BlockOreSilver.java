package majhenriquboss.smithcraft.blocks;

import majhenriquboss.smithcraft.lib.Strings;
import net.minecraft.block.material.Material;

/**
*@author MajhenriquBoss
*/

public class BlockOreSilver extends BlockSC {

    public BlockOreSilver(Material material) {
        super(material);
        this.setBlockName(Strings.Blocks.ORE_SILVER);
        this.setHardness(5F);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(soundTypeStone);
    }
}
