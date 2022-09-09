package ru.nedfreetoplay.ordernpc.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

import java.util.ArrayList;
import java.util.Arrays;

@Config(name = "order_npc")
@Config.Gui.Background("minecraft:textures/block/stone.png")
public class OrderNPCConfig implements ConfigData {

    @ConfigEntry.Category("Test_settings")
    @Comment("Test Boolean settings")
    public boolean test_boolean = false;

    @ConfigEntry.Category("Test_settings")
    @Comment("Test Boolean settings")
    public boolean test2_boolean = true;

    public ArrayList<Object> getConfigList() {
        return new ArrayList<Object>(Arrays.asList(test_boolean, test2_boolean));
    }
}
