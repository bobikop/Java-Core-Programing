package day03_variables;

public class PrimitiveDataTypesIntro2 {
    public static void main(String[] args) {
        // DataType variableName = Data

        char a = 'a';
        char b = 'b';
        // char ab = 'ab';

        System.out.println("a");
        System.out.println(b);

        System.out.println("-------------------");

        char ch1 = 'A';
        char ch2 = 65;
        System.out.println(ch1);
        System.out.println(ch2);
        char ch3 = 777;
        System.out.println(ch3);
        System.out.println("--------------");

        int sum = 'A' + 'B';
        // 65+66
        System.out.println(sum);

        boolean r1 = a>b;
        // boolean r2 = 123; not possible
        // boolean r3 = 2.5;
        // boolean r4 = "java";

        boolean r5 = true;
        boolean r6 = false;
        boolean r7 = 100>10;
        boolean r8 = 0<1;
        System.out.println(r7);


    }
}
