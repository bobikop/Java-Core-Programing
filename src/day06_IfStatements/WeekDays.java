package day06_IfStatements;

public class WeekDays {
    public static void main(String[] args) {

        int number = 4;
        String dayName = "";
        if (number == 1){
            dayName = "Monday";
        }
        if (number == 2){
            dayName = "Tuesday";
        }
        if (number == 3){
            dayName = "Wednesday";
        }
        if (number == 4){
            dayName = "Thursday" ;
        }
        if (number == 5){
            dayName = "Friday";
        }
        if (number == 6){
            dayName = "Saturday";
        }
        if (number == 7){
            dayName = "Sunday";
        }
        System.out.println(dayName);

    }
}
