package day17_classAndObject;

public class TestEmployeeObjects {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.setInfo("John", 40, 'M', "Java Developer", 95000, "A12");


        Employee employee2 = new Employee();
        employee2.setInfo("Ermek", 25, 'M', "Java Developer", 105000, "A15");


        Employee employee3 = new Employee();
        employee3.setInfo("Adili", 36, 'M', "Java Developer", 115000, "A14");


        Employee employee4 = new Employee();
        employee4.setInfo("Evgenya", 40, 'F', "Java Developer", 95000, "A16");


        Employee employee5 = new Employee();
        employee5.setInfo("Ower", 45, 'M', "Java Developer", 98000, "A33");


        Employee employee6 = new Employee();
        employee6.setInfo("Hassan", 22, 'M', "Java Developer", 130000, "B67");


        employee5.name ="Lucy";

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee4);
        System.out.println(employee5);
        System.out.println(employee6);


        employee6.work();

    }
}
