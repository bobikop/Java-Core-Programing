package day42_map.homeworkTasks;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTask4 {
    public static void main(String[] args) {

        String[] group1 = {"Boban","Milan", "Sam", "Manuela"};
        String[] group2 = {"Emma", "Bella", "Mark", "Max"};
        String[] group3 = {"Josh", "George", "Liza", "Suzan"};
        String[] group4 = {"Andy", "Maria", "Anthony", "James"};
        String[] group5 = {"Cory", "Conor", "Steven", "Jimmy"};

        // 4.1 Create a map that contains group id and names of group members
        //	            Map<Integer, String[]> groups = new LinkedHashMap();
        //	            add all the group 1d and group members into the map named groups


        Map<Integer,String[]> groups = new LinkedHashMap<>();

        groups.put(1,group1);
        groups.put(2, group2);
        groups.put(3, group3);
        groups.put(4, group4);
        groups.put(5, group5);

        // 4.2 Display the names of each student with group id of 1

        System.out.println(Arrays.toString(groups.get(1)));

        System.out.println("-------------------------------------------------------------------------------------------");

        //  4.3 Display the names of each student from each groups

        for (Map.Entry<Integer, String[]> eachEntry : groups.entrySet()) {
            System.out.println(eachEntry.getKey() + " : " + Arrays.toString(eachEntry.getValue()));
        }




    }

}
/*

4. Given the following arrays that contains the names of the students from each group:
	        String[] group1 = {};
	        String[] group2 = {};
	        String[] group3 = {};
	        String[] group4 = {};
	        String[] group5 = {};

	    4.1 Create a map that contains group id and names of group members
	            Map<Integer, String[]> groups = new LinkedHashMap();
	            add all the group 1d and group members into the map named groups

	    4.2 Display the names of each student with group id of 1

	    4.3 Display the names of each student from each groups

*/

