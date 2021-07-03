package design_pattern.abstractfactory.example01.os;

import design_pattern.abstractfactory.example01.componentinterface.AlertBox;
import design_pattern.abstractfactory.example01.componentinterface.Popup;
import design_pattern.abstractfactory.example01.utils.PrintLog;

public class Mac implements Os{
    private AlertBox alertBox;
    private Popup popup;

    public Mac(AlertBox alertBox, Popup popup){
        this.alertBox = alertBox;
        this.popup = popup;
    }

    @Override
    public void bootup() {
        PrintLog.booting();
        alertBox.printType();
        popup.printType();
    }
}
