package day34_abstraction.homeworkTasks.Device;

public abstract class Computer extends Device {

    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    protected void turnOn() {
        System.out.println("Turn on " + getBrand() + " " + getModel() + " by pushing turn on button");
    }


    @Override
    protected void turnOff() {

        System.out.println("Turn off " + getBrand() + " " + getModel() + " by pushing turn off button");
    }
}
/*
3. Create a child abstract class of Device named Computer:

					Add any extra methods if needed
 */