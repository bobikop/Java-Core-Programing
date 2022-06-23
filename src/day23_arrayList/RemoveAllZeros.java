package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveAllZeros {
    public static void main(String[] args) {


        ArrayList<Integer>  list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        Collections.sort(list); // call Collections and sort method to sort all arraylist elements from small to big
        Collections.reverse(list); // call Collections and sort method to put all zeros on the end of arraylist
        System.out.println(list); //  print new array list with zero elements on the end



    }
}
/*
6. Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]

 */