package day10_string;

import java.util.Scanner;

public class MyClassmates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of your classmate");
        String name1 = input.nextLine();

        System.out.println("Enter the name of your classmate");
        String name2 = input.nextLine();

        System.out.println("Enter the name of your classmate");
        String name3 = input.nextLine();

        System.out.println("Enter the name of your classmate");
        String name4 = input.nextLine();

        System.out.println("Enter the name of your classmate");
        String name5 = input.nextLine();

        System.out.println( name1 + "\n\t" + name2 + "\n\t" +name3 + "\n\t" + name4 + "\n\t" + name5);


        input.close();



    }
}
/*

1. Create a text file named MyClassmates.txt
            1.2 store 10 of your class mates' full names in seperate lines
    2. Create class named PrintNames, and write program that can read MyClassmates.txt and print the names of those 10 students
 */