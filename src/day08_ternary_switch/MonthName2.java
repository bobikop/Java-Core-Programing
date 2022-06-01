package day08_ternary_switch;

public class MonthName2 {
    public static void main(String[] args) {

        int num = 8;
        String monthName = "October";

        String montName = (num == 1) ? "January" : (num == 2) ? "February" : (num == 3) ? "March" : (num == 4) ? "April"
                : (num == 5) ? "may" : (num == 6) ? "Jun" : (num == 7) ? "July" : (num == 8) ? "August" : (num == 9) ? "September"
                : (num == 10) ? "October" : (num == 11) ? "November" : (num == 12) ? " December" : "No such a Month";
        System.out.println("montName = " + montName);

    }
}
