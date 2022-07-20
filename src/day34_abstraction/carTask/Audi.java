package day34_abstraction.carTask;

public class Audi extends Car{
    public Audi( String model, String color, int year, double price) {
        super( model, color, year, price);
    }

    @Override
    protected void start() {
        System.out.println("Pres the START button to start " + getModel() + " " + getMake());
    }
    public void autoPark(){
        System.out.println(getMake() + " " + getModel()  + " auto parking");
    }
}
