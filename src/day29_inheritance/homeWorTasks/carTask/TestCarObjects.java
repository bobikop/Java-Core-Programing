package day29_inheritance.homeWorTasks.carTask;

public class TestCarObjects {
    public static void main(String[] args) {



        Car car = new Car();
        car.setInfo("Toyota", "Corrola", "White", 2015, 18500);
        car.getColor();
        System.out.println(car);
    }
}
