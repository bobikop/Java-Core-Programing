package day26_statics.studentTask;

public class TestCircleObject {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2.5, 3);
        System.out.println("circle1 = " + circle1);


        circle1.calcArea();
        circle1.calcPerimeter();

        
    }
}
