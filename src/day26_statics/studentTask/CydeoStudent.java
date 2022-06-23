package day26_statics.studentTask;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public String id;
    public int grade;
    public String batchNumber;
    public int groupNumber;

    public static String schoolName = "Cydeo school";
    public static String magicWord = "Java";

    public CydeoStudent(String name, int age, char gender, String id, int grade, String batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    public void study(){
        System.out.println(name + " is studying");
    }
    public void attendClass(){
        System.out.println(name + " with id number" + id + " in batch" + batchNumber + " is attend the Class.");
    }

    public static void printSchoolName(){
        System.out.println("School name " + schoolName);
    }
    public static void printProgramingLanguage(){
        System.out.println("Programing language " + magicWord);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                ", School name=" + schoolName +
                ", programing language=" + magicWord +
                '}';
    }
}
/*
1. Create a class named CydeoStudent:

        Attributes:
          instances: name, age, gender, id, grade, batchNumber, groupNumber
          statics: schoolName, magicWord

        Add a constructor that can set All the fields (instances)

        Actions:
          study()
          attendClass()
          printSchoolName(): displays the school name
          printProgLanguage(): displays the name of programming language
          toString()
 */