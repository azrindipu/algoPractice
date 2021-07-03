package design_pattern.abstractfactory.example01.factory;

import design_pattern.abstractfactory.example01.componentinterface.AlertBox;
import design_pattern.abstractfactory.example01.componentinterface.Popup;
import design_pattern.abstractfactory.example01.components.LinuxAlert;
import design_pattern.abstractfactory.example01.components.LinuxPopup;
import design_pattern.abstractfactory.example01.components.WindowsAlert;
import design_pattern.abstractfactory.example01.components.WindowsPopup;

public class FactoryWindowsImpl implements Factory{
    @Override
    public AlertBox getAlert() {
        return new WindowsAlert();
    }

    @Override
    public Popup getPopup() {
        return new WindowsPopup();
    }
}
