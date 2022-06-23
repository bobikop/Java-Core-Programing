package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentGroup {

    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>(); // we can initialize arraylist here like new ArrayList<>();

    public StudentGroup(String groupName, int groupId) { // creates StudentsGroup object by setting the groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;
        // in order to be able to use ArrayList we need to create objects here
        //students = new ArrayList<>(); // default size 0 // or we can initialize Arraylist here
    }

    // here we will create add student method

    public void addStudent(Student student){
        students.add(student);
        }// takes one student object, and adds it to the arraylist of students

    public void addStudents(Student[] students){
        this.students.addAll(Arrays.asList(students));

    }// Takes one array of students, and adds the array of students to the arraylist of students
  // another way to add student is to overload this method above with original instance variables

    public void addStudent( String name, int age, char gender, String id){
       // Student student =  new Student(name, age, gender,id);
        students.add(new Student(name, age, gender,id));
    }// takes name, age, gender, id of student info, creates student object by using the given info, then adds the student object to the arraylist of students


    public void removeStudent(String id){
        students.removeIf(p-> p.id.equals(id));
    }// Takes one argument (id) and then remove the student object with the specified id form the ArrayList of student

    public String toString() {
        return "StudentGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() + // this is added manually
                '}';
    }
}
/*

2. Create a custom class named StudentsGroup
            Attributes:
                groupName
                groupId
                students (ArrayList<Students>)

            Add a constructor that can set the groupId and groupName
                    initialize students arraylist in the constrcutor's body

            Methods:
                addStudent(Student): adds the specified student to the students arrayList
                removeStudent(id): removes the student with the specified id from the students arraylist
                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */