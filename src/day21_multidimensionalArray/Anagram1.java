package day21_multidimensionalArray;

public class Anagram1 {
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";

        boolean isAnagram = false;

        for (int i = 0; i < str1.length(); i++) {

            if (!(str1.length() == str2.length())) {
                break;
            }

            if (str2.contains(str1.charAt(i) + "")) {
                isAnagram = true;
            }
        }

        System.out.println(isAnagram);

    }
}
/*
2. Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
                str2 = "earth"

            output:
                true

                str1 = "java"
                str2 = "python"
            output:
                false
 */