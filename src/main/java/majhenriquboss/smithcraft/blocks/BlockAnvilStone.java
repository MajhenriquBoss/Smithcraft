package majhenriquboss.smithcraft.blocks;

import majhenriquboss.smithcraft.api.IForgeable;
import majhenriquboss.smithcraft.items.ItemHammer;
import majhenriquboss.smithcraft.items.ItemIronPlate;
import majhenriquboss.smithcraft.lib.Strings;
import majhenriquboss.smithcraft.tileentities.TileEntityAnvilStone;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
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
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par1, float par2, float par3, float par4) {
        TileEntityAnvilStone te = (TileEntityAnvilStone)world.getTileEntity(x, y, z);

        /* PLACING */
        if (player.getHeldItem() != null && player.getHeldItem().getItem() instanceof IForgeable) {
            //Place in face
            if (!player.isSneaking()) {
                ItemStack stack = player.getHeldItem().splitStack(1);
                if (te.getStackInSlot(0) == null) {
                    te.setInventorySlotContents(1, stack);
                    return true;
                } else if (!world.isRemote)
                    player.addChatMessage(new ChatComponentText("There already is an item in the face of this anvil"));
            }
            //Place in horn
            else if (player.isSneaking() && te.getStackInSlot(1) != null) {
                ItemStack stack = player.getHeldItem().splitStack(1);
                if (te.getStackInSlot(1) == null) {
                    te.setInventorySlotContents(1, stack);
                    return true;
                } else if (!world.isRemote)
                    player.addChatMessage(new ChatComponentText("There already is an item in the horn of this anvil"));
            }
        }

        /* TAKING THE ITEMS BACK */
        if (player.isSneaking()) {
            for (int i = 0; i < 2; i++) {
                ItemStack stack = te.getStackInSlot(i);
                te.setInventorySlotContents(i, null);
                player.dropPlayerItemWithRandomChoice(stack, false);
            }
            return true;
        }
        player.addChatMessage(new ChatComponentText("Hi!"));
        /* HAMMERING */
        if (!player.isSneaking() && player.getHeldItem().getItem() == new ItemHammer() && te.getStackInSlot(0) != null) {
            player.addChatMessage(new ChatComponentText("It's a hammer..."));
            if (te.getStackInSlot(0).getItem() == new ItemIronPlate()) {
                player.addChatMessage(new ChatComponentText("...it's a plate..."));
                ItemStack stack = te.getStackInSlot(0);
                Item item = stack.getItem();
                if (item instanceof ItemIronPlate) {
                    player.addChatMessage(new ChatComponentText("...got the item..."));
                    ItemIronPlate ironPlate = (ItemIronPlate) item;
                    ironPlate.hit(1, 0, 25);
                    player.addChatMessage(new ChatComponentText("...hit!"));
                    te.setInventorySlotContents(0, new ItemStack(ironPlate));
                    return true;
                }
            }
        }

        if (player.getHeldItem() == null) return false;

        return false;
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
