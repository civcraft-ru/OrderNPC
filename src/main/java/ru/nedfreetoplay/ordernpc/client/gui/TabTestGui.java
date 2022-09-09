package ru.nedfreetoplay.ordernpc.client.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.impl.modmenu.WKirbSprite;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WTabPanel;
import io.github.cottonmc.cotton.gui.widget.icon.ItemIcon;
import net.minecraft.item.Items;
import net.minecraft.text.Text;

public class TabTestGui extends LightweightGuiDescription {
    public TabTestGui() {
        WTabPanel tabs = new WTabPanel();
        tabs.add(new WKirbSprite(), builder -> builder.title(Text.of("Kirb")));
        tabs.add(new WLabel(Text.of("just another tab")), builder -> builder.icon(new ItemIcon(Items.ANDESITE)));

        tabs.setSize(7 * 18, 5 * 18);
        setRootPanel(tabs);
        getRootPanel().validate(this);
    }

    @Override
    public void addPainters() {
    }
}