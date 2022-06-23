package day27_accessModifiers.tasks;

public class iPhone {

    public String model,size,color;
    public double price;
    public static String brand, OS, madeIn, designedIn;
    public static  boolean isSmartPhone = true;


    public iPhone(String model, String size, String color, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

   static{
       brand = "Apple";
       OS = "iOS";
       isSmartPhone = true;
       madeIn = "China";
       designedIn = "Cupertino, USA";

   }

    public static void printOperatingSystem(){
        System.out.println("Operating system: " + OS);
    }
    public void call(long phoneNumber){
        System.out.println("Call phone number: " + phoneNumber);
    }


    public void text(long phoneNumber){
        System.out.println("Texting phone number: " + phoneNumber);
    }

    public void faceTime(long phoneNumber){
        System.out.println("Facetime calling: " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println("Facetime calling: " + email);
    }

    public String toString() {
        return "iPhone{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
1. Create a class named Iphone
            variables:
                s brand, model, size, color, price, s OS, s isSmartPhone, s madeIn, s designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */