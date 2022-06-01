package day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {


        for (int i = 10; i >= 5; i--) { // i: 10,9,8,7,6,5,4,3,2,1,
            System.out.println("Hello Sydeo " + i);

        }
        int sum = 0;

        for (int i = 1; i <= 100; i++) {

            sum += i;
        }
        System.out.println("sum = " + sum);
        System.out.println("***************************************************************");
        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.print(i + " ");
        }
        System.out.println("Hello");

        System.out.println();

        for (char i = 'Z'; i >= 'A'; i--) {

            System.out.print(i + " ");
        }

        //   System.out.println(); ///to star new line


    }
}
/*
 // sum of all the numbers 1 ~ 100

        // print all the alphabet letters A ~Z

        // print all the alphabet letters in backwards

 */