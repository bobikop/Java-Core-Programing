package day27_accessModifiers.tasks;

public class Dog {
    public String breed, size, color;
    public char gender;
    public int age;
    public boolean isFriendly;
    public static int numberOfLegs, numberOfEyes, numberOfWings;

    public Dog(String breed, String size, String color, char gender, int age, boolean isFriendly) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.isFriendly = isFriendly;
    }
    static {
        numberOfLegs = 4;
        numberOfEyes = 2;
        numberOfWings = 0;
    }
    public void eat() {
        System.out.println("The dog is eating");
    }
    public void drink() {
        System.out.println("The dog is drinking");
    }
    public void sleep() {
        System.out.println("The dog is sleeping");
    }
    public void play() {
        System.out.println("The dog is playing");
    }
    public void bark() {
        System.out.println("The dog is barking");
    }
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", isFriendly=" + isFriendly +
                '}';
    }



}
/*
3.  Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()

 */