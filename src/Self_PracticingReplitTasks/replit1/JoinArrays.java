package Self_PracticingReplitTasks.replit1;

import utilities.ArraysUtility;

import java.util.Arrays;
import java.util.Scanner;

public class JoinArrays {
    public static void main(String[] args) {


        int[] nums = {1,2,3};
        int[] newNums = new int[nums.length*2];
        for (int i = 0; i < 3; i++) {
            newNums[i]= nums[i];
        }

        System.out.println(Arrays.toString(newNums));

    }
}
