package day18_garbageCollection;

public class HighestFrequency {
    public static void main(String[] args) {

        String text = "aaabbccccddeeee";
        int max = 0;
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    result = text.charAt(j) + "";
                }
                if (count >= max && !result.contains(text.charAt(i) + "")) {
                    result += text.charAt(j) + "";
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