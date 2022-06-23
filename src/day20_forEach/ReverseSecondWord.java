package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String str = "I love Java";
        String [] words = str.split(" ");
        String reverse = "";
        for(int i = words[1].length() - 1; i >= 0; i--){
            reverse += words[1].charAt(i);
        }
        System.out.println(words[0]  + " " + reverse + " " + words[2]);
    }

}

/*
1. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java


 String str = "I love Java";
        String [] words = str.split(" ");
        String reverse = "";
        for(int i = words[1].length() - 1; i >= 0; i--){
            reverse += words[1].charAt(i);
        }
        System.out.println(words[0]  + " " + reverse + " " + words[2]);

 */