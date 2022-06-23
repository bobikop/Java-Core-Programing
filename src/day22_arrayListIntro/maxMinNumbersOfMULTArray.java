package day22_arrayListIntro;

public class maxMinNumbersOfMULTArray {
    public static void main(String[] args) {


        int[][] array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };


        int max = array[0][0];// here we set first array and first object as a max (we set us assumption that first element is max number)
        int min = array[0][0];
        
        for( int [] each1d : array){ // finding each one dimensional array from two dimension array
            for (int eachElement : each1d) {

                if (eachElement> max){ // this condition will check each element with set up max and compare. If is bigger then set max will assigned it o the max and become new max nuber
                    max = eachElement;
                }
                if (eachElement < min){
                    min = eachElement;
                }
            }
            
        }

        System.out.println("Maximum number is " + max);
        System.out.println("Maximum number is " + min);
    }
}
/*
2. Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
        Ex:
            array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

            output:
                Minimum number is: -200
                Maximum number is: 1000
 */