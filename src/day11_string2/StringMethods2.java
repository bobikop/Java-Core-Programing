package day11_string2;

public class StringMethods2 {
    public static void main(String[] args) {
        String sentence = "I love Python, Python is the best programing language,a nd Python is in high demand";

        sentence = sentence.replace("Python", "Java"); // if is not assigned to the new string and create new object will not make any changes
        System.out.println(sentence);

        //---------------------------------------------------------

        String word = "Java";
        String me = "";
        me = word.replace('a', 'e');


        // word = word.replace('a', 'e'); thi sis same as declaring bew string


        System.out.println(me);

        String sentence3 = "Java is fun, Java is cool, Java is amazing";
        sentence3= sentence3.replaceFirst(", Java", ", Python");

        System.out.println(sentence3);

       // /---------------------------------------

        String sentence5 = "Today is Sunday, Tomorrow is MOnday";
        String today = sentence5.substring(9, 14 +1);
        System.out.println(today);

        //-----------------------------------------

        String email = "Cydeo.School@gmail.com";
        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println(domain);

        //-----------------------------------------


        String sentences6 = "I love java programing";

        String r1 = sentences6.substring(7);

        System.out.println(r1);

        //-------------------------------------------

        String sentence7 = "Today is Sunday, Tomorrow is Monday"; // this is how to get last word out form the sentence
        String tomorrow = sentence7.substring(sentence7.lastIndexOf(" ") + 1);

        System.out.println(tomorrow);

        //------------------------------------------------

        String str =  "Python";
        String result = str + "\n".repeat(10);
        System.out.println(result); ///not working ?





    }
}
