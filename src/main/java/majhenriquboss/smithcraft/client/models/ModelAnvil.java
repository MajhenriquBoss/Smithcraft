package majhenriquboss.smithcraft.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * @author MajhenriquBoss
 *         created with Techne
 */

public class ModelAnvil extends ModelBase {
    ModelRenderer Foot;
    ModelRenderer Leg;
    ModelRenderer TopBase;
    ModelRenderer Horn;

    public ModelAnvil() {
        textureWidth = 128;
        textureHeight = 32;

        Foot = new ModelRenderer(this, 0, 0);
        Foot.addBox(0F, 0F, 0F, 12, 2, 9);
        Foot.setRotationPoint(-6F, 22F, -4F);
        Foot.setTextureSize(64, 32);
        Foot.mirror = true;
        setRotation(Foot, 0F, 0F, 0F);
        Leg = new ModelRenderer(this, 0, 0);
        Leg.addBox(0F, 0F, 0F, 8, 5, 5);
        Leg.setRotationPoint(-4F, 17F, -2F);
        Leg.setTextureSize(64, 32);
        Leg.mirror = true;
        setRotation(Leg, 0F, 0F, 0F);
        TopBase = new ModelRenderer(this, 0, 0);
        TopBase.addBox(0F, 0F, 0F, 13, 7, 9);
        TopBase.setRotationPoint(-6F, 10F, -4F);
        TopBase.setTextureSize(64, 32);
        TopBase.mirror = true;
        setRotation(TopBase, 0F, 0F, 0F);
        Horn = new ModelRenderer(this, 0, 0);
        Horn.addBox(0F, 0F, 0F, 18, 4, 7);
        Horn.setRotationPoint(-10F, 11F, -3F);
        Horn.setTextureSize(64, 32);
        Horn.mirror = true;
        setRotation(Horn, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Foot.render(f5);
        Leg.render(f5);
        TopBase.render(f5);
        Horn.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
