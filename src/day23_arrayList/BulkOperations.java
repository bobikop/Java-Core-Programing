package day23_arrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ///  addAll() Method


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);



        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);


        list1.addAll(1,numbers);

        System.out.println(list1);

        System.out.println("--------------------------------------------------");


        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(78,54,25,32));
        System.out.println(scores);

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Jovan", "Viktor", "Galeb"));// to convert multiple value in add object call Arrays.asList


        System.out.println(students);

        students.addAll(2, Arrays.asList("Michel", "Abdulah", "Manuela"));
        System.out.println(students);

        System.out.println("--------------------------------------------------");
        Integer [] nums = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));// asList take a multiple elements and return them as a list
        //l1.addAll(Arrays.asList(nums));

        System.out.println(l1);

        System.out.println("--------------------------------------------------");

        // containsAll() Method

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll( Arrays.asList(  "Alena", "Muhtar", "Gadir", "Ali" )  );

        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");

        boolean hasAlenaGadir = employeesList.containsAll( Arrays.asList("Alena", "Gadir") );

        boolean hasMuhtarAliKuzzat = employeesList.containsAll( Arrays.asList("Muhtar", "Ali", "Kuzzat") );

        System.out.println("hasAlena = " + hasAlena);
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);



        System.out.println("--------------------------------------------------");
        // removeAll() Method

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,10,20,30,40,50,60,70,10,10,10,10,20,20,20));

        System.out.println(list);

        list.removeAll(Arrays.asList(10,20));


        System.out.println(list);

        System.out.println("--------------------------------------------------");
        // retainAll() Method


        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena", "Alena", "Muhtar", "Gadir", "Ali", "Muhtar"));

        developers.retainAll(Arrays.asList("Alena", "Gadir"));

        System.out.println(developers);



        System.out.println("--------------------------------------------------");


        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.addAll(Arrays.asList("Eggs", "Potato", "Milk" , "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towel"));

        groceriesList.retainAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato"));

        System.out.println(groceriesList);

    }
}
