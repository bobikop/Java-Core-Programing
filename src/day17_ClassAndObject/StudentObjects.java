package day17_ClassAndObject;

public class StudentObjects {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.setInfo("John Petrucci", 'M', 28, "B92F", true);

        Student student2 = new Student();
        student2.setInfo("Elizabeth Wossen", 'F', 23, "B94D", true);

        Student student3 = new Student();
        student3.setInfo("Mike Portnoyr", 'M', 48, "DT200F", false);

        Student student4 = new Student();
        student4.setInfo("Eric Johnson", 'M', 40, "B9JU", true);


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);


        student2.passExam();
        student4.passExam();
    }
}
