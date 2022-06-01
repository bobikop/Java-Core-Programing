package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        double salary = 25000;
        int creditScore = 642;
        int age = 42;


        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;
        System.out.println(eligibleForLoan);

        System.out.println("------------------------------------------------------");

        age = 32;
        String country = "USA";
        boolean eligibleToVote = age >= 18 && country == "USA";
        System.out.println(eligibleToVote);


        System.out.println("------------------------------------------------------");


        char grade = 'A';
        boolean pastTheExam = grade == 'A' ||  grade == 'B' || grade == 'C' || grade =='C';
        System.out.println(grade);


        System.out.println("------------------------------------------------------");

        System.out.println(!true);

        String a ="yes";
        boolean yes = a =="yes";
        boolean no = !yes;

        int score = 65;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


    }

}
