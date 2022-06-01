package day06_IfStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {
        double grossSalary = 95000;
        double netSalary = 0;
        boolean married = true;

        if (grossSalary >= 13000 && !married) {
            netSalary = grossSalary - (grossSalary * 35 / 100);
        }

        if (grossSalary >= 130000 && married) {
            netSalary = grossSalary - (grossSalary * 30 / 100);
        }
        if (grossSalary >= 100000 && grossSalary < 130000 && !married) {
            netSalary = grossSalary - (grossSalary * 30 / 100);
        }
        if (grossSalary >= 100000 && grossSalary < 130000 && married) {
            netSalary = grossSalary - (grossSalary * 25 / 100);
        }
        if (grossSalary >= 80000 && grossSalary < 100000 && !married) {
            netSalary = grossSalary - (grossSalary * 25 / 100);
        }
        if (grossSalary >= 80000 && grossSalary < 10000 && married) {
            netSalary = grossSalary - (grossSalary * 20 / 100);
        }
        if (grossSalary < 80000 && !married) {
            netSalary = grossSalary - (grossSalary * 20 / 100);
        }
        if (grossSalary < 79000 && married) {
            netSalary = grossSalary - (grossSalary * 15 / 100);
        }


        System.out.println(netSalary);


    }
}


/*
4. Create a class named NetIncomeCalc,
Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */