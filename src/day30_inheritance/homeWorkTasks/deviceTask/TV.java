package day30_inheritance.homeWorkTasks.deviceTask;

public class TV extends Device{

    public TV(String brand, String model, String color, char size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }


    public void channelUp(){
        System.out.println(getBrand()+ " channels up");
    }
    public void channelDown(){
        System.out.println(getBrand()+ " channels down");
    }
}
