package day06_IfStatements;

public class MaximumNumber {
    public static void main(String[] args) {
        int num1 = 65;
        int num2 = 52;

        if(num1 > num2){
            System.out.println(num1 + " Is the maximum number");
        }
        if(num2 > num1){
            System.out.println(num2 + " The numbers are equal");
        }
        if(num1 == num2){
            System.out.println(num1 + " and " + num2 + " are equal numbers");
        }

    }
}

