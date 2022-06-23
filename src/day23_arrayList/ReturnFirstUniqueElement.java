package day23_arrayList;

import java.util.ArrayList;

public class ReturnFirstUniqueElement {
    public static void main(String[] args) {

        // we can use nested loop but will get all the unique elements
        // in order to have loop stop after finding first unique element we need ,, break ,, branching statement

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);


        System.out.println(list);


        for (Integer element : list){
            int frequency = 0;
            for (Integer each : list ){
                // checking if element will match with each
                if (element == each ){
                    frequency++;
                }
            }

            if ( frequency == 1){
                System.out.println(element);
                break;
            }
        }


        // find the frequency of first element
       // int element = 1; remove this since looking for 1 element and add outer loop Integer element








    }
}
