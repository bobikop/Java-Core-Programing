package day16_nestedLoop;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "java JAVA jAvA JAva";
        String word = "Java";

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int count = 0;

        while(sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst(word, ""); //
        }


        System.out.println(count);

    }
}
/*

 Write a program that can return the frequency of the word java from a sentence
    Ex:
        sentence = "My favorite programming language is Java, I love jAva, JAVA is so cool"

    output:
        3
 */