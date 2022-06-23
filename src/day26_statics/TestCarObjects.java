package day26_statics;

public class TestCarObjects {
    public static void main(String[] args) {



        Car car1 = new Car("Audi");
        System.out.println(car1);

        Car car2 = new Car("BMW", "X5");
        System.out.println(car2);

        Car car3 =new Car("Toyota", "Corolla", 2018);
        System.out.println(car3);

        Car car4 = new Car("Volvo", "X750", 2022, 45000);
        System.out.println(car4);

        Car car5 = new Car("Honda", "Accord", 2021, 32000, "black");
        System.out.println(car5);



    }
}
