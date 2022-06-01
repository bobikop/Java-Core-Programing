package day05_operators;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number = 200;
        boolean positiveNumber = number > 0;
        boolean negativeNumber = number < 0;
        boolean numberIsZero = number == 0;
        System.out.println(number + " is positive number :" + positiveNumber);
        System.out.println(number + " is negative number :" + negativeNumber);
        System.out.println(number + " is zero :" + numberIsZero);

    }
}

/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false
 */