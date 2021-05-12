package design_pattern.abstractfactory.concreteclass;

import design_pattern.abstractfactory.enums.TextColor;
import design_pattern.abstractfactory.enums.UiColor;
import design_pattern.abstractfactory.interfaces.ThemeWhite;

public class ThemeWhiteImpl implements ThemeWhite{
    @Override
    public String getTextColor() {
        return TextColor.BLACK.toString();
    }

    @Override
    public String getUiColor() {
        return UiColor.WHITE.toString();
    }
}
