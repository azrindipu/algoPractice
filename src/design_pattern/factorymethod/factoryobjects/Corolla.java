package design_pattern.factorymethod.factoryobjects;

public class Corolla implements Car{

    private String color;
    private double topSpeed;

    public Corolla(String color, double topSpeed) {
        this.color = color;
        this.topSpeed = topSpeed;
    }

    @Override
    public void sayMyName() {
        System.out.println("Car name: "+ CarType.COROLLA.toString()+"\nColor: "+this.color+"\nTopSpeed: "+topSpeed);
    }
}
