package day17_ClassAndObject;

public class UniqueCharacters2 {
    public static void main(String[] args) {
        // Thi is very important to understand and know
        // This approach will find unique characters for any possible case (without first and last index)

        String str = "aabcccd";

        String unique = "";

        for (int j = 0; j < str.length(); j++) {


            // find how many times first character appear in string then check if is = to 0!

            char ch = str.charAt(j); // inner loop here was 0 now we change it to j
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) { // check how many times the ch has appeared in str
                if (str.charAt(i) == ch) { // whenever is this true character appear in the string
                    frequency++; // increase the frequency by 1

                }
            }

            if (frequency == 1) {  // if appear one time ch is unique
                unique += ch;
            }

        }

        System.out.println(unique);

    }
}
