package majhenriquboss.smithcraft.fluids.blocks;

import majhenriquboss.smithcraft.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

/**
*@author MajhenriquBoss
*/

public class BlockMoltenSilver extends BlockMoltenMetalSC {


    public BlockMoltenSilver(Fluid fluid, Material material) {
        super(fluid, material);
        this.setBlockName(Strings.Fluids.MOLTEN_SILVER);
    }

}
