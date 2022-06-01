package day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt(); //10,5,3,20,15

            if (num < min) { // if the user entered entry is less than this is the minimum number that we have
                min = num;  // then user entered number should be the minimum number
            }


        }


        System.out.println("max = " + min);
        input.close();
    }
}
