package design_pattern.abstractfactory.example01.factory;

import design_pattern.abstractfactory.example01.componentinterface.AlertBox;
import design_pattern.abstractfactory.example01.componentinterface.Popup;

public interface Factory {
    AlertBox getAlert();
    Popup getPopup();
}
