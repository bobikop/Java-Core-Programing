package day27_accessModifiers;

public class instanceBlock {

    {

        System.out.println("Instance Block");
    }

    public instanceBlock() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new instanceBlock();
        new instanceBlock();
        new instanceBlock();


    }
}
