package day34_abstraction.homeworkTasks.CarTask;

public class BMW extends Car{
    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }


    @Override
    protected void start() {
        System.out.println("Push button to start " + getMake() + " " + getModel());
    }

    @Override
    protected void drive() {
        System.out.println(getModel() + " is driving and then breaks!");

    }
}
