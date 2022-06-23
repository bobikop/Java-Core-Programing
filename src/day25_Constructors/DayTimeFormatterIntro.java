package day25_Constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df =DateTimeFormatter.ofPattern("MMM - dd - yy");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022,7,1);

        System.out.println(date1.format(df));


        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm");

        LocalTime time1 = LocalTime.of(7,5);
        System.out.println(time1.format(tf));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(("MM/dd/y  hh:mm a")); // here we format tim eto the desired format
        LocalDateTime starts = LocalDateTime.now(); // here calling local date time which we want to format

        System.out.println(starts.format(dtf));


        DateTimeFormatter pt = DateTimeFormatter.ofPattern( "EEE, hh:mm a,  MMM/dd/y");
         LocalDateTime pastDate = LocalDateTime.of(2020,11,24,13,00);
         System.out.println(pastDate.format(pt));


    }
}
/*
1. use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
 */