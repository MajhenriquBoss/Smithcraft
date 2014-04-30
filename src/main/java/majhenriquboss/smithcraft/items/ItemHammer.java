package majhenriquboss.smithcraft.items;

import majhenriquboss.smithcraft.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
*@author MajhenriquBoss
*/

public class ItemHammer extends ItemSC {

    public ItemHammer() {
        this.setUnlocalizedName(Strings.Items.HAMMER);
        this.setMaxStackSize(1);
        this.setMaxDamage(256);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z, EntityLivingBase entity) {
        stack.setItemDamage(stack.getItemDamage() + 1);
        if (stack.getItemDamage() >= this.getMaxDamage()) {
            stack = null;
            return false;
        }
        return true;
    }
}
