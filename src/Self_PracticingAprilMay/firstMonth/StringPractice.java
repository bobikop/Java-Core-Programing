package Self_PracticingAprilMay.firstMonth;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.next();


        if (word.toLowerCase().startsWith("java") && word.toLowerCase().contains("java")) {
            System.out.println("true");
        } else if (word.substring(1).startsWith("java")) {
            System.out.println("true");

        } else {
            System.out.println(false);
        }


        input.close();
    }
}
/*
Use String methods to check if the given word contains the text java,
 but not anywhere in the String. The java text must be in either
 position 0 or position 1 of the String. If the text java appears in any other
 position it is not valid and is not considered to be found in the String.
Output a boolean value, true or false.

 char each = str.charAt(i); // each character of the string if
            if (!result.contains(""+ each)
 */