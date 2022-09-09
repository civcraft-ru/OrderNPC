package ru.nedfreetoplay.ordernpc;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import ru.nedfreetoplay.ordernpc.config.NPCAssets;
import ru.nedfreetoplay.ordernpc.entity.NPC;
import ru.nedfreetoplay.ordernpc.registers.ModAttributes;
import ru.nedfreetoplay.ordernpc.registers.ModEntities;
import ru.nedfreetoplay.ordernpc.registers.ModItems;

import java.util.HashSet;
import java.util.Set;

public final class OrderNPC implements ModInitializer {

    private static final Logger logger;
    public static final String MOD_ID;

    public static final ItemGroup itemGroup;

    static {
        logger = LogUtils.getLogger();
        MOD_ID = "order_npc";
        itemGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "items"), () ->
                new ItemStack(Items.APPLE)
        );
    }

    public Set<Item> items;

    public static final EntityType<NPC> NPC = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("entitytesting", "cube"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, NPC::new).dimensions (EntityDimensions.fixed (0.75f, 0.75f)).build ()
    );

    @Override
    public void onInitialize() {
        logger.info("Hello World!");
        new NPCAssets();

        ModItems modItems = new ModItems(new HashSet<>());
        Set<Item> items = modItems.register();

        ModEntities modEntities = new ModEntities(new HashSet<>());
        Set<EntityType> entities = modEntities.register();

        ModAttributes modAttributes = new ModAttributes().register();
    }
}
