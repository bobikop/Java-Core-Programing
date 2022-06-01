package day10_string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = scan.nextLine();

        System.out.println("Enter second word");
        String word2 = scan.nextLine();

        word1 = word1.substring(2);
        word2 = word2.substring(2);

        System.out.println(word1+word2);

    }
}
/*
5. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */