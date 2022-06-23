package day26_statics;

public class TestIphoneObject {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone 13 pro MAX" , "White" , 1200);

        // if is instance call it from instance object
        System.out.println(iPhone.color);
        System.out.println(iPhone.model);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

        // if is static always call it from class
        System.out.println( IPhone.brand);
        System.out.println(IPhone.OS);

        IPhone.printOperatingSystem();


    }
}
