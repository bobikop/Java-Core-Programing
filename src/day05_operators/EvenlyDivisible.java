package day05_operators;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int num = 65;
        boolean divByTwo = 65 % 2 == 0;
        boolean divByThree = 65 % 3 == 0;
        boolean divByFive = 65 % 5 == 0;

        System.out.println(num + " is divisible by 2 : " + divByTwo);
        System.out.println(num + " is divisible by 3 : " + divByThree);
        System.out.println(num + " is divisible by 5 : " + divByFive);
    }
}

/*
Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

 */