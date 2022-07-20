package day35_polymorphism.transportationTask;

import day34_abstraction.animalTask.Flyable;

public abstract class Plain extends  Transportation implements Flyable {
    public Plain(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public  void land(){
        System.out.println("Plane " + getMake() + " is landing");
    }

}
