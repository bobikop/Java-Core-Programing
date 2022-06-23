package day22_arrayListIntro;

import utilities.ArraysUtility;

public class ContainsTest {
    public static void main(String[] args) {

        int[] numbers = { 10,20,30,40,50,60,70,80,90};

        boolean has25 = ArraysUtility.contains(numbers, 20);
        System.out.println(has25);

        System.out.println("----------------------------------------");

        String[] name = {"Sumeye", "Hamza", "Boban"};
        System.out.println(ArraysUtility.contains(name, "Boban"));

    }
}
