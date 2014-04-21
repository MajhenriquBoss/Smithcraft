package majhenriquboss.smithcraft.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

/**
*@author MajhenriquBoss
*/

public class TileEntityForge extends TileEntity implements IInventory {

    private ItemStack[] inv;
    public int orientation;

    public TileEntityForge() {
        inv = new ItemStack[2];
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {

    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {

    }

    //IInventory
    @Override
    public int getSizeInventory() {
        return inv.length;
    }

    @Override
    public ItemStack getStackInSlot(int slot) {
        return inv[slot];
    }

    @Override
    public ItemStack decrStackSize(int slot, int count) {
        ItemStack stack = getStackInSlot(slot);

        if (stack != null) {

            if (stack.stackSize <= count) {
                setInventorySlotContents(slot, null);
                stack.stackSize = 0;
            } else {
                stack = stack.splitStack(count);
                setInventorySlotContents(slot, stack);
            }

        }

        return stack;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int var1) {
        return null;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack) {
        if (stack != null && stack.stackSize > getInventoryStackLimit()) {
            stack.stackSize = getInventoryStackLimit();
        }

        inv[slot] = stack;
    }

    @Override
    public String getInventoryName() {
        return "Forge";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return true;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public void markDirty() {}

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) <= 4;
    }

    @Override
    public void openInventory() {}

    @Override
    public void closeInventory() {}

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        if (slot == 0) {
            return stack.isItemEqual(new ItemStack(Items.iron_ingot));
        } else if (slot == 1) {
            return stack.isItemEqual(new ItemStack(Items.coal));
        } else {
            return false;
        }
    }

}
