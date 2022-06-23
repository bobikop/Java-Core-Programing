package day17_classAndObject;

public class UniqueCharacters1 {

    public static void main(String[] args) {


        String str = "bbddeeaffgi";

        String unique = "";


        for (int i = 0; i < str.length() ; i++) { // i: index number of str
            char each = str.charAt(i);

            if (str.indexOf(each)  == str.lastIndexOf(each)){
                unique += each;
            }
        }


        System.out.println(unique);









    }
}
