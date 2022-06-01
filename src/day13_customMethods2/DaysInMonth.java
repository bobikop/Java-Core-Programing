package day13_customMethods2;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        int month = new Scanner(System.in).nextInt();

        if (month > 12 || month < 1){
            System.out.println("Invalid number");
            return; // terminate the main method
        }

        switch (month){ // 1 -12
            case 2:
                System.out.println("28 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("31 days");
                break;

        }


    }
}
