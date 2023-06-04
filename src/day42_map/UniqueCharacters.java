package day42_map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {


        String str = "aabcccdeeeef";
        Map<Character,Integer> map = new LinkedHashMap<>();

        // charArray can not be converted to Collections so in that case we can't use frequency method and we will need another for loop instead
        for (String each : str.split("")){
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            // before adding character to map we will check here if is frequency == to 1;
            if (frequency == 1)
                map.put(each.charAt(0), frequency);

        }
        System.out.println(map);
    }
}
/*
2. Write a program that can find the unique characters from a String
              Not: MUST use map
            Ex:
                    str = "aabcccdeeeef";

            output:
                    {b=1, d=1, f=1}

 */