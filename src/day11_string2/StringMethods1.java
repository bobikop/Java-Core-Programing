package day11_string2;

import java.util.Locale;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "JAVA PROGRAMING";

        str1 = str1.toLowerCase();       // java programing (but if we assigned it thenwe can get printed with lower cases

        System.out.println(str1);

        //---------------------------------------


        String str2 = "java programing";
        str2 = str2.toUpperCase();

        System.out.println(str2);

        //---------------------------------------

        String word = "Wooden Spoon";

        word = word.toUpperCase(); //  new object is created "WOODEN SPOON"

        word = word.toLowerCase();// will give us new string " wooden spoon"

        System.out.println(word);

        //--------------------------------------------


        String str4 = "             Sydeo School";

       str4 =  str4.trim();

        System.out.println(str4);


        //------------------------------------------------------

        String sentence1 = "Today is Sunday, and we have Java Class";
        int index1 = sentence1.indexOf('w');

        System.out.println(index1);

        String s1 = "I Love Java Programing";

       int firstA =  s1.indexOf('a');

        System.out.println(firstA);

        int secondA = s1.indexOf("a ");

        String s2 = "Java Python JavaScript Sydeo Python ";
        int a1 = s2.indexOf('a');
        System.out.println(a1);
        int a2 = s2.indexOf("a ");
        System.out.println(a2);


        String w = "Java";

        System.out.println('a');
        System.out.println(w.indexOf('a'));
        System.out.println(w.lastIndexOf("a"));





    }
}
