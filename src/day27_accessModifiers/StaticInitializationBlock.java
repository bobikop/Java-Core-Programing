package day27_accessModifiers;

public class StaticInitializationBlock {

    public static  int a;
    public static double b;
    public static String c;

    //public static ExelSheet sheet;

    // if we need multiple lines of code to set one variable we use static block then
    // than whenever we need to call that variable we can do it trough static block

    // static shouldn't be declared with constructor since we need to create new objects
    // therefore the best chose is by using static block to initialize static variables
    static {
        a = 100;
        b = 20.5;
        c = "Java";

    }


}
