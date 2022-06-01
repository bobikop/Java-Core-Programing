package day14_forLoop;

public class WarmupTasks2 {

    public static void main(String[] args) {

       String str3 = combain("julia", "eight");
        System.out.println("str3 = " + str3);

    }

    public static String combain(String str1, String str2){
        String result = "";

        if (str1.endsWith("" + str2.charAt(0)) ){
            result = str1 + str2.substring(1);
        }else{
            result = str1 +str2;
        }

        return result;
    }



}
/*

ask1:
    Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

        combine("one", "eight")  ==> oneight
 */