package day31_inheritance.vehicleTask;

public class Car extends Vehicle {

    public Car(String name, String brand, String model, String color, int year, double price) {
        super(name, brand, model, color, year, price);
    }

    public void drive(){
        System.out.println("Driving " + getBrand() + " " + getModel());
    }
}
