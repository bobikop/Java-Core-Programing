package day16_nestedLoop;

public class Multiplication_Table {

    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) { // starts with i:1 and jump to inner loop

            for (int j = 1; j <= 10; j++) { // inner loop goes from 1 ~ 10 an and then go back to outer loop for new i:2
                System.out.print(j*i + "\t\t\t");
               // System.out.println(i*j+"\t\t");
            }
            System.out.println();
        }

    }
}
