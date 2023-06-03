package day42_map.homeworkTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTask1 {
    public static void main(String[] args) {

        Map<String, int[]> student = new LinkedHashMap<>();
        int[] scoreMichael = {85,96,87,96,88};
        int[] scoreAlex = {84,96,67,68,88};
        int[] scoreEmina = {85,96,99,58,78};
        int[] scoreVioleta = {65,96,97,94,84};
        int[] scoreJessy = {81,95,87,56,83};


        student.put("Michael", scoreMichael);
        student.put("Alex", scoreAlex);
        student.put("Emina", scoreEmina);
        student.put("Violeta" , scoreVioleta);
        student.put("Jessy", scoreJessy);

/*
        for (String eachKey : student.keySet()) {
            System.out.println(eachKey);
        }

        System.out.println(student);
        System.out.println("-----------------------------");

        for (int[] eachValue : student.values()) {
            System.out.println(eachValue);
        }
*/


        for (Map.Entry<String, int[]> eachEntry : student.entrySet()) {
            System.out.println(eachEntry.getKey() + " : " + Arrays.toString(eachEntry.getValue()));
        }


    }
}
/*
1. Create a map that can contain the student name (String) and student scores (int[]) as a pair
(Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 paris into the map
		1.2 Write a program that can display each student name and scores
 */