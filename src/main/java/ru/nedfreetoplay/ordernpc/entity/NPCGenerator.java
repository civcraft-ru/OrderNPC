package ru.nedfreetoplay.ordernpc.entity;

import net.minecraft.entity.Entity;
import ru.nedfreetoplay.ordernpc.core.Component;

/*
* Данный класс создан для генерирования NPC из Components в Entity
* Ну и возможно из Entity в NPC
* */
public class NPCGenerator {

    private Component[] components;
    private Entity entity;
    private NPC npc;

    private NPCGenerator(){
        //npc = new NPC();
    }

    public NPCGenerator(Entity entity){

    }

    public NPCGenerator(Component ... components){
        this.components = components;
    }

    Entity createEntity(){
        if(entity == null){
            /*
            * Создать entity из componets
            * */
        }
        else
        {
            return entity;
        }
        return entity;
    }
}
