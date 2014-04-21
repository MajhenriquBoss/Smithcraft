package majhenriquboss.smithcraft;

import cpw.mods.fml.common.registry.GameRegistry;
import majhenriquboss.smithcraft.blocks.BlockOreCopper;
import majhenriquboss.smithcraft.items.ItemIngotCopper;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
*@author MajhenriquBoss
*/

public class CraftingManager {

    public static void registerRecipes() {
        GameRegistry.addSmelting(Smithcraft.oreCopper, new ItemStack(Smithcraft.ingotCopper), 5F);
        GameRegistry.addSmelting(Smithcraft.oreTin, new ItemStack(Smithcraft.ingotTin), 5F);
        GameRegistry.addSmelting(Smithcraft.oreSilver, new ItemStack(Smithcraft.ingotSilver), 5F);
        GameRegistry.addRecipe(new ItemStack(Smithcraft.hammer), new Object[] {
                " # ",
                " /#",
                "/  ",
                '#', Items.iron_ingot,
                '/', Items.stick
        });
    }

}
