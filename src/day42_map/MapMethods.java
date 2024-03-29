package day42_map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        //adding pairs form one map to another from map to employees
        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh"); // put method adding only one pair
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");


        Map<String, String> employees = new TreeMap<>();

        employees.putAll(map);// adding one map to another

        System.out.println(employees);

        System.out.println("----------------------------------------------------------");

        System.out.println(map == employees);  // not use to compare two maps

        System.out.println(map.equals(employees)); // use equals()
    }
}
