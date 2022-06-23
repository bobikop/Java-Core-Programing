package Self_PracticingReplitTasks.replit2;

import java.util.Scanner;

public class NumberOfWords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }

    public static int wordCount(String words){
        String str = "";
        int count = 5;


        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')){
                count++;
            }

        }
        return  count;

    }
}
