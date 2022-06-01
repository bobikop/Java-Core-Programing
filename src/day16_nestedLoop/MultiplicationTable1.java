package day16_nestedLoop;

import java.util.Scanner;

public class MultiplicationTable1 {

    public static void main(String args[]){

        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                System.out.print(i*j+"\t\t");
            }
            System.out.println();
        }

    }
}
