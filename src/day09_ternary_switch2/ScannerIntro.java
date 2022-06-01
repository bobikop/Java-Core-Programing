package day09_ternary_switch2;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   // for reading user imports
        System.out.println("Enter a number: ");

         byte num1 = input.nextByte();


         System.out.println("You entered:  " + num1);

        System.out.println(" Enter your second number: ");

         short num2 = input.nextShort();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Enter your third number");

       int num3 =  input.nextInt();
        System.out.println("num3 = " + num3);


        System.out.println("Enter you fourth number :");
        long num4 = input.nextLong();

        input.close(); // scanner is closed, can't read new user inputs


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);



    }
}
