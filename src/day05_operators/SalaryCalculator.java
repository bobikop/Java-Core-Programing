package day05_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6;
        double federalTaxRate = 26;

        int salaryBeforeTax = weeklyHours * hourlyRate * 52;
        double stateTax = (salaryBeforeTax * stateTaxRate) / 100;
        double federalTax = (salaryBeforeTax * federalTaxRate) / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);


    }
}
