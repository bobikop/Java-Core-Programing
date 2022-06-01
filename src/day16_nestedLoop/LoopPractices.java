package day16_nestedLoop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {


        for (int i = 0; i < 6; i++) {
            System.out.println("Hello" +i);
        }

        System.out.println("_---------------------------------_");

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello" +i);

        }
        System.out.println("_---------------------------------_");

        int j = 0;
        while (j<5){
            System.out.println("Hello" +j);
            j++;
        }

        System.out.println("_---------------------------------_");

        int k = 0;
        do {

            System.out.println("Hello" );
            k++;
        }while (k<5);

        System.out.println("_---------------------------------_");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = input.nextInt();

        while (score > 100 || score < 0){ // white the user provide invalid score we will continue asking for new entry new score
            System.out.println("Invalid score, please re-enter your score");
            score = input.nextInt();
        }


        if (score >= 60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }
}
