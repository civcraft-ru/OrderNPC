package ru.nedfreetoplay.ordernpc.client.widgets;

import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class SimpleButton extends ButtonWidget {

    private int x;
    private int y;
    private int width;
    private int height;

    public SimpleButton(int x, int y, int width, int height, Text message, PressAction onPress) {
        this(x, y, width, height, message, onPress, EMPTY);
    }

    public SimpleButton(int x, int y, int width, int height, Text message, PressAction onPress, TooltipSupplier tooltipSupplier) {
        super(x, y, width, height, message, onPress, tooltipSupplier);
    }
}
