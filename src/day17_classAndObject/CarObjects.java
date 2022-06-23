package day17_classAndObject;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Honda", "Accord", "sedan", 5, "black", 32000.00);

        Car car2 = new Car();
        car2.setInfo("Audi", "A6", "sedan", 5, "red", 34000.00);

        Car car3 = new Car();
        car3.setInfo("Volvo", "XC90", "SUV", 7, "silver", 64000.00);

        Car car4 = new Car();
        car4.setInfo("Toyota", "Prius", "sedan", 5, "white", 38000.00);

        Car car5 = new Car();
        car5.setInfo("Hyundai", "Santa Fe", "SUV", 5, " blue", 28000.00);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }
}
