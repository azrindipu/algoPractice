package design_pattern.factorymethod.example01.logisticfactory;

import design_pattern.factorymethod.example01.transport.*;
import design_pattern.factorymethod.example01.utils.TransportType;

public class LogisticFactoryImpl implements LogisticFactory{
    @Override
    public Transport creator(String transportType, String naem, String number) {
        if(transportType.equalsIgnoreCase(TransportType.TRUCK.toString())){
            return new Truck(naem, number);
        }
        if(transportType.equalsIgnoreCase(TransportType.CAR.toString())){
            return new Car(naem, number);
        }
        if(transportType.equalsIgnoreCase(TransportType.SHIP.toString())){
            return new Ship(naem, number);
        }
        if(transportType.equalsIgnoreCase(TransportType.BOAT.toString())){
            return new Boat(naem, number);
        }
        return null;
    }
}
