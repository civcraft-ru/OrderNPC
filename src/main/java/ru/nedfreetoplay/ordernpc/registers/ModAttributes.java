package ru.nedfreetoplay.ordernpc.registers;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import ru.nedfreetoplay.ordernpc.entity.RaccoonEntity;

public class ModAttributes {

    public ModAttributes(){

    }

    public ModAttributes register() {
        FabricDefaultAttributeRegistry.register(ModEntities.RACCOON, RaccoonEntity.setAttributes());
        return this;
    }
}
