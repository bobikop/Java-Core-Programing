package day07_IfStatements2;

public class WeekDays {
    public static void main(String[] args) {

        int num = 5;
        String dayName = "";

        if (num == 1) {
            dayName = "Monday";
        } else if (num == 2) {
            dayName = "Tuesday";
        } else if (num == 3) {
            dayName = "Wednesday";
        } else if (num == 4) {
            dayName = "Thursday";
        } else if (num == 5) {
            dayName = "Friday";
        } else if (num == 6) {
            dayName = "Saturday";
        } else if (num == 7){
            dayName = "Sunday";
        }else {
            System.out.println("Invalid Number");
        }

        System.out.println("dayName = " + dayName);


    }
}
