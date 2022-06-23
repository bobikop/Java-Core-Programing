package day26_statics.studentTask;

public class TestCydeoStudentObject {
    public static void main(String[] args) {

        CydeoStudent student = new CydeoStudent("Boban", 40, 'M', " B82",01, "B1",7);

        CydeoStudent student1 = new CydeoStudent("Manuela", 37, 'F'," M84",01, "B40", 5);
        System.out.println("student = " + student);

        student.study();
        student.attendClass(); // creating new object from constructor calling that new object here
        CydeoStudent.printSchoolName(); // from class name call for all students static variable
        CydeoStudent.printProgramingLanguage();// from class name call for all students static variable


    }
}
