package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = { 1,2,3,1,2,4,5,5};

        int[] reverse = new int[array.length]; //{ 5,5 , 4,2,1,3,2,1};

        for (int i = array.length - 1, j=0; i >= 0 ; i--,j++) { // we need to start form last array
          reverse[j] = array[i];

        }


        System.out.println(Arrays.toString(reverse));

        System.out.println("-------------------------------------------");

        int[] nums = {100,200,300,400,500};

        nums = ArraysUtility.reverse(nums);
        System.out.println(Arrays.toString(nums));


    }
}
/*
3. Write a program that can display the unique elements of an array of inetgers
        Ex:
            arr = {1, 2, 3, 1, 2, 4, 5, 5}

        output:
            3
            4
 */