package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrowKeyword {

    // using trow keyword to get program crashed
    public static void main(String[] args) {

        System.out.println("Enter your age");
        int age = new Scanner(System.in).nextInt();


        if(age < 0 || age > 150){
            if (age <0){
                throw new InputMismatchException("Age of the person should not be negative : " + age);
                // System.err.println("Invalid age");
                // System.exit(1);
            }else{
                throw  new InputMismatchException("Age of the person can not be greater than 150: " + age);
            }

        }

        if (age >=21){
            System.out.println("Eligible");
        }else{
            System.out.println("No eligible");
        }

        System.out.println("----------------------------------------------------------------------------");

        //throw new RuntimeException("Runtime exception");
        //System.out.println("Hello World");

    }
}
