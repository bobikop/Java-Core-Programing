package Self_PracticingAprilMay;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int number = 60555;
        int sum = 0;

        int n1 = (number % 100000) / 10000;
        int n2 = (number % 10000) / 1000;
        int n3 = (number % 1000) / 100;
        int n4 = (number % 100) / 10;
        int n5 = (number % 10) / 1;
        sum = n1 + n2 + n3 +n4 +n5;

        System.out.println(sum);
    }
}
/*
int n1 = (number % 100000) / 10000;
        int n2 = (number % 10000) / 1000;
        int n3 = (number % 1000) / 100;
        int n4 = (number % 100) / 10;
        int n5 = (number % 10) / 1;
        sum = n1 + n2 + n3 +n4 +n5;
 */