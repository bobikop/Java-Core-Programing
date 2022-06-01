package day14_forLoop;

public class Combine {

    public static void main(String[] args) {

        System.out.println( combine("one", "eight"));
    }


    public static String combine(String word1, String word2){
        String combine = "";

        if (word1.lastIndexOf(word1.length() -1) == word2.indexOf(0)){
            combine = word1.substring(0, word1.length() -1) + word2;
        } else {
            combine = word1 + word2;
        }
        return combine;

    }



}
/*
Task1:
    Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

        combine("one", "eight")  ==> oneight
 */