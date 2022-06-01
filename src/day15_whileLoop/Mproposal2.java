package day15_whileLoop;

import java.util.Scanner;

public class Mproposal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answerYesOrNot = input.next().toLowerCase();


        while (!(answerYesOrNot.equals("yes") || answerYesOrNot.equals("no"))){
            System.out.println("Invalid answer, please re-enter");
            System.out.println("Will you marry me?");
            answerYesOrNot = input.next().toLowerCase();

        }
        if (answerYesOrNot.equals("yes")){
            System.out.println("Congrats");
        }
        if (answerYesOrNot.equals("no")){
            System.out.println("Goodbye");
        }


    }
}
