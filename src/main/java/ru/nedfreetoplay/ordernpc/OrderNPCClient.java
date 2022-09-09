package ru.nedfreetoplay.ordernpc;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import ru.nedfreetoplay.ordernpc.client.entity.renderer.RaccoonRenderer;
import ru.nedfreetoplay.ordernpc.registers.ModEntities;

@Environment(EnvType.CLIENT)
public class OrderNPCClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        System.out.println("Client init");
        EntityRendererRegistry.register(ModEntities.RACCOON, RaccoonRenderer::new);

    }
}
