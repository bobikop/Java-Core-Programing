package Self_PracticingReplitTasks;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.next();

        scan.close();


        if (word.length()==1||  word.length() ==2 || word.length() == 3){
            System.out.println("Too short!");

        }else if (word.length() == 5) {
            System.out.println(word.charAt(4) + "" + word.charAt(3) + "" + word.charAt(2) + "" + word.charAt(1) + "" + word.charAt(0));
        }else if (word.length() > 5){
            System.out.println("Too long!");
        }

    }
}
