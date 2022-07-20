package day34_abstraction.homeworkTasks.CarTask;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{

    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }


    @Override
    public void autoPark() {
        System.out.println("Select a AUTO PARK option " + getMake() + " " + getModel());
    }

    @Override
    public void selfDrive() {
        System.out.println("Select a self drive option " + getMake() + " " + getModel());
    }

    @Override
    protected void start() {
        System.out.println("Starting at 8am every day by default method " + getMake() + " " + getModel());
    }

    @Override
    protected void drive() {
        System.out.println("Will need to know Java perfect in order to be able to drive " + getMake() + " " + getModel());
    }

    @Override
    public void fly() {
        System.out.println("Select a FLY option " + getMake() + " " + getModel());
    }
}
