package majhenriquboss.smithcraft.blocks;

import majhenriquboss.smithcraft.lib.Strings;
import net.minecraft.block.material.Material;

/**
*@author MajhenriquBoss
*/

public class BlockOreTin extends BlockSC {

    public BlockOreTin(Material material) {
        super(material);
        this.setBlockName(Strings.Blocks.ORE_TIN);
        this.setStepSound(soundTypeStone);
        this.setHardness(3F);
        this.setHarvestLevel("pickaxe", 1);
    }
}
