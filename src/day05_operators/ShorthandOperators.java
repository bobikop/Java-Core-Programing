package day05_operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(a);
        a = 40;
        System.out.println(a);

        a = 90;
        System.out.println(a);

        System.out.println("------------------------------");

        double balance = 100;
        double eth = 4;


        balance += 1000;
        System.out.println(balance);// balance will be// signed with original value plus new deposit

        balance += 500;
        System.out.println("balance = " + balance);

        balance -= 800;
        System.out.println("balance = " + balance);

        balance -= 5000;
        System.out.println("balance = " + balance);

        System.out.println("----------------");

        double salary = 4500;

        salary *= 2;
        System.out.println("salary = " + salary);

        double doge = 0.00000123;
        doge *= 1000;
        System.out.println(doge);










    }
}
