package utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[]  merge(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain two arrays together


        int k =0;// using this k to tracking that we add first elemets of first array to the new array and then add elements of the second array to the new array
        for (int i = 0; i < arr1.length; i++, k++) { // this for loop is for first array index numbers
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++,k++) { // this loop is for second array index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }



    public static double[]  merge(double[] arr1, double[] arr2){

        double[] arr3 = new double[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain two arrays together


        int k =0;// using this k to tracking that we add first elemets of first array to the new array and then add elements of the second array to the new array
        for (int i = 0; i < arr1.length; i++, k++) { // this for loop is for first array index numbers
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++,k++) { // this loop is for second array index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }




    public static char[]  merge(char[] arr1, char[] arr2){

        char[] arr3 = new char[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain two arrays together


        int k =0;// using this k to tracking that we add first elemets of first array to the new array and then add elements of the second array to the new array
        for (int i = 0; i < arr1.length; i++, k++) { // this for loop is for first array index numbers
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++,k++) { // this loop is for second array index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }



    public static String[]  merge(String[] arr1, String[] arr2){

        String[] arr3 = new String[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain two arrays together


        int k =0;// using this k to tracking that we add first elemets of first array to the new array and then add elements of the second array to the new array
        for (int i = 0; i < arr1.length; i++, k++) { // this for loop is for first array index numbers
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++,k++) { // this loop is for second array index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }


        public static int[] reverse(int[] array){

        int[] reverse = new int[array.length]; //{ 5,5 , 4,2,1,3,2,1};

        for (int i = array.length - 1, j=0; i >= 0 ; i--,j++) { // we need to start form last array
            reverse[j] = array[i];

        }
        return reverse;
    }


        public static char[] reverse(char[] array){

        char[] reverse = new char[array.length]; //{ 5,5 , 4,2,1,3,2,1};

        for (int i = array.length - 1, j=0; i >= 0 ; i--,j++) { // we need to start form last array
            reverse[j] = array[i];

        }
        return reverse;
    }


        public static String[] reverse(String[] array){

        String[] reverse = new String[array.length]; //{ 5,5 , 4,2,1,3,2,1};

        for (int i = array.length - 1, j=0; i >= 0 ; i--,j++) { // we need to start form last array
            reverse[j] = array[i];

        }
        return reverse;
    }


        public static double[] reverse(double[] array){

        double[] reverse = new double[array.length]; //{ 5,5 , 4,2,1,3,2,1};

        for (int i = array.length - 1, j=0; i >= 0 ; i--,j++) { // we need to start form last array
            reverse[j] = array[i];

        }
        return reverse;
    }


        public static int[] addElement(int[] array, int element) {

        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
        }

        public static double[] addElement(double[] array, double element){
            double[] new_array = Arrays.copyOf(array, array.length + 1);
            new_array[new_array.length-1] = element;
            return new_array;
        }

        public static char[] addElement(char[] array, char element){
        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length-1] = element;
        return new_array;
    }


        public static String[] addElement(String[] array, String element){
        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length-1] = element;
        return new_array;
    }

    public static boolean contains(int[] array, int element){

        for(int each: array){
            if (each == element){
                return true;

            }
        }
        return false;
    }

    public static boolean contains(double[] array, double element){
        for(double each: array){
            if (each == element){
                return true;
            }
        }
        return false;
    }


    public static boolean contains(char[] array, char element){
        for(char each: array){
            if (each == element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] array, String element){
        for(String each: array){
            if (each.equals(element) ){
                return true;
            }
        }
        return false;
    }


  /*  public static int[] remove(int[] array, int index){

        // do it home
    }


    public static int[] removeDup(int[] array){

        // do it home
    }

*/




    }

