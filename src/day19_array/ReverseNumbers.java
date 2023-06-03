package day19_array;

import java.util.Arrays;

public class ReverseNumbers {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        int[] reversedArr = new int[array.length];

        for (int i = 0; i <= array.length - 1; i++) {
            reversedArr[i] = array[array.length - i - 1];
        }

        System.out.println(Arrays.toString(reversedArr));


    }
}
