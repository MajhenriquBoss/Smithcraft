package majhenriquboss.smithcraft.blocks;

import majhenriquboss.smithcraft.lib.Strings;
import net.minecraft.block.material.Material;

/**
*@author MajhenriquBoss
*/

public class BlockOreCopper extends BlockSC {


    public BlockOreCopper(Material material) {
        super(material);
        this.setBlockName(Strings.Blocks.ORE_COPPER);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(3F);
    }
}
