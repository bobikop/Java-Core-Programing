package day15_whileLoop;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();


        int sum = 0;
        while (num >= 0) {
            sum += num;
        }
        System.out.println("Enter your number");
        num = input.nextInt();

        input.close();

    }

}
