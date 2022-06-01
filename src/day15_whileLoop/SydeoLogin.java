package day15_whileLoop;

import java.util.Scanner;

public class SydeoLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = input.next();

        System.out.println("Enter your password");
        String password = input.next();

        if (username.equals("Sydeo") && password.equals("password")) {
            System.out.println("Logged in");
        } else { // otherwise
            for (int i = 0; i < 3; i++) {
                if (i != 2) {
                    System.err.println("Incorrect username or password, please re-enter");
                }else{
                    System.err.println("This is your last allowed attempt. Please re-enter your username and password");
                }


                System.out.println("Enter your username");
                username = input.next();


                System.out.println("Enter your password");
                password = input.next();

                if (username.equals("Sydeo") && password.equals("password")) { // if the user entered are valid credentials then break will exit the loop
                    System.out.println("You are now logged in");
                }
            }

            // after the for loop if username and password are still incorect then you raccount is locked
            if (!(username.equals("Sydeo") && password.equals("password"))) {

                System.out.println("You account now is locked, please contact the support team");
            }
        }
        input.close();
    }
}
