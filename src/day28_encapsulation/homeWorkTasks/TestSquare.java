package day28_encapsulation.homeWorkTasks;

public class TestSquare {
    public static void main(String[] args) {

        Square square1 = new Square(5);
        Square square2 = new Square(6);

        square1.calcPerimeter();
        square1.calcArea();

        square2.calcPerimeter();
        square2.calcArea();

        System.out.println(square1);
        System.out.println(square2);
    }
}
