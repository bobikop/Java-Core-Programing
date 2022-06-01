package Self_PracticingAprilMay;

import java.util.Scanner;

public class PatientEntry {

    public static void main(String[] args) {
        //Enter your code here

        String firstName = "";
        String lastName = "";
        String fulNmame = lastName + ", " + firstName;
        String email = "";
        String street = "";
        String state = "";
        String city = "";
        int age = 0;
        int zipcode = 0;

        double height = 0;
        double weight = 0;

        boolean isMarried = true;
        long workPhoneNumber = 0;
        long personalPhoneNumber = 0;

        String address = " Address: " + street + "," + city + ", " + state + "\n" + zipcode;
        String contacts = " Contacts: work phone number - " + workPhoneNumber + "," +
                " personal phone number - " + personalPhoneNumber + "," + "\n" + " email:" + email;


        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");




        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        firstName = scan.next();

        System.out.println("Enter your last name");
        lastName = scan.next();

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        // continue for city
        System.out.println("Enter your city");
        city = scan.next();

        System.out.println("Enter your state");
        state = scan.next();

        System.out.println("Enter your zip code");
        zipcode = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();

        scan.nextLine();

        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();

        scan.nextLine();

        System.out.println("Enter your age");
        age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your height");
        height = scan.nextDouble();

        System.out.println("Enter your weight");
        weight = scan.nextDouble();

        scan.nextLine();

        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();


        System.out.println("Patient personal information Full Name: " + lastName + ", " + firstName + address +
                contacts + "Age: " + age + " " + "Height: " + "Weight: " +
                weight + " pounds married?: " + isMarried);

        scan.close();

    }


}
