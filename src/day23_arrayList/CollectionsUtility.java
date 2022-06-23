package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        // min and max methods
        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println(max);
        System.out.println(min);

        System.out.println("-----------------------------------------------------------");

        //sort method

        ArrayList<String> items = new ArrayList<>();

        items.addAll(Arrays.asList("Eggs", "Potato", "Milk" , "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towel"));


        Collections.sort(items);

        System.out.println(items);

        System.out.println("-----------------------------------------------------------");

        // reverse method
        Collections.reverse(items);
        System.out.println(items);

        System.out.println("-----------------------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Jovan", "Viktor", "Galeb", "Hasan"));

        Collections.swap(students, 0,1);
        System.out.println(students);
        Collections.swap(students,0, students.size()-1);

        System.out.println("-----------------------------------------------------------");













    }
}
