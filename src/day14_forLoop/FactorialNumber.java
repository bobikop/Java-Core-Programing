package day14_forLoop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println(factorial(num));
    }

    public static int factorial(int num){
        int factorial = 1; //must be 1 since any number * with 0 will return 0
        for (int i = 1; i <= num;i++) {
              factorial *= i;
        }
          return factorial;
    }



}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

          	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

public static int sum(int num){
        int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            return  sum;




 */