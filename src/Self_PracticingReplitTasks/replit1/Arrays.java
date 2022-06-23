package Self_PracticingReplitTasks.replit1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {


        int[] num = {1, 2, 3};

        int[] numExtend = new int[3];

        System.arraycopy(num, 0, numExtend, 0, num.length);

        for (Integer each : numExtend) {
            System.out.println(each);


        }

    }
}
