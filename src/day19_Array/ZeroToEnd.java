package day19_Array;

import java.util.Arrays;

public class ZeroToEnd {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for(int j = i ; j < array.length; j++){
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
/*

        7. write a program that can move all the zeros to the end of the array
        Ex:
        array = {10, 0, 5, 0, 1, 0};

        output:
        {10, 5, 1, 0, 0, 0}
 */