package day34_abstraction.homeworkTasks.CarTask;

public class Nio extends Car implements AutoPark,AutoPilot{

    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("For start " + getMake()+" " + getModel() +" say start");
    }

    @Override
    public void selfDrive() {
        System.out.println("To drive " + getMake()+" " + getModel() +" push release the break");
    }

    @Override
    protected void start() {
        System.out.println("Select a AUTO PARK option " + getMake() + " " + getModel());
    }

    @Override
    protected void drive() {
        System.out.println("Select a SELF DRIVING option " + getMake() + " " + getModel());
    }
}
