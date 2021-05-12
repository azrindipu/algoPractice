package design_pattern.abstractfactory.concreteclass;

import design_pattern.abstractfactory.enums.TextColor;
import design_pattern.abstractfactory.enums.UiColor;
import design_pattern.abstractfactory.interfaces.ThemePink;

public class ThemePinkImpl implements ThemePink{
    @Override
    public String getTextColor() {
        return TextColor.RED.toString();
    }

    @Override
    public String getUiColor() {
        return UiColor.PINK.toString();
    }
}
