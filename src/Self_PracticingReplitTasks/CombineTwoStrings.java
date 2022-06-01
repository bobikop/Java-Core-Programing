package Self_PracticingReplitTasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CombineTwoStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();


        input.close();

        char firstCharW1 = word1.charAt(0) ;
        char secondCharW1 = word1.charAt((0) +1);
        char thirdCharW1 = word1.charAt((0) +2) ;

        char firstCharW2 = word2.charAt(0) ;
        char secondCharW2 = word2.charAt((0) +1) ;
        char thirdCharW2 = word2.charAt((0) +2);


               if(word1.length() == 3 &&  word2.length() == 3){
                   System.out.println(firstCharW1 +""+ firstCharW2 +secondCharW1 +""+ secondCharW2 +""+ thirdCharW1 +""+ thirdCharW2);
               }else{
                   System.out.println("cannot merge");
               }


           }


    }

/*

 */