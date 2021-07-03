package design_pattern.abstractfactory.example01.components;

import design_pattern.abstractfactory.example01.componentinterface.Popup;
import design_pattern.abstractfactory.example01.utils.OsType;
import design_pattern.abstractfactory.example01.utils.PrintLog;

public class LinuxPopup implements Popup{

    @Override
    public void printType() {
        PrintLog.printPopup(OsType.LINUX.toString());
    }
}
