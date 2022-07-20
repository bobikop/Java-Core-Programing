package day34_abstraction.homeworkTasks.CarTask;

public class Honda extends Car{
    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }


    @Override
    protected void start() {
        System.out.println("Push button to start " + getMake() + " " + getModel());
    }

    @Override
    protected void drive() {
        System.out.println(getModel() + " is driving smooth");
    }
}
