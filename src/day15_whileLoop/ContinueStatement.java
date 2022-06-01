package day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            if(i ==2){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("---------------------------------------------");
        // bellow code to print odd numbers only from 10 to 21
        for (int i =10; i<21; i++){

            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-----------------------------------------");


        for (char i = 'A'; i <= 'G'; i++) {

            if (i =='B')
                continue;
            if (i == 'E')
                continue;
            System.out.println(i);
        }


        System.out.println("------------------------------------" );

        // find tge sum of the all even numbers between 50~100

        for (int i = 50; i < 101; i++) {
            if (i %2 ==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // 50,52, 54,56 ......100
        for (int i = 50; i < 101 ; i+=2) {
            System.out.print(i + " ");

        }

        System.out.println();
        for (int i = 50; i < 101; i++) {
            if (i % 2 !=0){ // if the i's is odd number
                continue;// skip it
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
