package ru.nedfreetoplay.ordernpc.client.entity.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import ru.nedfreetoplay.ordernpc.OrderNPC;
import ru.nedfreetoplay.ordernpc.client.entity.models.RaccoonModel;
import ru.nedfreetoplay.ordernpc.entity.RaccoonEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RaccoonRenderer extends GeoEntityRenderer<RaccoonEntity> {
    public RaccoonRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new RaccoonModel());
    }

    @Override
    public Identifier getTextureLocation(RaccoonEntity object) {
        return new Identifier(OrderNPC.MOD_ID, "textures/entity/raccoon/raccoon.png");
    }
}
