package majhenriquboss.smithcraft.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEntityBlacksmith extends ModelBase {
  //fields
    ModelRenderer legRight;
    ModelRenderer legLeft;
    ModelRenderer body;
    ModelRenderer armRight;
    ModelRenderer armLeft;
    ModelRenderer head;
  
  public ModelEntityBlacksmith() {
    textureWidth = 128;
    textureHeight = 64;
    
      legRight = new ModelRenderer(this, 93, 44);
      legRight.addBox(-2F, -1F, -2F, 4, 13, 4);
      legRight.setRotationPoint(-2F, 12F, 0F);
      legRight.setTextureSize(128, 64);
      legRight.mirror = true;
      setRotation(legRight, 0F, 0F, 0F);
      legLeft = new ModelRenderer(this, 111, 44);
      legLeft.addBox(-2F, 0F, -2F, 4, 13, 4);
      legLeft.setRotationPoint(2F, 11F, 0F);
      legLeft.setTextureSize(128, 64);
      legLeft.mirror = true;
      setRotation(legLeft, 0F, 0F, 0F);
      body = new ModelRenderer(this, 1, 44);
      body.addBox(-4F, -2F, -3F, 8, 13, 6);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      armRight = new ModelRenderer(this, 40, 18);
      armRight.addBox(-3F, -4F, -4F, 5, 14, 8);
      armRight.setRotationPoint(-6F, 2F, 0F);
      armRight.setTextureSize(128, 64);
      armRight.mirror = true;
      setRotation(armRight, 0F, 0F, 0F);
      armLeft = new ModelRenderer(this, 70, 18);
      armLeft.addBox(-2F, -4F, -4F, 5, 14, 8);
      armLeft.setRotationPoint(6F, 2F, 0F);
      armLeft.setTextureSize(128, 64);
      armLeft.mirror = true;
      setRotation(armLeft, 0F, 0F, 0F);
      head = new ModelRenderer(this, 1, 2);
      head.addBox(-4F, -10F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    legRight.render(f5);
    legLeft.render(f5);
    body.render(f5);
    armRight.render(f5);
    armLeft.render(f5);
    head.render(f5);
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
