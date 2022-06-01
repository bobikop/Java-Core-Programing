package day10_string;

import java.util.Scanner;

public class ReallyWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scan.next();

        if (word.endsWith("ly")){
            System.out.println("really");
        }else{
            System.out.println("enter another word");
        }
    }
}
