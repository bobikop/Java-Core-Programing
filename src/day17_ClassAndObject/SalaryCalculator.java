package day17_ClassAndObject;

public class SalaryCalculator {


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

    public double salary(double hourlyRate, double weeklyHours){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(double stateTaxRate){
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
                "salary=" + salary(hourlyRate,weeklyHours) +
                ", stateTax=" + stateTax(stateTaxRate) +
                ", federalTax=" + federalTax(federalTaxRate) +
                ", salaryAfterTax=" + salaryAfterTax () +
                '}';
    }
}


/*
4. Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percenrage, you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): claculates the totalstateTax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
                it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */