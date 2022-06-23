package Self_PracticingAprilMay.firstMonth;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        // 1. Ask the customer to enter an integer number
        System.out.println("Enter an Integer number :");
        int num1 = input.nextInt();

        // 2. Ask the customer to enter a decimal number
        System.out.println("Enter a decimal number :");
        double n2 = input.nextDouble();


        // 3. Ask the customer to enter the word
        System.out.println("Enter s word :");
        String word = input.next();

        System.out.println("num1 = " + num1);
        System.out.println("n2 = " + n2);
        System.out.println("word = " + word);







    }
}
