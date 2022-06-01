package day13_customMethods2;

import java.util.Scanner;

public class WarmupTasks {
    public static void main(String[] args) {




       Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers and operator");
       double  num1 = scan.nextDouble();
       double  num2 = scan.nextDouble();
        System.out.println("Enter the operator");
       char  mathOperator = scan.next().charAt('0');
       scan.close();


eligibleToVote(35, false);

    }

    public static void calculate (double num1, double num2, char mathOperator){

        double result = 0;

       switch (mathOperator){
           case '+': result = num1 + num2;
               System.out.println(num1 + " " + "+ " + num2 + " " + "= " + result );
               break;
           case '-':result = num1 - num2;
               System.out.println(num1 + " " + "- "+ num2 + " " + "= " + result );
           break;
           case '*':result = num1 * num2;
               System.out.println(num1 + " " + "* "+ num2 + " " + "= " + result );
               break;
           case'/':result = num1 / num2;
               System.out.println(num1 + " " + "/ "+ num2 + " " + "= " + result );
           default:
               System.err.println("Invalid operator: " +mathOperator);


       }




        }



    public static void ageGroup(int age){
        if(age >=0  && age <= 150){

            System.out.println(  (age < 21)? "Teenager"  :(age < 55)? "Adult" : "Senior" );

        }else{

            System.err.println("Invalid age: "+ age);

        }

    }






    public static void eligibleToVote(int age, boolean isAmerican){

        if (age >= 18 && isAmerican){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }

    }


    public static class SumOfTwoInteger {
        public static void main(String[] args) {

            sumOfTwoNumbers(8,12);

        }


          public static int sumOfTwoNumbers(int n1, int n2){
            int sum = n1 + n2;
            return sum;
           }







    }
}










/*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

        Ex:
            calculate(10, 20, '+')

        output:
            10 + 20 = 30


2. Create a method named ageGroup that can print the age group of the person

        age groups are:
                Teenager (< 21)
                Adult   (>=21 && <55 )
                Senior  ( > 55 )
 */