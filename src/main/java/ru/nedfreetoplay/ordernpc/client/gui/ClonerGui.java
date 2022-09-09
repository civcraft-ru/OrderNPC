package ru.nedfreetoplay.ordernpc.client.gui;

import io.github.cottonmc.cotton.gui.client.BackgroundPainter;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.*;
import io.github.cottonmc.cotton.gui.widget.data.InputResult;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

@Environment(EnvType.CLIENT)
public class ClonerGui extends LightweightGuiDescription {

    /*
    * Первая вкладка содержит всех Mob
    * Вторая и следующие содержат клонированных нпс.
    * Отображение на весь экран
    * Экран поделен на ячейки.
    * Вкладки распложены сверху и их можно листать.
    * */
    private void tabs1(){
        WTabPanel tabs = new WTabPanel();
        setRootPanel(tabs);

        WGridPanel slotOne = new WGridPanel();
        WGridPanel slotTwo = new WGridPanel();
        WGridPanel slotThree = new WGridPanel();
        WGridPanel slotFour = new WGridPanel();

        tabs.setSize(10*18,17*18);

        tabs.add(slotOne, builder -> builder.title(Text.of("1")));
        tabs.add(slotTwo, builder -> builder.title(Text.of("2")));
        tabs.add(slotThree, builder -> builder.title(Text.of("3")));
        tabs.add(slotFour, builder -> builder.title(Text.of("4")));


        tabs.validate(this);
    }

    private void tabs() {
        WTabPanel tabs = new WTabPanel();
        setRootPanel(tabs);

        WGridPanel minecraftMobs = new WGridPanel();
        minecraftMobs.setSize(50, 50);

        tabs.setSize(300, 200);
        //tabs.setBackgroundPainter(BackgroundPainter.);

        tabs.add(minecraftMobs, builder -> builder.title(Text.of("1")));
        tabs.onHidden();

        tabs.validate(this);
    }

    private void card(){
        WCardPanel root = new WCardPanel();
        setRootPanel(root);

        WWidget widget1 = new WWidget();
        widget1.setSize(200, 100);
        WWidget widget2 = new WWidget();
        widget2.setSize(200, 100);
        root.add(widget1);
        root.add(widget2);
    }

    //Сохранить NPC
    private void saveAs(Entity entity){
        WGridPanel root = new WGridPanel();
        setRootPanel(root);

        WText text = new WText(Text.of("Сохранить куда"));
        root.add(text, 0, 0);

        WTextField field = new WTextField();
        root.add(field, 1, 1, 3, 1);

        WButton bSave = new WButton(Text.of("Save"));
        WButton bCancel = new WButton(Text.of("Cancel"));
    }

    public ClonerGui(BlockPos blockPos){

    }

    //Чтобы не рисовать задний фон
    @Override
    public void addPainters() {
    }

    public ClonerGui(Entity entity) {
        tabs();
//        WGridPanel root = new WGridPanel();
//        setRootPanel(root);
//        root.setSize(300, 200);
//
//        WTabPanel tab = new WTabPanel();
//
//        WWidget wWidget = new WWidget();
//        wWidget.setSize(30, 30);
//        tab.add(new WTabPanel.Tab.Builder(wWidget)
//                .title(new LiteralText("Test Tab"))
//                .build());
//
//        root.add(tab, 3, 1);

//        WLabel label = new WLabel(entity.getName(), 0);
//        root.add(label, 1, 1);

//        WButton button = new WButton().setLabel(new LiteralText("-"));
//        root.add(button, 1, 1, 1, 1);
//        System.out.println("CloneGui Call");
//
//        WTabPanel tab = new WTabPanel();
//        tab.setSize(1, 1);
//        root.add(tab, 3, 1);

//        WGridPanel panel = new WGridPanel();
//        panel.setSize(100, 100);
//        WScrollPanel scrollPanel = new WScrollPanel(panel);
//        scrollPanel.setSize(100, 100);
//        scrollPanel.setScrollingHorizontally(TriState.FALSE);
//        scrollPanel.setScrollingVertically(TriState.TRUE);
//
//        panel.add(label, 1, 1);
//
//        root.add(scrollPanel, 2, 2);
    }
}
