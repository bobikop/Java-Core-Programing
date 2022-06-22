package day19_Array;

import java.util.Arrays;

public class Classmates {
    public static void main(String[] args) {
        String[] classmates = new String[10];

        classmates[0] = "Ermek Apazov";
        classmates[1] = "Aseel Hussein";
        classmates[2] = "Adil Kuerxiati";
        classmates[3] = "Hasan Ayhan";
        classmates[4] = "Dilibaier Tayier";
        classmates[5] = "Igor Pojar";
        classmates[6] = "Evgeniya Novgorodova";
        classmates[7] = "Bilal Ghani";
        classmates[8] = "Baturay Gok";
        classmates[9] = "Violetta Queen";

        for (int i = 0; i < classmates.length ; i++){
            classmates[i] = classmates[i].charAt(0) + classmates[i].substring(classmates[i].indexOf(" ") + 1
            ,classmates[i].indexOf(" ") + 2);
        }

        System.out.print(Arrays.toString(classmates));
        System.out.println();
    }

}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */