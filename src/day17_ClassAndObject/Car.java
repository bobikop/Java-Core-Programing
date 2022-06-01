package day17_ClassAndObject;

public class Car {

    public String make;
    public String model;
    public String trim;
    public int numberOfPassengers;
    String color;
    public double price;

    public void setInfo(String make, String model, String trim, int numberOfPassengers, String color, double price) {
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.numberOfPassengers = numberOfPassengers;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", trim='" + trim + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
