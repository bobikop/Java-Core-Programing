package day06_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {
        int number = 4;
        boolean has28Days = number == 2;
        boolean has30days = number == 4 || number == 6 || number == 9 || number == 11;
        boolean has31days = !has28Days && !has30days;
        String daysNumber = "";

        if (has28Days) {
            daysNumber = " 28 days";
        }
        if (has30days) {
            daysNumber = " 30 days";
        }
        if (has31days) {
            daysNumber = " 31 days";
        }
        System.out.println(daysNumber);

    }
}
/*
 public static void main(String[] args) {
        int num= 1; // this number tell us name of the month; for example number 1 is January,
        boolean has28Days = num == 2;
        boolean has30Days = num == 4 && num == 6 && num == 9 && num == 11;
        boolean has31Days = !has28Days && !has30Days;

        String result = "";
 */