package day34_abstraction.homeworkTasks.Device;

public class Laptop extends Computer{
    public Laptop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {

        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    protected void turnOff() {
        super.turnOff();// specific instruction here
    }

    @Override
    protected void turnOn() {
        super.turnOn();// specific instruction here
    }
}
