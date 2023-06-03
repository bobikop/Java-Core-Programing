package day25_constructors;

public class SalaryCalculatorObject {

    public static void main(String[] args) {
        SalaryCalculator storeManager = new SalaryCalculator(27, 45, 7, 4);
        System.out.println(storeManager);
        SalaryCalculator teamLeader = new SalaryCalculator(24, 40, 7, 3.75);
        System.out.println(teamLeader);
    }
}
