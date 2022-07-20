package day34_abstraction.homeworkTasks.CarTask;

public class Tesla extends Car implements AutoPark,AutoPilot{

    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    protected void start() {
        System.out.println("For start " + getMake()+" " + getModel() +" say start");
    }

    @Override
    protected void drive() {
        System.out.println("To drive " + getMake()+" " + getModel() +" push release the break");

    }

    @Override
    public void autoPark() {
        System.out.println("Select a AUTO PARK option " + getMake() + " " + getModel());
    }

    @Override
    public void selfDrive() {
        System.out.println("Select a SELF DRIVING option " + getMake() + " " + getModel());

    }
}
