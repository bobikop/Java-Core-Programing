package day29_inheritance.homeWorTasks.employee;

public class TestEmployeeObjects {
    public static void main(String[] args) {


        Tester tester = new Tester();
        tester.setInfo("Manuela", "Aoj", "Java Tester", 'F', 37,95000);
        tester.testing();
        tester.getAge();
        System.out.println(tester);


    }
}
