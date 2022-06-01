package day04_concatenation;

public class CarInfo {
    public static void main(String[] args) {
        int year = 2018;
        String make = "Toyota ", model = "Camry, ";
        int miles = 50000;
        String color = " Red, ";
        int price = 19000;
        System.out.println("Car information is: " + "\n\t" + year + " " + make + model +
                miles + " miles," + color + "$" + price + ".");
    }
}