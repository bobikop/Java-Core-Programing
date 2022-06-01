package day16_nestedLoop;

import java.util.Scanner;

public class FrequencyOfJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String javaSentence = input.nextLine();

        int count = 0;
        for (int i = 0; i < javaSentence.length() - 4; i++) {
            if (javaSentence.equalsIgnoreCase("java")) {
                count++;
            }
        }

        System.out.println(count);
    }
}
/*. Write a program that can return the frequency of the word java from a sentence
    Ex:
        sentence = "My favorite programming language is Java, I love jAva, JAVA is so cool"

    output:
        3

1. First, we split the string by spaces in a
2. Then, take a variable count = 0 and in every true condition we increment the count by 1
3. Now run a loop at 0 to length of string and check if our string is equal to the word
4. if condition is true then we increment the value of count by 1 and in the end, we print the value of count.



 */
