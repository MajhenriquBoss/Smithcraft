package majhenriquboss.smithcraft.fluids.blocks;

import majhenriquboss.smithcraft.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

/**
*@author MajhenriquBoss
*/

public class BlockMoltenIron extends BlockMoltenMetalSC {


    public BlockMoltenIron(Fluid fluid, Material material) {
        super(fluid, material);
        this.setBlockName(Strings.Fluids.MOLTEN_IRON);
    }

}
