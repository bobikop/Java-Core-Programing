package Self_PracticingReplitTasks.replit1;

public class CountingHi {
    public static void main(String[] args) {

        String sentence = "abc hi how";
        String temp = sentence.replace("hi", "a");
        int totalNumberOfJava = sentence.length() - temp.length();

        System.out.println(totalNumberOfJava);


    }
}
