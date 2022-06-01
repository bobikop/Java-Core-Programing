package day14_forLoop;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        System.out.println(sumOfFourIntegerNumbers(10,20,30,50));


    }

    public static int sumOfTwoIntegerNumbers(int num1, int num2){
        return num1 + num2;

    }

    public static int sumOfThreeIntegerNumbers(int num1, int num2, int num3) {
        //return num1 + num2 + num3;
        return sumOfTwoIntegerNumbers(num1, num2) + num3;
    }

    public static int sumOfFourIntegerNumbers(int num1, int num2, int num3, int num4) {
        //return num1 + num2 + num3 + num 4;
        //return sumOfThreeIntegerNumbers(num1, num2, num3) + num4;
        //  return sumOf2IntegerNumbers(n1, n2) + sumOf2IntegerNumbers(n3, n4);
        return  sumOfTwoIntegerNumbers( sumOfThreeIntegerNumbers(num1, num2, num3) , num4 );

    }
}
/*
Task 2:
    1. create a method that can find the sum of two integer numbers
                method name: sumOf2Numbers

    2. create a method that can find the sum of three integer numbers
                method name: sumOf3Numbers

    3. create a method that can find the sum of four integer numbers
                method name: sumOf4Numbers
 */