package day10_string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReplaceAllx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

       word = word.replace("x", "a");
       word = word.replace("X", "a");

        System.out.println(word);
        scan.close();

    }
}
/*

3. Write a program that asks user to enter a word. and replace all the x or X with character a
	                    Input:
	                        xcodeX
	                    Output:
	                        acodea
 */