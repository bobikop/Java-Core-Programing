package day08_ternary_switch;

public class Browser {
    public static void main(String[] args) {
        String browserName = "Google";
        String result = "Invalid Browser";

        switch (browserName) {
            case "Chrome":
                result = "Chrome";
                break;
            case "Firefox":
                result = "Firefox";
                break;
            case "Opera":
                result = "Opera";
                break;
            case "Safari":
                result = "Safari";
                break;
            case "Edge":
                result = "Edge";
                break;
        }
        System.out.println(result);

    }
}






/*
9. write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */