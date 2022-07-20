package day31_inheritance.vehicleTask;

public class AirPlane extends Vehicle{
    public AirPlane(String name, String brand, String model, String color, int year, double price) {

        super(name, brand, model, color, year, price);
    }



    public void fly(){
        System.out.println(getBrand()+ " " + getModel()+" " + " is flaying");
    }
}
