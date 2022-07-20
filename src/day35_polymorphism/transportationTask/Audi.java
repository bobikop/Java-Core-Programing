package day35_polymorphism.transportationTask;

public class Audi extends Car implements AutoPark{

    //since Car class can not provide all methods audi needs we implement interface AutoPArk

    public Audi(String make, String model, String color, int year, double price) {

        super(make, model, color, year, price);
    }




    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }


    @Override
    public void autoPark() {

    }
}
