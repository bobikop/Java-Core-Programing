package day15_whileLoop;


import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int positiveNumber = 0;
        int negativeNUmber = 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number");
            int num = input.nextInt();
            if (num > 0) {
                positiveNumber += 1;
            } else if (num < 0) {
                negativeNUmber += 1;
            }
        }
        System.out.println(positiveNumber + " " + "positive and " + negativeNUmber + " negative");

    }
}
