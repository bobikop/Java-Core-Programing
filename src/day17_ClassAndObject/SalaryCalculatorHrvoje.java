package day17_ClassAndObject;

public class SalaryCalculatorHrvoje {


    public double hourlyRate;
    public double weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;

    public void setInfo(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(double hourlyRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;

        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(double stateTaxRate) {
        this.stateTaxRate = stateTaxRate;

        return salary(hourlyRate, weeklyHours) * stateTaxRate/100;
    }

    public double federalTax(double federalTaxRate) {
        this.federalTaxRate = federalTaxRate;

        return salary(hourlyRate, weeklyHours) * federalTaxRate/100;
    }

    public double salaryAfterTax (){

        return salary(hourlyRate,weeklyHours) - federalTax(federalTaxRate) - stateTax(stateTaxRate);
    }


    public String toString() {
        return "SalaryCalculator{" +
                ", salary = " + salary(hourlyRate, weeklyHours) +
                ", stateTax = " + stateTax(stateTaxRate) +
                ", federalTax = " + federalTax(federalTaxRate) +
                ", salaryAfterTax = " +  salaryAfterTax() +
                '}';
    }








}
