package day27_accessModifiers.tasks;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public String batchNumber, groupNumber, fieldOfStudy;

    public static String schoolName, programmingLanguage, secretCode;

    public CydeoStudent(char gender, int age, String batchNumber, String groupNumber, String fieldOfStudy) {
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName = "Cydeo School";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName() {
        System.out.println("School name is: " + schoolName);
    }

    public static void printSecretCode() {
        System.out.println("Secret code is: " + secretCode);
    }

    public void attendClass(){
        System.out.println("Student " + name + " attend to class");
    }

    public void study(){
        System.out.println("Student " + name + " is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
/*
2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()

 */