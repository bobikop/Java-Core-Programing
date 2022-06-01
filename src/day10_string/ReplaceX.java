package day10_string;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        if (word.startsWith("x")) {
            System.out.println(word.replaceFirst("x", "a"));
        } else {
            System.out.println("Word is not eligible for editing");
        }

        scan.close();

    }
}
/*
2. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
	                    Input:
	                        xcodex
	                    Output:
	                        acodex
 */