package majhenriquboss.smithcraft.client.renderers;

import majhenriquboss.smithcraft.Smithcraft;
import majhenriquboss.smithcraft.client.models.ModelEntityBlacksmith;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;

/**
*@author MajhenriquBoss
*/

public class EntityBlacksmithRenderer extends EntityRenderer {

    private static final ResourceLocation texture = new ResourceLocation(Smithcraft.MODID, "textures/entities/blacksmith.png");
    protected ModelEntityBlacksmith model;

    public EntityBlacksmithRenderer(Minecraft mc, IResourceManager resource) {
        super(mc, resource);
    }

}
