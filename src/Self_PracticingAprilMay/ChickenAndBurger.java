package Self_PracticingAprilMay;


import java.util.Scanner;

public class ChickenAndBurger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the order");
        String order = input.next();

        double burger = 12.50;
        double chicken = 9.75;

        if (order.equalsIgnoreCase("burger")){
            System.out.println("Your total is $ " + burger);
        }else if (order.equalsIgnoreCase("chicken")){
            System.out.println("Your total is $ " + chicken);
        }


    }

}
