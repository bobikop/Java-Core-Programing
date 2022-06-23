package day23_arrayList;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        // finding average number of all the numbers


        int sum = 0;

        for (Integer each  : list){
            // for each loop will find each of elements

            sum += each;
        }

        double average = sum / (double)list.size(); // cast it to double to get decimal result



        System.out.println(average);
    }
}
