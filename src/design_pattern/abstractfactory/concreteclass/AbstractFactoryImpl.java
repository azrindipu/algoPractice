package design_pattern.abstractfactory.concreteclass;

import design_pattern.abstractfactory.interfaces.AbstractFactory;
import design_pattern.abstractfactory.interfaces.ThemeBlack;
import design_pattern.abstractfactory.interfaces.ThemePink;
import design_pattern.abstractfactory.interfaces.ThemeWhite;

public class AbstractFactoryImpl implements AbstractFactory{
    @Override
    public ThemeWhite getThemeWhite() {
        return new ThemeWhiteImpl();
    }

    @Override
    public ThemeBlack getThemeBlack() {
        return new ThemeBlackImpl();
    }

    @Override
    public ThemePink getThemePink() {
        return new ThemePinkImpl();
    }
}
