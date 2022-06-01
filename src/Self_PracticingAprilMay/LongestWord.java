package Self_PracticingAprilMay;

import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = scan.next();
        System.out.println("Enter second word");
        String word2 = scan.next();


        if (word1.length() > word2.length()){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }



    }
}
