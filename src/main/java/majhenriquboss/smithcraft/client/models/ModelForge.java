package majhenriquboss.smithcraft.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelForge extends ModelBase {
  //fields
    ModelRenderer right;
    ModelRenderer left;
    ModelRenderer base;
    ModelRenderer back;
    ModelRenderer top;
    ModelRenderer front1;
    ModelRenderer front2;
    ModelRenderer front3;
    ModelRenderer front4;
    ModelRenderer front5;
    ModelRenderer chimneyLeft;
    ModelRenderer chimneyBack;
    ModelRenderer chimneyRight;
    ModelRenderer chimneyFront;
    ModelRenderer chimneyMouthBack;
    ModelRenderer chimneyMouthFront;
    ModelRenderer chimneyMouthLeft;
    ModelRenderer chimneyMouthRight;
    ModelRenderer chimneyMouthBottom;
  
  public ModelForge() {
    textureWidth = 512;
    textureHeight = 256;
    
      right = new ModelRenderer(this, 0, 23);
      right.addBox(0F, -16F, -9F, 1, 25, 16);
      right.setRotationPoint(-7F, 14F, 1F);
      right.setTextureSize(64, 32);
      right.mirror = true;
      setRotation(right, 0F, 0F, 0.1745329F);
      left = new ModelRenderer(this, 0, 66);
      left.addBox(0F, -16F, -9F, 1, 25, 16);
      left.setRotationPoint(8F, 14F, 1F);
      left.setTextureSize(64, 32);
      left.mirror = true;
      setRotation(left, 0F, 0F, -0.1745329F);
      base = new ModelRenderer(this, 0, 0);
      base.addBox(-9F, 0F, -9F, 20, 2, 19);
      base.setRotationPoint(0F, 22F, -2F);
      base.setTextureSize(64, 32);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      back = new ModelRenderer(this, 0, 113);
      back.addBox(-8F, -16F, 0F, 16, 26, 2);
      back.setRotationPoint(1F, 14F, 8F);
      back.setTextureSize(64, 32);
      back.mirror = true;
      setRotation(back, 0F, 0F, 0F);
      top = new ModelRenderer(this, 0, 146);
      top.addBox(-8F, 0F, -8F, 16, 1, 17);
      top.setRotationPoint(1F, -2F, 0F);
      top.setTextureSize(64, 32);
      top.mirror = true;
      setRotation(top, 0F, 0F, 0F);
      front1 = new ModelRenderer(this, 106, 110);
      front1.addBox(-7F, 0F, 0F, 16, 9, 16);
      front1.setRotationPoint(0F, 14F, -9F);
      front1.setTextureSize(64, 32);
      front1.mirror = true;
      setRotation(front1, 0F, 0F, 0F);
      front2 = new ModelRenderer(this, 109, 97);
      front2.addBox(0F, 0F, 0F, 3, 7, 3);
      front2.setRotationPoint(-5F, 7F, -9F);
      front2.setTextureSize(64, 32);
      front2.mirror = true;
      setRotation(front2, 0F, 0F, 0F);
      front3 = new ModelRenderer(this, 151, 97);
      front3.addBox(0F, 0F, 0F, 3, 7, 3);
      front3.setRotationPoint(4F, 7F, -9F);
      front3.setTextureSize(64, 32);
      front3.mirror = true;
      setRotation(front3, 0F, 0F, 0F);
      front4 = new ModelRenderer(this, 106, 74);
      front4.addBox(-5.5F, 0F, 0F, 11, 4, 17);
      front4.setRotationPoint(1F, 3F, -9F);
      front4.setTextureSize(64, 32);
      front4.mirror = true;
      setRotation(front4, 0F, 0F, 0F);
      front5 = new ModelRenderer(this, 122, 69);
      front5.addBox(0F, 0F, 0F, 10, 4, 1);
      front5.setRotationPoint(-4F, -1F, -9F);
      front5.setTextureSize(64, 32);
      front5.mirror = true;
      setRotation(front5, 0F, 0F, 0F);
      chimneyLeft = new ModelRenderer(this, 147, 48);
      chimneyLeft.addBox(0F, 0F, -3F, 1, 10, 6);
      chimneyLeft.setRotationPoint(3F, -12F, 4F);
      chimneyLeft.setTextureSize(64, 32);
      chimneyLeft.mirror = true;
      setRotation(chimneyLeft, 0F, 0F, 0F);
      chimneyBack = new ModelRenderer(this, 164, 52);
      chimneyBack.addBox(-3F, 0F, 0F, 6, 10, 1);
      chimneyBack.setRotationPoint(0F, -12F, 7F);
      chimneyBack.setTextureSize(64, 32);
      chimneyBack.mirror = true;
      setRotation(chimneyBack, 0F, 0F, 0F);
      chimneyRight = new ModelRenderer(this, 182, 48);
      chimneyRight.addBox(0F, 0F, -3F, 1, 10, 6);
      chimneyRight.setRotationPoint(-4F, -12F, 4F);
      chimneyRight.setTextureSize(64, 32);
      chimneyRight.mirror = true;
      setRotation(chimneyRight, 0F, 0F, 0F);
      chimneyFront = new ModelRenderer(this, 130, 52);
      chimneyFront.addBox(-3F, 0F, 0F, 6, 10, 1);
      chimneyFront.setRotationPoint(0F, -12F, 0F);
      chimneyFront.setTextureSize(64, 32);
      chimneyFront.mirror = true;
      setRotation(chimneyFront, 0F, 0F, 0F);
      chimneyMouthBack = new ModelRenderer(this, 179, 29);
      chimneyMouthBack.addBox(-5F, 0F, 0F, 10, 3, 1);
      chimneyMouthBack.setRotationPoint(0F, -16F, 8F);
      chimneyMouthBack.setTextureSize(64, 32);
      chimneyMouthBack.mirror = true;
      setRotation(chimneyMouthBack, 0F, 0F, 0F);
      chimneyMouthFront = new ModelRenderer(this, 132, 26);
      chimneyMouthFront.addBox(-5F, 0F, 0F, 10, 3, 1);
      chimneyMouthFront.setRotationPoint(0F, -16F, -1F);
      chimneyMouthFront.setTextureSize(64, 32);
      chimneyMouthFront.mirror = true;
      setRotation(chimneyMouthFront, 0F, 0F, 0F);
      chimneyMouthLeft = new ModelRenderer(this, 156, 17);
      chimneyMouthLeft.addBox(0F, 0F, -5F, 1, 3, 10);
      chimneyMouthLeft.setRotationPoint(4F, -16F, 4F);
      chimneyMouthLeft.setTextureSize(64, 32);
      chimneyMouthLeft.mirror = true;
      setRotation(chimneyMouthLeft, 0F, 0F, 0F);
      chimneyMouthRight = new ModelRenderer(this, 203, 20);
      chimneyMouthRight.addBox(0F, 0F, -5F, 1, 3, 10);
      chimneyMouthRight.setRotationPoint(-5F, -16F, 4F);
      chimneyMouthRight.setTextureSize(64, 32);
      chimneyMouthRight.mirror = true;
      setRotation(chimneyMouthRight, 0F, 0F, 0F);
      chimneyMouthBottom = new ModelRenderer(this, 137, 33);
      chimneyMouthBottom.addBox(-5F, 0F, -5F, 10, 1, 10);
      chimneyMouthBottom.setRotationPoint(0F, -13F, 4F);
      chimneyMouthBottom.setTextureSize(64, 32);
      chimneyMouthBottom.mirror = true;
      setRotation(chimneyMouthBottom, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    right.render(f5);
    left.render(f5);
    base.render(f5);
    back.render(f5);
    top.render(f5);
    front1.render(f5);
    front2.render(f5);
    front3.render(f5);
    front4.render(f5);
    front5.render(f5);
    chimneyLeft.render(f5);
    chimneyBack.render(f5);
    chimneyRight.render(f5);
    chimneyFront.render(f5);
    chimneyMouthBack.render(f5);
    chimneyMouthFront.render(f5);
    chimneyMouthLeft.render(f5);
    chimneyMouthRight.render(f5);
    chimneyMouthBottom.render(f5);
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
