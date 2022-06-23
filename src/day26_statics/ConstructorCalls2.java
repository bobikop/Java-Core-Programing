package day26_statics;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("Default constructor");
    }

    public ConstructorCalls2(int a){
        this(); // calling the default constructor here
        System.out.println("Constructor with int argument");
    }


    public ConstructorCalls2(String a){
        this(10);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2();

        System.out.println("----------------------------------------");

        ConstructorCalls2 obj2 = new ConstructorCalls2();

        System.out.println("----------------------------------------");

        ConstructorCalls2 obj3 = new ConstructorCalls2("Java");

//note: we are using multiple constructor in order to get more option in custom class when creatimg the object
        // for example in one car object we can create object car1 object with make only and in second constructor make and price and so on..//




    }




}
