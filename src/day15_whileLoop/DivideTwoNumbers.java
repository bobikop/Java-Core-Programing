package day15_whileLoop;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a positive number");
            int n1 = input.nextInt();
            System.out.println("Enter a positive number");
            int n2 = input.nextInt();
            input.close();
            int result = 0;// we count the number of times  n2 can be subtracted from n1
            if (n1 > n2 && n1 > 0 && n2 > 0) {//this way will count till n1 doesnt become 0
                while (n1!=0) {
                    result+=1 ;
                    n1-=n2;
                    if((n1-n2)<0){ break;}// will not touch n1 -n2 less than 0
                } System.out.println(result);
            }

    }
}