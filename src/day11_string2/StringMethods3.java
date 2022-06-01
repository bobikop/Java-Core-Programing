package day11_string2;

public class StringMethods3 {
    public static void main(String[] args) {

        String word = "Wooden Spoon";

       boolean r1 =  word.isEmpty();
        System.out.println(r1); // empty method return true only when there is no characters

        //-------------------------------------------------------------------

        String str = "               ";

        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();
        System.out.println(r3);

        //**********************************************************************

        String str1 = "Cydeo";

        String str2 = "Cydeo";

        System.out.println(str1 == str2);  // not correct, do not use ==
        System.out.println(str1.equals(str2));

        String str3 = "cydeo";

        System.out.println(str2.equals(str3)); /// return false since on of them is start with upper case

        //-------------------------------------------------------

        String s1 = "Java";
        String s2 = "java";

        System.out.println(s1.equalsIgnoreCase(s2));  // this ignore case difference lower and upper as they are same letters


        //**************************************************************************************************

        String students = "Hasan Naran Sumeye Nataliia";

        boolean hasAhmad = students.contains("Ahmad");
        System.out.println(hasAhmad);


        String sentence = "My favorite programing language is JAVA";
        boolean hasJava = sentence.toLowerCase().contains("java");
        System.out.println(hasJava);

        //----------------------------------

        String name = "Michael";
        boolean l = name.startsWith("D");

        System.out.println(l);

        String url = "www.cydeo.com";
        boolean isValid = url.startsWith("www ");
        System.out.println(isValid);


        boolean t = url.endsWith(".com");
        System.out.println(t);

        // ---------------------------------------
        String email = "CydeoSchool@gmail.com";
        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");











    }
}
