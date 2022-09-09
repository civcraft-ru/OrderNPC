package ru.nedfreetoplay.ordernpc.registers;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;
import ru.nedfreetoplay.ordernpc.OrderNPC;
import ru.nedfreetoplay.ordernpc.entity.RaccoonEntity;

import java.util.Set;


public class ModEntities {

    @SuppressWarnings("rawtypes")
    private final Set<EntityType> entity;

//    public static final EntityType<RaccoonEntity> RACCOON = Registry.register(
//            Registry.ENTITY_TYPE, new Identifier(OrderNPC.MOD_ID, "raccoon"),
//            );

    public static final EntityType<RaccoonEntity> RACCOON = FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RaccoonEntity::new)
            .dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build();

    @SuppressWarnings("rawtypes")
    public ModEntities(@NotNull Set<EntityType> entity) {
        this.entity = entity;
    }

    @SuppressWarnings("rawtypes")
    public Set<EntityType> register(){
        entity.add(registerEntity("raccoon", RACCOON));

        return entity;
    }

    @SuppressWarnings("rawtypes")
    private static EntityType registerEntity(@NotNull String name, @NotNull EntityType entity) {
        return Registry.register(Registry.ENTITY_TYPE, new Identifier(OrderNPC.MOD_ID, name), entity);
    }
}
