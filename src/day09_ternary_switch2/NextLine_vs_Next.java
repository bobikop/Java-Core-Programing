package day09_ternary_switch2;

import java.util.Scanner;

public class NextLine_vs_Next {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the age");
        int age = input.nextInt();

        input.nextLine();


        System.out.println("Enter your full name");
        String name = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);






    }
}
