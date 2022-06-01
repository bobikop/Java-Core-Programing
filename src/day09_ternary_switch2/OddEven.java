package day09_ternary_switch2;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        String result = "Invalid";

        result = (num % 2 == 0) ? "Even NUmber" :(num % 2 != 0)? " Odd Number" : "Invalid";

        System.out.println("result = " + result);

        input.close();

    }
}

/*
boolean evenNumber = (num % 2 == 0);
        boolean oddNumber = (num % 2 != 0);

        System.out.println(num + " is an even number : " + evenNumber);
        System.out.println(num + " is an odd number : " + oddNumber);
 */