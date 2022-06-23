package day18_garbageCollection;

public class HighestFrequency1 {
    public static void main(String[] args) {


        String str = "aacccddd";
        int maximumRepeat = 0;
        String result = ""; // result here empty string

        for (int i = 0; i < str.length(); i++) {
            int counting = 0;  // starting for i:0 first char in the string

            for (int j = 0; j < str.length(); j++) { // j:0
                if (str.charAt(i) == str.charAt(j)) {//after find first match we are counting
                    counting++;
                }
                if (counting > maximumRepeat) {// here we know that we have one a
                    maximumRepeat = counting;// counting > then 0. maxRepeating is 0 on start
                    result = str.charAt(i) + ""; // since j match i  is our first match and become result, we can put eather i or j to result
                }
                if (counting >= maximumRepeat && !result.contains(str.charAt(i) + "")) {// this if statement is to ony to check if there is another character with same frequency
                    result += str.charAt(j) + "";
                }

            }
        }


        System.out.println(result);
    }
}
/*
1. Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e

 */