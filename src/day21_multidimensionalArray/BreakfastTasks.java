package day21_multidimensionalArray;

public class BreakfastTasks {

    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";

        while (str.contains("  ")) {
            str = str.trim().replace("  ", " ");
        }

        System.out.println(str);


    }

}
/*
1. Write a program 0that can remove all the extra space from string
            Ex:
                str = "  Hello w0orld      I      love      Java    "

            Output:
                Hello world I love Java

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


