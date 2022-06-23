package day20_forEach;

import java.util.Arrays;

public class MultiplyOddNumbers {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2  == 0){  // adding condition to eliminate even numbers
                continue;// skip loop if id not odd number
            }

           numbers[i] =  numbers[i] * 2;// here we update the value on index number 0
        }


        System.out.println(Arrays.toString(numbers));
    }
}
/*
1. write a program that can multiply each odd number of an integer array by 2
                ex:
                    array = [1,2,3,4,5];

                output:
                    array =[2,2,6,4,10]


                    int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];

        for (int i = 0; i < 5; i++) {

            if (arr[i] % 2 == 0) {
                arr2[i] = arr[i];
            } else {
                arr2[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr2));

 */