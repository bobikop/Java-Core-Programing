package day27_accessModifiers;

public class TestNestedClassObjects {


    public static void main(String[] args) {

        Car obj1 = new Car(); // car object

        obj1.new CarEngine(); // object from nested class is CarEngine (wuthout Car object there is no obj1 CarEngine



        new Car.StaticInnerClass();




    }
}
