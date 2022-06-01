package day13_customMethods2;

import java.util.Scanner;

public class ThreeArguments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("Enter the math operator");
        char mathOperator = input.next().charAt(0);


calculate(num1,num2,mathOperator);

    }
    public static void calculate(double num1, double num2, char mathOperator){
        double result = 0;

        switch (mathOperator){
            case '+': result = num1 + num2;
                System.out.println(result);
                break;
            case'-': result = num1 - num2;
                System.out.println(result);
                break;
            case '*': result = num1 * num2;
                System.out.println(result);
                break;
            case '/': result = num1 / num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid math operator entry");


        }


    }

}
