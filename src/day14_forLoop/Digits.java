package day14_forLoop;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter string");
        String combo = scan.nextLine();

        scan.close();

    }


}
/*
5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */