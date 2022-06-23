package Self_PracticingReplitTasks.replit1;

public class CountTriplets {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = ""; //a2b1c3d1

        String temp = str.replace("Java", "abc");
        int totalNumberOfJava = str.length() - temp.length();

        System.out.println(totalNumberOfJava);


    }
}
/*
Use a loop to count the number of triples in the given str.
A triple is when the same character appears three times in a row. So if there is a specific character that is repeated three times,
that will be counted as one triple. Print the total number of triples found in the String. The triples may overlap.
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements
 */