package day25_Constructors;

public class SalaryCalculator {
    public int hourlyRate;
    public int weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;
    public SalaryCalculator(int hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }
    public double salary(){
        double salary= hourlyRate*weeklyHours*52;
        return salary;
    }
    public double stateTax(){
        double stateTax= salary()*stateTaxRate/100;
        return stateTax;
    }
    public double federalTax(){
        double federalTax= salary()*federalTaxRate/100;
        return federalTax;
    }
    public double salaryAfterTax(){
        double totalTax= federalTax()+stateTax();
        double salaryAfterTax= salary()-totalTax;
        return salaryAfterTax;
    }    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate= $" + hourlyRate +
                ", weeklyHours= $" + weeklyHours +
                ", stateTaxRate= $" + stateTaxRate +
                ", salary= $" + salary() +
                ", federal tax = $" + federalTax() +
                ", state tax= $" + stateTax()+
                ", salary after tax = $" + salaryAfterTax() +
                '}';
    }



}
/*

Task02:
    Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): claculates the totalstateTax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */