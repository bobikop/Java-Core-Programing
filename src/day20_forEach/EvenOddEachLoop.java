package day20_forEach;

public class EvenOddEachLoop {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //           o     o     o     o     o       o       o       o
        int even = 0;
        int odd = 0;
        for (int each: num) {
            if(each % 2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("there is: " + even + " even and " + odd + " odd numbers.");
    }
}
/*
2.  Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */