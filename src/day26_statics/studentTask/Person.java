package day26_statics.studentTask;

public class Person {
    public String name;
    public int age;
    public char gender;

    public static boolean isHuman;
    public  static  boolean hasNose;
    public static boolean hasWings;
    public static int numberOfHead;
    public static int numberOfEyes;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name + " eats " + food);
    }

    public void drink(String drink){
        System.out.println(name + " drink " + drink);
    }

    public void sleep(){
        System.out.println(name + " sleep just 3 hours per day! ");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
3. Person Task:
    1. Create a class named Person:

        Attributes:
          instance: name, age, gender

          static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

        Add a constructor that can set All the fields (instances)


        Actions:
          eat(String food)
          drink(String drink)
          sleep()
          toString()

 */