package day15_whileLoop;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a string");
        String str = input.nextLine();

        System.out.println("enter a character");
        char chr = input.next().charAt(0);

        int result = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == chr) {
                result += 1;
            }
        }
        System.out.println(result);
        input.close();
    }
    }

