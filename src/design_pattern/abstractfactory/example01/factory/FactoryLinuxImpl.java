package design_pattern.abstractfactory.example01.factory;

import design_pattern.abstractfactory.example01.componentinterface.AlertBox;
import design_pattern.abstractfactory.example01.componentinterface.Popup;
import design_pattern.abstractfactory.example01.components.LinuxAlert;
import design_pattern.abstractfactory.example01.components.LinuxPopup;
import design_pattern.abstractfactory.example01.components.MacAlert;
import design_pattern.abstractfactory.example01.components.MacPopup;

public class FactoryLinuxImpl implements Factory{
    @Override
    public AlertBox getAlert() {
        return new LinuxAlert();
    }

    @Override
    public Popup getPopup() {
        return new LinuxPopup();
    }
}
