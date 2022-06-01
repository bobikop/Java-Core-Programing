package day15_whileLoop;

import java.util.Locale;
import java.util.Scanner;

public class RoomReservationWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Welcome to our Hotel! Would you like to reserve the room?" );
        String yesOrNo = input.nextLine().toLowerCase();

        while (!yesOrNo.equals("yes") && !yesOrNo.equals("no")){
            System.out.println("Invalid entry! Please type yes or no");
            yesOrNo = input.nextLine().toLowerCase();
        }

        if (yesOrNo.equals("yes")){
            System.out.println("What type of room you would like to reserve? King Bed, Queen Bed or Single Bed room.");
           String  room = input.nextLine().toLowerCase();

            while (!(room.equals("King Bed") || room.equals("Queen Bed") || room.equals("Single Bed"))){
                System.out.println("Invalid entry! Please type valid room size!");
                room = input.next();
            }
            if (room.equals("king")){
                System.out.println(" You have selected King Bed room. This room price is $120 per night!");
            } else if (room.equals("queen")) {
                System.out.println("You have selected King Bed room. This room price is $100 per night!");
            } else if (room.equals("single")) {
                System.out.println("You have selected King Bed room. This room price is $80 per night!");
            }
        }


        if (yesOrNo.equals("no")){
            System.out.println("Have a nice day!");
        }

    }

}


/*

8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

   the program should be able to display the room he/she reserved and total price of the room.

  (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */