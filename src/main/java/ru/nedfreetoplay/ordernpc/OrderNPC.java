package ru.nedfreetoplay.ordernpc;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class OrderNPC implements ModInitializer {

    public static Logger logger = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        logger.info("Hello World!");
    }
}
