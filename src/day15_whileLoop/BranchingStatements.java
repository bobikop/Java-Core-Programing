package day15_whileLoop;

public class BranchingStatements {
    public static void main(String[] args) {


        // Break statement

        for (char i = 'A'; i <= 'F'; i++) {

            System.out.println(i);

            if (i == 'D') {
                break;
            }

        }

        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < 10; i++) {

            if (i == 7) { // if we want to skip something we use continue
                continue;
            }
            if (i == 8) { // must be above println statement
                continue;
            }
            System.out.println(i);


        }


    }
}
