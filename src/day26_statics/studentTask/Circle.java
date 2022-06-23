package day26_statics.studentTask;

public class Circle {

    public double radius, diameter;
    public static double pi = 3.14;

    public Circle(double radius, double diameter) { // also no need argument for diameter here as long we know the radius
        this.radius = radius;
        diameter = 2 * radius;
       // this.diameter = diameter; // don't need this or diameter since is always related with radius
    }

    public  double calcArea(){
        double area = pi* this.radius* this.radius;
        return area;
    }

    public double calcPerimeter(){
     double perimeter = 2 * this.radius * pi;
     return perimeter;
    }


    public void printPi(){
        System.out.println(pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                ", pi=" + pi +
                '}';
    }
}
/*
2. Circle Task:
    1. Create a class named Circle:

        Attributes:
          instance: radius, diameter
          static: pi

        Add a constructor that can set All the fields (instances)
          HINT: we only need to know the radius to set the radius & diameter

        Actions:
          calcArea(): returns the area of Circle
          calcPerimeter(): returns the perimeter of Circle
          printPi(): displays PI value
          toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement

 */