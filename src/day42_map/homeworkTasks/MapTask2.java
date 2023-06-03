package day42_map.homeworkTasks;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTask2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        // 2.1 who has the maximum and minimum salary?
        int maxValue = Collections.max(map.values());
        int minValue = Collections.min(map.values());

        System.out.println("Max salary: " + maxValue + "\nMin salary: " +minValue);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //2.2 how many employees has the salary between 120k ~ 150K?

        int employeeCount = 0;

        for (Integer eachSalaryValue : map.values()) {
            if (eachSalaryValue >= 120000 && eachSalaryValue <= 150000){
                employeeCount++;
            }
        }
        System.out.println(employeeCount);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //2.3 display the names of the employees who are making less than 118k?

        for (String names : map.keySet()) {
            if (map.get(names) < 118000){
                System.out.println(names);
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //2.4 increase the salary employee by 10K if the current salary of employee is less than 120K

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() < 120000){
                map.replace(eachEntry.getKey(), eachEntry.getValue() + 10000);
            }
        }
        System.out.println(map);
    }
}
/*
2. Given following map that contains employee name and employee salary:
	 Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

    2.1 who has the maximum and minimum salary?

    2.2 how many employees has the salary between 120k ~ 150K?

    2.3 display the names of the employees who are making less than 118k?

    2.4 increase the salary employee by 10K if the current salary of employee is less than 120K
 */