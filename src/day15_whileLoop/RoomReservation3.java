package day15_whileLoop;

import java.util.Scanner;

public class RoomReservation3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        while (true){
            System.out.println("Which bedroom do you want to reserve?");
            String bedroom = input.next();

            while(!(bedroom.equalsIgnoreCase("king") || bedroom.equalsIgnoreCase("queen") || bedroom.equalsIgnoreCase("single"))){
                System.err.println("Invalid entry, please enter King, Queen or Single");
                bedroom = input.next();
            }

            int price = bedroom.equalsIgnoreCase("king") ? 120
                    : bedroom.equalsIgnoreCase("queen") ? 100 : 80;

            System.out.println("How many nights are you planning to stay?");
            int night = input.nextInt();

            while(!(night >= 1)){
                System.err.println("Invalid entry.");
                night = input.nextInt();
            }


            System.out.println("Would you like to reserve another room?");
            String yesOrNo = input.next();
            while(!(yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("no"))){
                System.err.println("Invalid entry, please type yes or no");
                yesOrNo = input.next();
            }

            total += price * night;
            if(yesOrNo.equalsIgnoreCase("no")){
                System.out.println("Your total is " + total + "$.");
                break;
            }
        }
    }




}
