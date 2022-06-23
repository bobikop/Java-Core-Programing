package day22_arrayListIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        int[] array = new int [5];
        array[3] = 10;
        array[1] = 20;

        System.out.println(Arrays.toString(array));
        System.out.println("------------------------------");


        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());



        System.out.println("------------------------------");
        int [] arr2 = new int[6];
        arr2[2] = 8;
        arr2[5] = 12;

        System.out.println(Arrays.toString(arr2));

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(5);
        list1.add(8);
        list1.add(2);
        list1.add(22);
        list1.add(34);

        System.out.println(list1);
        System.out.println("------------------------------");


        ArrayList<String> names = new ArrayList<>();

        names.add("Viktor MIlosevic");
        names.add("Manuela Nikolic");
        names.add("Boban Milosevic");

        System.out.println(names);
        String newName = names.get(1);

        System.out.println(newName);






    }
}
