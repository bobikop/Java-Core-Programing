package Self_PracticingAprilMay;

public class PrintingVowels {
    public static void main(String[] args) {



        String str = new String("Hi Welcome to my world!");
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){

                System.out.print(str.charAt(i));
            }


        }
    }


}

