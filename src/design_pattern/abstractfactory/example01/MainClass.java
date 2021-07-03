package design_pattern.abstractfactory.example01;

import design_pattern.abstractfactory.example01.factory.Factory;
import design_pattern.abstractfactory.example01.factory.FactoryLinuxImpl;
import design_pattern.abstractfactory.example01.factory.FactoryMacImpl;
import design_pattern.abstractfactory.example01.factory.FactoryWindowsImpl;
import design_pattern.abstractfactory.example01.os.Linux;
import design_pattern.abstractfactory.example01.os.Mac;
import design_pattern.abstractfactory.example01.os.Os;
import design_pattern.abstractfactory.example01.os.Windows;

public class MainClass {
    public static void main(String[] args){
        Factory factory = null;
        Os operatingSystem= null;

        //creating mac os
        factory = new FactoryMacImpl();
        operatingSystem = new Mac(factory.getAlert(), factory.getPopup());
        operatingSystem.bootup();

        //creating linux os
        factory = new FactoryLinuxImpl();
        operatingSystem = new Linux(factory.getAlert(), factory.getPopup());
        operatingSystem.bootup();

        //create windows os
        factory = new FactoryWindowsImpl();
        operatingSystem = new Windows(factory.getAlert(), factory.getPopup());
        operatingSystem.bootup();
    }
}
