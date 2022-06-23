package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Cydeo School";
        // to get all characters and store them we need to Char method

        char[] ch = str.replace(" ", "").toCharArray(); // replace is added to remove space from the string only!


        System.out.println(Arrays.toString(ch));


        System.out.println("--------------------------------------------------------------------------------------");

        String str1 = "Today is a great day to learn Java";
        String [] words = str1.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------------------------------------------------------------------");

        String sentence = "I love Java";

        sentence.split(" "); // [I love Java]
        String[] arr = ArraysUtility.reverse(sentence.split(" ")); // java love I

        System.out.println(Arrays.toString(arr));

        String reversedSentence = ""; // I love Java

        for (int i  = 0; i < arr.length; i++){
            reversedSentence+= arr[i];
        }



        System.out.println(reversedSentence);






    }
}
