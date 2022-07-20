package day34_abstraction.homeworkTasks.Device;

public class Samsung extends Phone implements AndroidApps{
    public Samsung(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println("To download new app open your Android App Store app on your " + getBrand() + getBrand());
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
/*
2. Samsung:
						extends Phone class and implements Downloadable & AndroidApps interfaces

				4. Google:
						extends Phone class and implements Downloadable & AndroidApps interfaces
 */