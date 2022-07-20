package day31_inheritance.shape_MethodOverriding;

public class Shape {

    private String name;



    public Shape(){
        setName(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double area(){
        return 0;// given default value since one formula can not be used for all the shapes
    }

    public double perimeter(){
        return 0;// given default value since one formula can not be used for all the shapes
    }

    public void draw(){
        System.out.println("Drawing a " + getClass().getSimpleName() + " : ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                " name='" + name + '\'' +
                " area='" + area() + '\'' +
                " perimeter='" + perimeter() + '\'' +
                '}';
    }
}
