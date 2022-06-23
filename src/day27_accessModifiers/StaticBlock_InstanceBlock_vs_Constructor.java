package day27_accessModifiers;

public class StaticBlock_InstanceBlock_vs_Constructor {


    public StaticBlock_InstanceBlock_vs_Constructor(){ // constructor

        System.out.println("Constructor");
    }

    // bellow is instance block
    {
        System.out.println("Instance block");

    }

    static{ //static block

        System.out.println("Static block");
    }


    public static void main(String[] args) {
        System.out.println("Main method");

        new StaticBlock_InstanceBlock_vs_Constructor();
        new StaticBlock_InstanceBlock_vs_Constructor();


    }


}
 /*first will be executed static block then main method. Constructor and instance block will not be executed since they depend on objects.
       We need to create object
         first in order to get them executed. Then will be executed instance block then constructor
    */