package day31_inheritance.vehicleTask;

public class Boat extends  Vehicle{

    public Boat(String name, String brand, String model, String color, int year, double price) {
        super(name, brand, model, color, year, price);
    }


     public void sail(){
    System.out.println(getBrand()+ " " + getModel() + " is ailing");
    }


}
