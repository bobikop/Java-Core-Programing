package day27_accessModifiers;

public class Test {

    public static void main(String[] args) {


        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);


        System.out.println("----------------------------------");


        System.out.println(AccessModifiers.publicData);// protected  is accessible in the same package

        System.out.println(AccessModifiers.defaultData);
       // System.out.println(AccessModifiers.privateData); not accessible

        new  AccessModifiers();


    }
}
