package day28_encapsulation;

public class TestStudent {

    public static void main(String[] args) {

        Student student = new Student();

        //student.age = -200;

        student.setAge(28); // with set method we set(write) the year

        System.out.println(student.getAge());// with get Method we can read the data

        System.out.println("Test Completed");


        student.setName("Aaron");
        System.out.println(student.getName());

    }
}
