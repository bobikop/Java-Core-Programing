package day15_whileLoop;

import java.util.Scanner;

public class RoomReservationDiscord {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to reserve a room ? Yes/No");
        String yesNo = input.nextLine().toLowerCase();

        while (!yesNo.equals("yes") && !yesNo.equals("no")) {
            System.out.println("Invalid entry!  Please re-enter");
            yesNo = input.nextLine().toLowerCase();
        }
        if (yesNo.equals("yes")) {
            System.out.println("Which type of room do you wants to reserve? King, Queen, Single");
            String room = input.nextLine().toLowerCase();

            while (!(room.equals("king") || room.equals("queen") || room.equals("single"))) {
                System.out.println("Invalid entry. Please re-entry");
                room = input.next();
            }
            if (room.equals("king")) {
                System.out.println("You selected: King Bed $120");
            } else if (room.equals("queen")) {
                System.out.println("You selected: Queen Bed $100");
            } else if (room.equals("single")) {
                System.out.println("You selected: Single Bed $80");
            }
        }
        if (yesNo.equals("no")) {
            System.out.println("Have a nice day");
        }


    }

}
