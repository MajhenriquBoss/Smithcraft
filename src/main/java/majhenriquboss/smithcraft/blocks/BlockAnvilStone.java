package majhenriquboss.smithcraft.blocks;

import majhenriquboss.smithcraft.Smithcraft;
import majhenriquboss.smithcraft.lib.Strings;
import majhenriquboss.smithcraft.tileentities.TileEntityAnvilStone;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
*@author MajhenriquBoss
*/

public class BlockAnvilStone extends BlockContainerSC {


    public BlockAnvilStone(Material material) {
        super(material);
        this.setBlockName(Strings.Blocks.ANVIL_STONE);
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(soundTypeStone);
        this.setHardness(3F);
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new TileEntityAnvilStone();
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

}
