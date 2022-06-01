package day12_customMethods;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.close();
        ageGroup(age);



    }
   public  static  void ageGroup(int age){


        if(age < 21 && age > 12){
            System.out.println("Tenneger");
         } else if (age >= 21 && age < 55) {
            System.out.println("Adult");
        } else if (age >= 55 && age < 120) {
            System.out.println("Senior");

        }else{
            System.out.println("Invalid entry");
        }

   }


}



/*
2. Create a method named ageGroup that can print the age group of the person

        age groups are:
                Teenager (< 21)
                Adult   (>=21 && <55 )
                Senior  ( > 55 )
 */