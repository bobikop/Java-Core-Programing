package day20_forEach;

import java.util.Arrays;
import utilities.ArraysUtility;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};

        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain two arrays together


        int k =0;// using this k to tracking that we add first elemets of first array to the new array and then add elements of the second array to the new array
        for (int i = 0; i < arr1.length; i++, k++) { // this for loop is for first array index numbers
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++,k++) { // this loop is for second array index numbers
             arr3[k] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));
        System.out.println("-----------------------------");

        int[] a1 = {10, 20, 30, 40};
        int[] a2 = {50, 60};

       int[ ]a3 = ArraysUtility.merge(a1,a2);

        System.out.println(Arrays.toString(a3));

        System.out.println("-----------------------------");

        double[] b1 = {10.5,60.3,32.1,65.25};
        double[] b2 = {6.5,64.3,9.1,88.25};

        double[] b3 = ArraysUtility.merge(b1,b2);
        System.out.println(Arrays.toString(b3));

        System.out.println("-----------------------------");

        char[] ch1 = { 'A', 'B'};
        char[] ch2 = { 'C', 'S'};

        char[] ch3 = ArraysUtility.merge(ch1,ch2);
        System.out.println(Arrays.toString(ch3));

        System.out.println("-----------------------------");

        String[] str1 = {"Boban"};
        String[] str2 = {"Milosevic"};

        String[] str3 = ArraysUtility.merge(str1,str2);
        System.out.println(Arrays.toString(str3));




    }
}
/*
2. write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}


            int[] merged = new int[arr.length + arr2.length];


        for (int j = 0; j < arr.length; j++) {
            merged[j] = arr[j];
        }

        for (int k = arr2.length - 1, i = merged.length - 1; i > merged.length - arr2.length - 1; k--, i--) {
            merged[i] = arr2[k];
        }

        System.out.println(Arrays.toString(merged));

 */