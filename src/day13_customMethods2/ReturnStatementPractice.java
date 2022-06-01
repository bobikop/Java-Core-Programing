package day13_customMethods2;

import java.util.Scanner;

public class ReturnStatementPractice {
    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0);

        boolean isValid = grade == 'A' || grade == 'B' || grade =='C' || grade =='D' || grade == 'F';

        if (!isValid){
            System.out.println("Invalid grade");
            return;

        }
        System.out.println(   (grade == 'A')? "Excellent" :(grade =='B')? "Great job"  :(grade =='B')? "Good"
                :(grade =='B')? "Passed" : "Failed");


    }
}
