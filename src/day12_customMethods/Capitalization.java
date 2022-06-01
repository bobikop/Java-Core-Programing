package day12_customMethods;

import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) {

        capitalization("cyDeO", "sCHooL");

    }

    public static  void capitalization (String firstName, String lastName ){

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(firstName + " " + lastName);


    }

}
/*
2. Create a method named capitalization that can format the first and last names of the person
 and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School

public static void main(String[] args) {
        capitalization("cYDeo", "sCHoOl");
    }

    public static void capitalization(String first, String last){
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
        System.out.println(first + " " + last);
    }



 */