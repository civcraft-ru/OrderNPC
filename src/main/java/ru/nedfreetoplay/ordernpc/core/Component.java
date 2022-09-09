package ru.nedfreetoplay.ordernpc.core;

import net.minecraft.entity.Entity;

/*
* Эти компоненты будут делать что-то
* С помощью этих компонентов можно будет редактировать NPC.
*
* */
public interface Component {

    //Хранит в себе значения и действия с Entity.

    public Entity generate(Entity entity);

    public void fromString();

    public String toString();
}
