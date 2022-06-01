package day16_nestedLoop;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Enter the radius of the circle");
            double radius = input.nextInt();

            if(radius <= 0){
                System.err.println("Invalid entry for the radius of the circle");
                return;
            }

            double diameter = 2 * radius,
                    area = 3.14 * radius * radius,
                    perimeter = 3.14 * 2 * radius;

            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another circle?");
            String yesOrNo = input.next();
            while(!(yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("no"))){
                System.err.println("Invalid entry, pleas type yes or no");
                yesOrNo = input.next();
            }

            if(yesOrNo.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator App");
                break;
            }
        }
    }

}


/*

4. Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program


 */






