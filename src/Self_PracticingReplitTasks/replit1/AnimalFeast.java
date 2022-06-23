package Self_PracticingReplitTasks.replit1;

import java.util.Scanner;

public class AnimalFeast {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the animal name");
        String animalName = input.nextLine();

        System.out.println("Enter dish name");
        String dish = input.nextLine()   ;



        feast(animalName,dish);

        input.close();
    }

    public static void feast(String animalName, String dish) {

        boolean ifMatch = (animalName.charAt(0) == dish.charAt(0) && animalName.charAt(0) - 1 == dish.charAt(0) - 1);

        if (ifMatch) {
            System.out.println("This animal is allowed to bring dish to the feast");
        } else {
            System.out.println("This animal is not allowed to bring dish to the feast");
        }

    }

}
