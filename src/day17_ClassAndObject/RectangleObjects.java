package day17_ClassAndObject;

public class RectangleObjects {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(10.0, 5.0);


        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(8.0, 5.0);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setInfo(5.0, 2.0);

        Rectangle rectangle4 = new Rectangle();
        rectangle4.setInfo(12.0, 4.0);



        System.out.println(rectangle1);






    }
}
/*
3. create a custom class named Rectangle
        Attributes:
            length, width

        Actions:
            setInfo(): sets the length and width of the rectangle object
            calculateArea(): calculates the area of the rectangle, returns it as double
            calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
            toString(): when a rectangle object is passed in print statement
                    it should diplay the length, width, area and perimeter of the Rectangle object

 */