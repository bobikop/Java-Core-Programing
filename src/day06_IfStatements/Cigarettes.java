package day06_IfStatements;

public class Cigarettes {
    public static void main(String[] args) {
        int age = 66;
        if (age >= 21 && age < 100) {
            System.out.println(" You are eligible to buy Cigarettes");
        }
        if (age < 21 || age > 100) {

            System.out.println("You are not eligible to buy Cigarettes");
        }
    }
}
