package ru.nedfreetoplay.ordernpc.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class NPC extends PathAwareEntity {

    public NPC(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}
