package majhenriquboss.smithcraft.client.renderers;

import majhenriquboss.smithcraft.Smithcraft;
import majhenriquboss.smithcraft.client.models.ModelForge;
import majhenriquboss.smithcraft.lib.Textures;
import majhenriquboss.smithcraft.tileentities.TileEntityForge;
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
    private final ResourceLocation texture = Textures.FORGE;

    public ForgeRenderer() { model = new ModelForge(); }

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
        this.bindTexture(texture);
        TileEntityForge tile = (TileEntityForge) te;
        int orientation = tile.orientation;
        int direction = 1;
        switch (orientation) {
            case 2: direction = 0;
            case 5: direction = 1;
            case 3: direction = 2;
            case 4: direction = 3;
        }

        //TODO make the block face player
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        GL11.glPushMatrix();
        GL11.glRotatef(180F, direction * 90F, 0F, 1F);
        this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
