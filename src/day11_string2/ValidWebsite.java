package day11_string2;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the website");
        String webSite = input.nextLine();


        if (webSite.startsWith("www.") && webSite.endsWith(".com") || webSite.endsWith(".edu") || webSite.endsWith(".gow")) {
            System.out.println("Website is valid");
        } else {
            System.err.println("Website is not valid");
        }

    }
}
/*
1. write a program that can check if the given website is valid website or not
	            starts with: www.
	            ends with: .com, .edu, .gov

 */