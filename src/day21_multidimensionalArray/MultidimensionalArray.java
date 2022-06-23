package day21_multidimensionalArray;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {

        int[] arr1 = {10, 20,30};
        int[] arr2= {40, 50,60, 70, 80};
        int[] arr3 = {90,100};
        int [] arr4 = {1000,2000};

        // there are 4 single dimension array and we want to keep the same objects we can use two  Dimensional array
        System.out.println("---------------------------------------");

        int[][]  arr2D = {{10, 20,30},{40, 50,60, 70, 80},{90,100} , arr4};

        System.out.println(arr2D.length);

        System.out.println(Arrays.toString(arr2D[2])); //{90,100}
        System.out.println((arr2D[2][0]));
        System.out.println(arr2D[1][2]);


    }
}
