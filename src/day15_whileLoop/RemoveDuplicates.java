package day15_whileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbcccc";
        String result = ""; // this variable will contain new abc value

        for (int i = 0; i < str.length(); i++) {  //  i : represent a numbers of str
            char each = str.charAt(i); // each character of the string if
            if (!result.contains(""+ each) ){ // if the string result does not contain the character of the string str yet
                result += each; // then will add the character to string result
            }

        }



       // System.out.println(str.charAt(i));


    }
}
/*
3. Write a program that can remove the duplicated characters from the a string

                Ex:
                    str = "aabbbcccc"

                    output:
                        abc

 */