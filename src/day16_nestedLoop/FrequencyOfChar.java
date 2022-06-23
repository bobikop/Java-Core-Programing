package day16_nestedLoop;

public class FrequencyOfChar {

    public static void main(String[] args) {
        String str = "aabcccd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            int count = 0;
            char ch = str.charAt(j);  // here we define that for i-0, ch = 'a'

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }

            }
            if (!result.contains(ch + "")) {
                result += ch + "" + count; // char and int will give another number without ""

            }
        }
        System.out.println(result);
    }

}


/*
9. Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */