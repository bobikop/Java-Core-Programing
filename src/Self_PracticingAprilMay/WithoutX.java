package Self_PracticingAprilMay;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.next();
        //---------------------------------------------

        char x = 'x';
        if (word.toLowerCase().startsWith("x") && word.toLowerCase().endsWith("x")) {
            System.out.println(word.substring(1,word.length() - 1));
        } else if (word.toLowerCase().startsWith("x")){
            System.out.println(word.substring(1));
        } else if (word.toLowerCase().endsWith("x")) {
            System.out.println(word.substring(0,word.length() -1));
        }else{
            System.out.println(word);
        }

        input.close();
    }

}




/*
Use String methods to modify the given word based on the following rules:
If word starts with or ends with x or X print the String without those x characters
If there is no x or X as the first or last character print the word untouched
 */