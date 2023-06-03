package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementsFromCollection {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        for (int i = 0; i < list.size(); i++) {
           if (list.get(i) < 4 ){
               list.remove(i);
           }
        }

        System.out.println(list);


        System.out.println("-------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,3,9));

        list2.removeIf( p -> p < 4); // removeif method is removing everithing until desired element

        System.out.println(list2);

        System.out.println("----------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "C3", "Java", "Ruby", "JavaScript", "C++", "C"));

        names.removeIf( each -> each.startsWith("J"));

        System.out.println(names);







    }
}
