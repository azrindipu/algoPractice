package design_pattern.abstractfactory;

import design_pattern.abstractfactory.concreteclass.AbstractFactoryImpl;
import design_pattern.abstractfactory.interfaces.ThemeBlack;
import design_pattern.abstractfactory.interfaces.ThemePink;
import design_pattern.abstractfactory.interfaces.ThemeWhite;
import test.SortDateList;

import java.text.ParseException;

public class MainClass {
    public static void main(String[] args){
        AbstractFactoryImpl abstractFactory = new AbstractFactoryImpl();
        System.out.println("Black Theme:");
        ThemeBlack black = abstractFactory.getThemeBlack();
        System.out.println("Text color of black theme is: "+black.getTextColor());
        System.out.println("UI color of black theme is: "+black.getUiColor());

        System.out.println("White Theme:");
        ThemeWhite white = abstractFactory.getThemeWhite();
        System.out.println("Text color of white theme is: "+white.getTextColor());
        System.out.println("UI color of white theme is: "+white.getUiColor());

        System.out.println("Pink Theme:");
        ThemePink pink = abstractFactory.getThemePink();
        System.out.println("Text color of pink theme is: "+pink.getTextColor());
        System.out.println("UI color of pink theme is: "+pink.getUiColor());
    }
}
