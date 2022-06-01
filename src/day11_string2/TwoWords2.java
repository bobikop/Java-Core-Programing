package day11_string2;

import java.util.Scanner;

public class TwoWords2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = scan.next();

        System.out.println("Enter first word");
        String word2 = scan.next();


        System.out.println(word1 + "" + word2);

    }
}
/*

6. Ask user to enter two words. Then add them together and print.
    But if the last letter in the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */