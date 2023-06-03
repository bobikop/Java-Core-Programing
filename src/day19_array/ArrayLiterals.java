package day19_array;

import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        // second wat to initailize array by using Array Literal
        int[] nums = {10,20,30,40,50};

        System.out.println(numbers.length);
        System.out.println(numbers.length);


        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("------------------------------------------------------");
 // string literal example
          // element:      1          2           3           4            5          6         7
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // index:          0          1           2           3            4          5         6
        int n = 1;

        System.out.println(days[n-1]);


        System.out.println("------------------------------------------------------");

        String[] months = {"January" , "February" , "March", "April" , "May", "June", "July", "August" , "September" , "October", "November" , "December"};
        System.out.println("Arrays.toString(months) = " + Arrays.toString(months));


        // int[] numbers2 = new int[100];

        for (int i = months.length -1; i >=0; i--) {
            System.out.println(months[i]);
        }











    }
}
