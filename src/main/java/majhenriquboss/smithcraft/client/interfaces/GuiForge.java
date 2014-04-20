package majhenriquboss.smithcraft.client.interfaces;

import majhenriquboss.smithcraft.Smithcraft;
import majhenriquboss.smithcraft.tileentities.TileEntityForge;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
*@author MajhenriquBoss
*/

public class GuiForge extends GuiContainer {


    public GuiForge(InventoryPlayer invPlayer, TileEntityForge forge) {
        super(new ContainerForge(invPlayer, forge));

        xSize = 230;
        ySize = 219;
    }

    private static final ResourceLocation texture = new ResourceLocation(Smithcraft.MODID.toLowerCase(), "textures/gui/forgeGUI.png");

    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int x, int y) {
        GL11.glColor4f(1, 1, 1, 1);
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);

        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

    }
}
