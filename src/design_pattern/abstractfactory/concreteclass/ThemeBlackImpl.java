package design_pattern.abstractfactory.concreteclass;

import design_pattern.abstractfactory.enums.TextColor;
import design_pattern.abstractfactory.enums.UiColor;
import design_pattern.abstractfactory.interfaces.ThemeBlack;

public class ThemeBlackImpl implements ThemeBlack{
    @Override
    public String getTextColor() {
        return TextColor.WHITE.toString();
    }

    @Override
    public String getUiColor() {
        return UiColor.BLACK.toString();
    }
}
