package day08_ternary_switch;

public class Loans {
    public static void main(String[] args) {
        int salary = 65000;
        int score = 720;

        String result = (salary > 60000 && score > 660) ? "Loan Approved" : "Loan Denied";
        System.out.println("result = " + result);
    }
}
/*
 if (salary >= 45000 && creditScore >= 700){
            System.out.println("Person is eligible for the loan");
        }else{
            System.out.println("Person is not eligible for the loan");
        }





2. Create a class called Loans, Given two variables salary and credit score,
use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */