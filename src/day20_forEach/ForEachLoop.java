package day20_forEach;

public class ForEachLoop {
    public static void main(String[] args) {

    // for loop

        int[]numbers = {10,20,30,40,50,60,};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("------------------------------------------------------" );
 // for each loop

        for(int each : numbers ){
            System.out.println(each);
        }


    }
}
