package majhenriquboss.smithcraft.client.renderers;

import majhenriquboss.smithcraft.Smithcraft;
import majhenriquboss.smithcraft.client.models.ModelForge;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
*@author MajhenriquBoss
*/

public class ForgeRenderer extends TileEntitySpecialRenderer {

    private final ModelForge model;
    private final ResourceLocation texture = new ResourceLocation(Smithcraft.MODID.toLowerCase(), "textures/blocks/forge.png");

    public ForgeRenderer() { model = new ModelForge(); }

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
        this.bindTexture(texture);

        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
