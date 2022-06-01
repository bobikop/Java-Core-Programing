package day07_IfStatements2;

import java.sql.SQLOutput;

public class IfStatementWitOutCurlyBraces {
    public static void main(String[] args) {

        int itemNum = 1;

        if (itemNum == 1){
            System.out.println("Eggs"); // without Curly braces only one code line will work
            System.out.println("Orange");
        }


        System.out.println("-------------------");

        int day = 2; // 1 -7

        if (day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 5) System.out.println("Saturday");
        else System.out.println("Sunday");

        }

    }

