package day06_IfStatements;

public class MinimumNumber {
    public static void main(String[] args) {
        int num1 = 52;
        int num2 = 63;

        if(num1 < num2){
            System.out.println(num1 + " Is the minimum number");
        }
        if(num2 < num1){
            System.out.println(num2 + " Is the minimum number");
        }
        if(num1 == num2){
            System.out.println(num1 + " and " + num2 + " are equal numbers");
        }

    }
}