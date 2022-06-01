package day16_nestedLoop;

public class NestedLoopIntroShorts {
    public static void main(String[] args) {

        // Print 1 ~ 5 for 5 times and be n

        for (int j = 1; j <= 5; j++) { // created new outer loop with new variable and we can nest first loop inside of outer loop
            for (int i = 1; i <= 5; i++) {   // i: 1 ~ 5 i value is from 1 to 5
                System.out.print(i + " "); // it will print inner loop for 5 time
            }

            System.out.println();
        }
        System.out.println();

    }
}
