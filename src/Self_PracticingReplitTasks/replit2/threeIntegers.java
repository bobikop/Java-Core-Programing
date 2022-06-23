package Self_PracticingReplitTasks.replit2;

import java.util.Scanner;

public class threeIntegers {

    public static void main(String[] args) {


        next3(3);

    }

    // DO NOT TOUCH ABOVE:

    public static void next3(int i){
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number:");
        int num = inp.nextInt();

        if(num >= 0){
            System.out.println(num+1);
            System.out.println(num+2);
            System.out.println(num+3);
        }

    }


}
