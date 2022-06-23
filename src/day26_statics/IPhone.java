package day26_statics;

public class IPhone {


    public static String brand = "Apple"; // static: Apple is the brand for  all the IPhone object's

    public String model; // instance: different models for iphone objects

    public String color;

    public double price;

    public static String OS = "iOS";

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean isExpensiveToFix = true;

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void  printPhoneInfo(){
        System.out.println("Color: " + color);
        System.out.println("Model: "  + model);
        System.out.println("Price: "  + price);
    }

    public static void printOperatingSystem(){

        System.out.println("Operating System: " + OS);
    }




}
/*


 */