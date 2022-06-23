package MostImportant;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "xyzxyzxyz";
        // remove all duplicate characters from the given string and assigned to new string result.

        String result = "";
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                //result.indexOf(each) < 0
                if(!result.contains(""+each)) { //before adding the character to the new string we check if the character is not included in the string
                    result += each;
                }

            }

            System.out.println(result);

        }

    }

