package day15_whileLoop;

import java.util.Scanner;

public class FrequencyOfChar2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = input.nextLine();
        System.out.println("Enter your character please");

        char ch = input.next().charAt(0);

        int result = 0;

        for (int i = 0; i < sentence.length() - 1; i++) {
            if (sentence.length() - 1 == ch) {
                result += 1;
            }

        }
        System.out.println(result);
        input.close();
    }
}
