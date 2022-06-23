package day22_arrayListIntro;

import java.util.Arrays;

public class ReplaceTask {
    public static void main(String[] args) {


       int[] arr1 = {2,3,4,5,6,8,9};
       int[] arr2 =  replace(arr1,2,3);
       System.out.println(Arrays.toString(arr2));
       System.out.println("-----------------------------------");

       double[] arr3 = {2.3, 6.5, 2.8};
       double[] arr4 = replace(arr3, 0, 4.5);
       System.out.println(Arrays.toString(arr4));
       System.out.println("-----------------------------------");


       String[] arr5 = {"Java", "Six", "Days", "A", "Week"};
       String[] arr6 = replace(arr5, 1, "Seven");
       System.out.println(Arrays.toString(arr6));
       System.out.println("-----------------------------------");


    }

      public static int[] replace(int[] array, int index, int newElement){
          for (int i = array.length - 1; i >= 0; i--) {
              if(i == index){
                  array[index] = newElement;
              }
          } return array;
        }

    public static double[] replace(double[] array, int index, double newElement){
        for (int i = array.length - 1; i >= 0; i--) {
            if(i == index){
                array[index] = newElement;
            }
        } return array;
    }

    public static String[] replace(String[] array, int index, String newElement){
        for (int i = array.length - 1; i >= 0; i--) {
            if(i == index){
                array[index] = newElement;
            }
        } return array;
    }

    public static char[] replace(char[] array, int index, char newElement){
        for (int i = array.length - 1; i >= 0; i--) {
            if(i == index){
                array[index] = newElement;
            }
        } return array;
    }

}
/*
1. Replace Task:
        1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement.
        The method replaces the element of the array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String arrays

 */
