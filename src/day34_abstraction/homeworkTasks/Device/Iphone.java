package day34_abstraction.homeworkTasks.Device;

public class Iphone extends Phone implements AppleApps{

    public Iphone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println("To download new app open your App Store app on your " + getBrand() + getBrand());
    }


    @Override
    protected void turnOn() {
        super.turnOn();// specific instruction here
    }

    @Override
    protected void turnOff() {
        super.turnOff();// specific instruction here
    }

    @Override
    void call() {
        super.call();// specific instruction here
    }

    @Override
    void text() {
        super.text();// specific instruction here
    }
}
/*7. Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone :
						extends Phone class and implements Downloadable & AppleApps interfaces


*/