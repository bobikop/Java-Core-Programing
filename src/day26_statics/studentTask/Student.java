package day26_statics.studentTask;

public class Student {

    // firs we create instance variables
    public String name;
    public int age;
    public  char gender; // if is for example different d=from student to student then we crated as instance
    public String id;

    public Student(String name, int age, char gender, String id) { //constructor will be executed only when we created objects
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public void study(){
        System.out.println(name + "is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                '}';
    }



}
















/*


1. Create a custom class named Student
            Attributes:
                name, age, gender, id

            Add a constructor that can set all the fields

            Methods:
                study()
                toString()



3. Create a class named TestObjects
            3.1 Create 5 Student objects
            3.2 Create a StudentGroup object
            3.3 Add all the student objets to the StudentsGroup object' students list

 */