package design_pattern.factorymethod.example01.logisticfactory;

import design_pattern.factorymethod.example01.transport.Transport;

public interface LogisticFactory {
    Transport creator(String transportType, String naem, String number);
}
