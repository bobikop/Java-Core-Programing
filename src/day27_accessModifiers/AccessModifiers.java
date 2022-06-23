package day27_accessModifiers;

public class AccessModifiers {


    public static int publicData = 200;

    protected static int protectedData = 300;

    static  int  defaultData = 400;

    private static int privateData = 500; // this private variable is visible only in this same class

    public AccessModifiers(){

    }


    public static void  publicMethod(){

    }
    protected  static void protectedMethod(){

    }
    static void defaultMethod(){

    }

    private  static void privateMethod(){  // not accessible in the same package

    }



    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(protectedData);// protected is accessible in the same class
        System.out.println(defaultData);
        System.out.println(privateData);


        new AccessModifiers();


    }


}
