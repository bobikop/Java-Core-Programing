package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 25;
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(--a);

        System.out.println(a++);
        System.out.println(a++);
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(a--);

        int c = 40;
        System.out.println(c++);
        System.out.println(c);
        System.out.println(c);

        System.out.println("---------------------------");

        int n = 30;
        int m = n++;

        System.out.println(n); //m = 30, then 31
        System.out.println("m = " + m);
        System.out.println("n = " + n);



    }
}
