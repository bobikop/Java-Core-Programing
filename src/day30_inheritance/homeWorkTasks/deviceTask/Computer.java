package day30_inheritance.homeWorkTasks.deviceTask;

public class Computer extends Device {
    public Computer(String brand, String model, String color, char size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }
    public void display(){
        System.out.println(getBrand()+ " is displaying");
    }
}
