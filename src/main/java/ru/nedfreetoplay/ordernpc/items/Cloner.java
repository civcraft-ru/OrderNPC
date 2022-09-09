package ru.nedfreetoplay.ordernpc.items;

import io.github.cottonmc.cotton.gui.client.CottonClientScreen;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import ru.nedfreetoplay.ordernpc.client.gui.ClonerGui;
import ru.nedfreetoplay.ordernpc.client.gui.ClonerScreen;
import ru.nedfreetoplay.ordernpc.client.gui.TabTestGui;

public class Cloner extends Item {
    public Cloner(Settings settings) {
        super(settings);
        settings.maxCount(1);
    }

//    @Override
//    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
//        if(world.isClient) {
//            MinecraftClient.getInstance().setScreen(new ClonerScreen(new ClonerGui(user)));
//        }
//        return super.use(world, user, hand);
//    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if(user.world.isClient) {
            if(entity != null)
                setScreen(new ClonerScreen(new ClonerGui(entity)));
        }
        return super.useOnEntity(stack, user, entity, hand);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().isClient){
            setScreen(new CottonClientScreen(new TabTestGui()));
            //setScreen(new CottonClientScreen(new ClonerGui(context.getBlockPos())));
        }
        return super.useOnBlock(context);
    }

    @Environment(EnvType.CLIENT)
    private void setScreen(Screen screen){
        MinecraftClient client = MinecraftClient.getInstance();
        if(client==null)
            throw new RuntimeException("MinecraftClient is null.");
        client.setScreen(screen);
    }
}
