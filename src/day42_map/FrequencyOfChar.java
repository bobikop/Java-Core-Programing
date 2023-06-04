package day42_map;

import java.util.*;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str = "bbcccaaaa";

        Map<Character,Integer> map = new LinkedHashMap<>();


       for (String each : str.split("")){
           //string array can be converted to the list
           int frequency = Collections.frequency(Arrays.asList(str.split("")) , each);
           map.put(each.charAt(0), frequency);
       }

        System.out.println(map);



       //-----------------------------------------------------
/*

        // Second option

        String str1 = "bbcccaaaa";
        Map<String, Integer> map1 = new LinkedHashMap<>();

        for (String each1 : str1.split("")){
            int frequency1 = Collections.frequency(Arrays.asList(str1.split("")), each1);
            map1.put(each1, frequency1);


        }

        System.out.println(map1);
*/

    }

}
/*
1. Write a program that can return the frequency of characters
            Not: MUST use map

                Ex: str = "bbcccaaaaa"

                output:
                    {b=2, c=3, a=5}
 */