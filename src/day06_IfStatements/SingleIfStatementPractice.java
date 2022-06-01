package day06_IfStatements;

public class SingleIfStatementPractice {
    public static void main(String[] args) {
        int number = 100;

        boolean evenNumber = number % 2 == 0;


        if (evenNumber){
            System.out.println("Even number");
        }
        if (!evenNumber){
            System.out.println("Odd number");
        }

        System.out.println("-------------------------");

        if(number % 2 == 0){
            System.out.println("Even number");
        }
        if(number %2 != 0){
            System.out.println("Odd number");

        }

    }
}
