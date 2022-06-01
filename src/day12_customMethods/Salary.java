package day12_customMethods;

public class Salary {
    public static void main(String[] args) {
        salary(75, 40);

    }

    public static void salary(double hourlyRate, int weeklyHours){

        double grossIncome = (weeklyHours * hourlyRate) * 52;
        System.out.println("You make $ " + hourlyRate + " per hour");
        System.out.println("You work " + weeklyHours + " in a week");
        System.out.println("You gross income is " + grossIncome);
    }



}
