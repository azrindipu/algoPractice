package design_pattern.factorymethod.factoryobjects;

public class Toyota implements Car {

    private String color;
    private double topSpeed;

    public Toyota(String color, double topSpeed) {
        this.color = color;
        this.topSpeed = topSpeed;
    }

    @Override
    public void sayMyName() {
        System.out.println("Car name: "+ CarType.TOYOTA.toString()+"\nColor: "+this.color+"\nTopSpeed: "+topSpeed);
    }
}
