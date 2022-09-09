package ru.nedfreetoplay.ordernpc.registers;

import com.mojang.logging.LogUtils;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.EggItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import ru.nedfreetoplay.ordernpc.OrderNPC;
import ru.nedfreetoplay.ordernpc.items.Cloner;

import java.util.Set;


public final class ModItems {

    private static final Logger logger = LogUtils.getLogger();

    public static final Item CLONER_ITEM = new Cloner(new FabricItemSettings().group(OrderNPC.itemGroup));

    public static final Item RACCOON_SPAWN_EGG = new SpawnEggItem(ModEntities.RACCOON, 0x948e8d, 0x3b3635,
            new FabricItemSettings().group(OrderNPC.itemGroup).maxCount(1));

    private final Set<Item> items;

    public ModItems(@NotNull Set<Item> items) {
        logger.info("ModItems init!");
        this.items = items;
    }

    public Set<Item> register(){
        items.add(registerItem("test_item", new Item(new FabricItemSettings().group(OrderNPC.itemGroup))));
        items.add(registerItem("cloner_item", CLONER_ITEM));
        items.add(registerItem("raccoon_spawn_egg", RACCOON_SPAWN_EGG));

        return items;
    }

    private static Item registerItem(@NotNull String name, @NotNull Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OrderNPC.MOD_ID, name), item);
    }
}
