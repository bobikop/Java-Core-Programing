package day26_statics;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default constructor");

    }

    public ConstructorCalls(int a){
        this();// constructor call must be on the first step
        System.out.println("Constructor with argument");

    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");

    }


    public ConstructorCalls(String c){
        this();
        //  this(2.5); only one constructor can be called from another constructor

        System.out.println("Constructor with string argument");

    }




    public static void main(String[] args) {

        method1();
        System.out.println("----------------------");

        method2();
    }


    public static void method1(){
        System.out.println("Method 1");
    }

    public static void method2(){
        method1();
        System.out.println("Method 2");

    }
}
