package day34_abstraction.homeworkTasks.CarTask;

public class Audi extends Car implements AutoPark{

    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    protected void start() {
        System.out.println("For start " + getMake()+" " + getModel() +" push the start button");
    }

    @Override
    protected void drive() {
        System.out.println("For driving " + getMake()+" " + getModel() +" drive manually ");

    }

    @Override
    public void autoPark() {
        System.out.println("Select a AUTO PARK option " + getMake() + " " + getModel());
    }
}
