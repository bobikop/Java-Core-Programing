package day09_ternary_switch2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {

        System.out.println("Enter your first character");// de[pending how many inputs wee need we create different inputs for each one

        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);

        System.out.println("ch = " + ch);

        System.out.println("Enter your name");
        String name = input.next();
        //String name = input.nextLine();

        System.out.println("name = " + name);


      input.close();
    }
}
