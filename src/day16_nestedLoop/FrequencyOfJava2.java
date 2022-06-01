package day16_nestedLoop;

public class FrequencyOfJava2 {
    public static void main(String[] args) {


        String str = "My favorite programming language is Java, I love jAva, JAVA is so cool Java";
        int result = 0;//the length should be <=,wont count otherwise, if the word comes last,
        for (int i = 0; i <= str.length() - 4; i++) {// we have to subtract the length of the required word
            str = str.toLowerCase();//make all ignore case sensitivity
            if (str.substring(i, (i + 4)).contains("java")) {
                result += 1;
            }
        }
        System.out.println(result);
    }

}
