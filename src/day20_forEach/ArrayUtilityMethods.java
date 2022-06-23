package day20_forEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

        // TO STRING METHOR - toString()
        int[] score = { 70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);

        System.out.println(result);

        System.out.println("-----------------------------------------------------------------");

        // equals() method - if string have same objects result is true

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5,};

       boolean r1 =  Arrays.equals(a1 , a2);

        System.out.println(r1);


        char[] ch1 = {'A', 'B','C'};
        char[] ch2 = {'A', 'B','C'};

        boolean r2 = Arrays.equals(ch1,ch2);
        System.out.println(r2);

        System.out.println("-----------------------------------------------------------------");

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "C", "B"};

        System.out.println(Arrays.equals(s1,s2));

        System.out.println("-----------------------------------------------------------------");

        // sort() method

        int[] nums = {100, 80, 90, 60, 70, 50, 80,15, 20, 3};

        System.out.println(Arrays.toString(nums));  //  print before sorting

        Arrays.sort(nums); //sorting

        System.out.println(Arrays.toString(nums)); // print after sorting(sorting from smaller value to bigger

        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: " + nums[nums.length-1]);

        System.out.println("-----------------------------------------------------------------");

        String[] b1 = {"C", "B", "C"};
        String[] b2 = { "B", "C", "A"};

        Arrays.sort(b1); // b1 = {A,B,C}
        Arrays.sort(b2); // b2 = {A,B,C}

        System.out.println("---------------------------------------");

        String[] students = {"Yaxier", "Madiyar", "Ali", "Abidullah", "Alena"};

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("---------------------------------------");

        int[] array = {10, 20, 30, 40, 50, 60, 70};

        int[] array2 = Arrays.copyOf(array, 10);

        System.out.println(Arrays.toString(array2));

        System.out.println("---------------------------------------");

         //copyOf method copy from first to last object of array

        int[] n1 = {1,2,3,4,5};
        int[] n2 = {6, 7, 8, 9, 10, 11, 12};

        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length );

        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j]= n2[i];
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("----------------------------------------");

        //copy of range copy of different array object to the last

        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        //  index:    0    1    2    3    4    5    6

        char[] result1 = Arrays.copyOf(ch, 20 );

        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch, 2, 5); // excludes ending index

        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch, 2, ch.length);

        System.out.println(Arrays.toString(result3));




    }
}
