package day31_inheritance.vehicleTask;

public class Bike extends Vehicle{
    public Bike(String name, String brand, String model, String color, int year, double price) {
        super(name, brand, model, color, year, price);
    }

    public void ride (){
        System.out.println("Riding " + getBrand() + " " + getModel());
    }

}
