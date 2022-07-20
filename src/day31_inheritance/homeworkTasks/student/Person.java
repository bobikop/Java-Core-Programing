package day31_inheritance.homeworkTasks.student;

public class Person {


    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        boolean haveSpecialChar = false;
        for (int i = 0; i < name.length(); i++) {
            if(!Character.isLetterOrDigit(name.charAt(i)) && name.charAt(i) != ' '){
                haveSpecialChar = true;
            }
        }

        if (name == null || name.isEmpty() || haveSpecialChar){
            System.err.println("Invalid name input: " + name);
            System.exit(1);
        }

        this.name = name;
    }

    //another solution for setName
    /*
    javapublic void setName(String name) {
       String tempName= name.replace(" ","").trim();
        char[] characters = tempName.toCharArray();
        for (char each : characters) {
            if(!Character.isLetterOrDigit(each)){
                System.err.println("name should not contain any special character other than space: "+each);
                System.exit(1);
            }
        }
        this.name = name;
    }
     */





    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <=0){
            System.err.println("Invalid input! Age can not be negative number!");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'F' || gender == 'M')) {
            System.err.println("invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*

Student Task:
    1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor that can set all the fields

                    Condition:
                        1. name should not be set to null
                        2. name should not be empty
                        3. name should not contain any special character other than space
                        4. age should not be set to negative
                        5. gender must be valid

            Methods:
                eat()
                drink()
                sleep()
                toString()
 */