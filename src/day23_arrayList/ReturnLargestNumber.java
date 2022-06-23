package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnLargestNumber {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int num = 6;

        ArrayList<Integer> result = new ArrayList<>(); //new arrayList here
        for (Integer each : list) { // checking each element of the array list here with for each loop
            if (!result.contains(each)) {
                result.add(each);
            }
        }
        int nth = result.get(result.size() - num);
        System.out.println("nth = " + nth);


    }
}
/*
5. write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */