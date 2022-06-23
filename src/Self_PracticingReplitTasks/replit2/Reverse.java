package Self_PracticingReplitTasks.replit2;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {



        String[] array = { "hello", "boban", "nikola"};

        String[] reverse = new String[array.length]; //{ 5,5 , 4,2,1,3,2,1};

        for (int i = array.length - 1, j=0; i >= 0 ; i--,j++) { // we need to start form last array
            reverse[j] = array[i];

        }


        System.out.println(Arrays.toString(reverse));
    }
}
