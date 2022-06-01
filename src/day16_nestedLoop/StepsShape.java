package day16_nestedLoop;

public class StepsShape {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {  // i;1, i2

            for (int j = 0; j < 10; j++) { // j; 1,
                if (i >= j) {
                    System.out.print("*  ");
                }
            }
            System.out.println();

        }


    }
}
