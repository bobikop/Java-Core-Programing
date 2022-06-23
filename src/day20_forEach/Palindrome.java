package day20_forEach;

public class Palindrome {
    public static void main(String[] args) {

        String[] array = {"anna", "level", "Java"};
        int countOfPalindrome = 0;

        for (String each : array) {
            String temp = "";
            for(int i = each.length() - 1; i>=0; i--){
                temp += each.charAt(i);
            }
            if(each.equalsIgnoreCase(temp)){
                countOfPalindrome++;
            }

        }
        System.out.println(countOfPalindrome);
    }
}
/*
. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2


 */