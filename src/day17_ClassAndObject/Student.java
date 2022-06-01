package day17_ClassAndObject;

public class Student {

    public String name;
    public char gender;
    public int age;
    public String studentID;
    public boolean isFullTime;

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID='" + studentID + '\'' +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void setInfo(String name, char gender, int age, String studentID, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentID = studentID;
        this.isFullTime = isFullTime;



    }

    public void passExam(){
        System.out.println(name + " Passed exam");

    }


}










/*
2. Create a custom class named Student
        Attributes:
            name, gender, age, studentId, grade, isFullTime

        Actions:
            setInfo(): sets all the fields of the student object
            toString(): when a car object is passed in print statement,
                    it should display all the information of the student object
            study()
 */