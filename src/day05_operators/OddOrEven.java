package day05_operators;

public class OddOrEven {
    public static void main(String[] args) {
        int num = 20;

        boolean evenNumber = (num % 2 == 0);
        boolean oddNumber = (num % 2 != 0);

        System.out.println(num + " is an even number : " + evenNumber);
        System.out.println(num + " is an odd number : " + oddNumber);

    }
}

/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
        Ex:
        number = 20

        output:
        20 is an even number: true
        20 is an odd number: false


        Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)

*/
