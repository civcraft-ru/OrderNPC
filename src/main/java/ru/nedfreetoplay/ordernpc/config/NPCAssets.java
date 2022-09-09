package ru.nedfreetoplay.ordernpc.config;

import com.google.gson.Gson;
import ru.nedfreetoplay.ordernpc.OrderNPC;
import ru.nedfreetoplay.ordernpc.entity.NPCGenerator;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NPCAssets {

    private boolean firstRun = false;
    private Path minecraftDir;
    private Path configDir;

    public NPCAssets(){
        minecraftDir = Paths.get("");
        configDir = Paths.get(minecraftDir + "config\\" + OrderNPC.MOD_ID);
        System.out.println(configDir);
    }

    public void toJSON(NPCGenerator generator) {
        Gson gson = new Gson();
    }

    public boolean exists(String category, String name) {
        return new File(configDir + "\\" + category, name + ".json").exists();
    }

    private void dd() {
        Path dir = Paths.get("config");

    //        if (server != null) {
//            dir = new File(".").getAbsolutePath();
//        } else {
//            dir = Minecraft.getMinecraft().mcDataDir.getAbsolutePath();
//        }
//        Dir = new File(dir, "customnpcs");
//        Dir.mkdir();
    }
}
