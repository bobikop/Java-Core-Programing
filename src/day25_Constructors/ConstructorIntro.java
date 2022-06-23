package day25_Constructors;

public class ConstructorIntro {

    public ConstructorIntro(int a) {

        System.out.println("Object is created by using default constructor");
    }

    public ConstructorIntro(Double k) {
        System.out.println("Object is created by using  constructor");
    }

    public ConstructorIntro(String str) {
        System.out.println("Object is created by using  constructor");
    }

    public static void main(String[] args) {

        ConstructorIntro obj = new ConstructorIntro(10);
        ConstructorIntro obj2 = new ConstructorIntro(2.5); // another constructor must have a clas same name but different parameters
        ConstructorIntro obj3 = new ConstructorIntro(7.5);
        ConstructorIntro obj4 = new ConstructorIntro(9.5);
        ConstructorIntro obj5 = new ConstructorIntro("Boban");


    }

}
