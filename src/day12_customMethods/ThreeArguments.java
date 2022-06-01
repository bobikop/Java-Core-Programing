package day12_customMethods;

import java.util.Scanner;

public class ThreeArguments {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("enter the mathOperator: ");
        char mathOperator = input.next().charAt(0);

        input.close();


        calculate(num1,num2,mathOperator);

    }

    public static void calculate(int num1 , int num2 , char mathOperator){

        String result = "The result is ";

        if(mathOperator == '+'  || mathOperator == '-' || mathOperator == '*' || mathOperator == '/'){

            if(mathOperator == '+'){
                result += (num1 + num2);
            }else if(mathOperator == '-'){
                result += (num1 - num2);
            }else if(mathOperator == '*'){
                result += (num1 * num2);
            }else{
                result += (num1 / num2);
            }

        }else {
            result = "Invalid Operator";
        }

        System.out.println(result);


   }

}
/*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

    The method should display the calculation result of those two numbers as long as
    the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

        Ex:
            calculate(10, 20, '+')

        output:
            10 + 20 = 30



             public static void maxNum(double num1, double num2) {


    }

 */