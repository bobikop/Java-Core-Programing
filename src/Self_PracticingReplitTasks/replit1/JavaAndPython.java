package Self_PracticingReplitTasks.replit1;

public class JavaAndPython {
    public static void main(String[] args) {


        String sentence = "We study Java not python";

        String temp = sentence.replace("java", "abc");
        int totalNumberOfJava =  sentence.length() - temp.length();

       // System.out.println(totalNumberOfJava);

        String temp2 = sentence.replace("python", "aaaaa");
        int totalNumberOfPython = sentence.length() - temp2.length();

       // System.out.println(totalNumberOfPython);

        if (totalNumberOfJava == totalNumberOfPython ){
            System.out.println(true);
        }else{
            System.out.println("false");
        }

    }
}
