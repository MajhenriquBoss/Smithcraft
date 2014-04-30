package majhenriquboss.smithcraft.tileentities;

import majhenriquboss.smithcraft.api.IForgeable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
*@author MajhenriquBoss
*/

public class TileEntityAnvilStone extends TileSC implements IInventory {

    @Override
    public void writeToNBT(NBTTagCompound nbt) {

    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {

    }

    private ItemStack[] inv = new ItemStack[2];

    /* IINVENTORY */
    @Override
    public int getSizeInventory() {
        return inv.length;
    }

    @Override
    public ItemStack getStackInSlot(int slot) {
        return inv[slot];
    }

    @Override
    public ItemStack decrStackSize(int slot, int amount) {
        ItemStack stack = getStackInSlot(slot);

        if (stack != null) {

            if (stack.stackSize <= amount) {
                setInventorySlotContents(slot, null);
                stack.stackSize = 0;
            } else {
                stack = stack.splitStack(amount);
                setInventorySlotContents(slot, stack);
            }

        }

        return stack;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slot) {
        return null;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack) {
        inv[slot] = stack;
    }

    @Override
    public String getInventoryName() {
        return "Stone Anvil";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return true;
    }

    @Override
    public int getInventoryStackLimit() {
        return 1;
    }

    @Override
    public void markDirty() {

    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return player.getDistance(xCoord, yCoord, zCoord) <= 2;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        return stack.getItem() instanceof IForgeable;
    }

}
