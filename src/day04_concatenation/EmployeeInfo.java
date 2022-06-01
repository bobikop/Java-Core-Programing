package day04_concatenation;

public class EmployeeInfo {
    public static void main(String[] args) {
        String name = "Daniel";
        int age = 28;
        String gender = "Male";
        String company_name = "Google Inc";
        String jobTitle = "Software Developer";
        int salary = 90000;
        System.out.println(name + " is " + age + " years old, " + "gender is " + gender + ".");
        System.out.println(name + " works at " + company_name + " as a " + jobTitle + ".");
        System.out.println(name + " makes $" + salary + " per year.");
    }
}
