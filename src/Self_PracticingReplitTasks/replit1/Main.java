package Self_PracticingReplitTasks.replit1;

import java.util.Scanner;

public class Main {

    public static void sign(int n){
        //WRITE YOUR CODE BELOW
        if (n > 0)
            System.out.println("positive");
        else if (n < 0)
            System.out.println("negative");
        else
            System.out.println("zero");



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        sign(n);
        System.out.println(n);

    }






}
