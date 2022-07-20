package day31_inheritance.shape_MethodOverriding;

public class Rectangle extends  Shape {

    private double width, length;
    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double area() {
        return width * length;
    }
    public double perimeter() {
        return 2 * (width + length);
    }
    public void draw() {
        super.draw(); //from shape->System.out.println("Drawing a " + getClass().getSimpleName());
        System.out.println("\t* * * * * *");
        for (int i = 0; i < 2; i++) {
            System.out.println("\t*         *");
        }
        System.out.println("\t* * * * * *");
    }
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", width='" + width + '\'' +
                ", length='" + length + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}

