package day13_customMethods2;

import java.util.Scanner;

public class cubeValue {
    public static void main(String[] args) {


        System.out.println(cube());



    }



    public static int cube(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int result = 0;
        result = n*n*n;
        return result;
    }
}
