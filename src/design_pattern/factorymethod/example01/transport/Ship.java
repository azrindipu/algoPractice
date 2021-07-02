package design_pattern.factorymethod.example01.transport;

import design_pattern.factorymethod.example01.utils.TransportType;

public class Ship implements Transport{
    private String name;
    private String number;

    public Ship(String name, String number){
        this.name=name;
        this.number=number;
        this.getTransportType();
    }

    @Override
    public void getTransportType() {
        System.out.println("===========>"+TransportType.SHIP.toString());
    }
}
