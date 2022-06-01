package day16_nestedLoop;

public class CatAndDog {

    public static void main(String[] args) {


        String str = "I love cat and cat and dog dog";
        int cats = 0;
        int dogs = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            str = str.toLowerCase();//keep <= to cover their case, when word goes last
            if (str.substring(i, (i + 3)).contains("cat")) {
                cats += 1;
            }else if (str.substring(i, (i + 3)).contains("dog")) {
                dogs += 1; //could use equals
            }
        }
        boolean catsDogs=cats==dogs;
        System.out.println(catsDogs);
    }
}
/*
2. write a program to print true if the string "cat" and "dog" appear the
same number of times in the given sentence
            Ex:
                sentence = "caT dog dogG cAt"

                output:
                    true
 */