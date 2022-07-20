package day34_abstraction.homeworkTasks.CarTask;

public class Toyota extends  Car{
    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    protected void start() {
        System.out.println("Twist the key to ignition to start " + getMake() + " " + getModel());
    }

    @Override
    protected void drive() {
        System.out.println("Driving Toyota is fun");
    }

}
