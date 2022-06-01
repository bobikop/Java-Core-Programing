package day06_IfStatements;

import java.io.PrintStream;

public class NumberToWord {
    public static void main(String[] args) {
        int num = 6;
        String word = "";

        if (num == 0) {
            word = "Zero";
        }
        if (num == 1) {
            word = "One";
        }
        if (num == 2) {
            word = "Two";
        }
        if (num == 3) {
            word = "Three";
        }
        if (num == 4) {
            word = "Four";
        }
        if (num == 5) {
            word = "Five";
        }
        if (num == 6) {
            word = "Six";
        }
        if (num == 7) {
            word = "Seven";
        }
        if (num == 8) {
            word = "Eight";
        }
        if (num == 9) {
            word = "Nine";
        }
        System.out.println(word);


    }
}
/*
Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement

 */