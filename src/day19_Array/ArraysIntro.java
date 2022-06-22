package day19_Array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {


        int score1 = 85;
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;

        System.out.println("-------------------------");

        int [] score = new int[5];
        score[2] = 78;
        score[0] = 85;
        score[1] = 75;
        score[3] = 88;
        score[4] = 95;

                System.out.println(Arrays.toString(score));

    }
}
