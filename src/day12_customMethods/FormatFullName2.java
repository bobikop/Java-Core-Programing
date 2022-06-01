package day12_customMethods;

import java.util.Scanner;

public class FormatFullName2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String first = input.nextLine().trim().replace(" ", "");

        System.out.println("Enter your last name");
        String last = input.nextLine().trim().replace(" ", "");

        input.close();

        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first + " " + last;
        System.out.println("fullName = " + fullName);

    }
}
