package design_pattern.abstractfactory.example01.factory;

import design_pattern.abstractfactory.example01.componentinterface.AlertBox;
import design_pattern.abstractfactory.example01.componentinterface.Popup;
import design_pattern.abstractfactory.example01.components.MacAlert;
import design_pattern.abstractfactory.example01.components.MacPopup;
import design_pattern.abstractfactory.example01.utils.OsType;

public class FactoryMacImpl implements Factory{
    @Override
    public AlertBox getAlert() {
        return new MacAlert();
    }

    @Override
    public Popup getPopup() {
        return new MacPopup();
    }
}
