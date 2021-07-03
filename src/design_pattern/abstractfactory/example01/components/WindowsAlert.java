package design_pattern.abstractfactory.example01.components;

import design_pattern.abstractfactory.example01.componentinterface.AlertBox;
import design_pattern.abstractfactory.example01.utils.OsType;
import design_pattern.abstractfactory.example01.utils.PrintLog;

public class WindowsAlert implements AlertBox{

    @Override
    public void printType() {
        PrintLog.printAlert(OsType.WINDOWS.toString());
    }
}
