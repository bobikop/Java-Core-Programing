package day13_customMethods2;

public class ReturnMethodIntro {


    public static void main(String[] args) {

       int total = addition(10,20);
        System.out.println(cube(5));



    }

    public static int addition(int n1, int n2){

        //int result = n1 +n2;//sum is new information and can't be used back if we have void method. If we want to use it we need return method
       // return result;
        return n1 + n2;

    }



       public static int squareOfNumber(int n1){
        int squareOfNumber = n1 * n1;
        return squareOfNumber;

       }


public static int cube(int n1){

        int cube = n1 *n1 * n1;
        return cube;
}






















}
