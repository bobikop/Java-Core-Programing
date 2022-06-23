package day17_classAndObject;

public class Employee {

        public String name;
        public int age;
        public char gender;
        public String joTitle;
        public double salary;
        public String id;

        public void setInfo(String name, int age, char gender, String joTitle, double salary, String id) {  // right click generate then add , erase name and change it to void setInfo
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.joTitle = joTitle;
            this.salary = salary;
            this.id = id;


        }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", joTitle='" + joTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }


    public void work(){
        System.out.println(name + " is working");
    }

}
