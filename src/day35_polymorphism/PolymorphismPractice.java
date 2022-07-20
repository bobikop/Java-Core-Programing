package day35_polymorphism;

import day34_abstraction.animalTask.*;
import day34_abstraction.animalTask.Flyable;
import day34_abstraction.homeworkTasks.CarTask.*;
import day35_polymorphism.transportationTask.Electric;

public class PolymorphismPractice {
    public static void main(String[] args) {

        Animal tiger = new Tiger("Jonny","African",'M',7,"Large", "Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
     //   tiger.hunt();


        Animal animal = new Eagle("Jonny","African",'M',7,"Large", "Orange");


      //  animal.fly()

        // without changing reference type we can call method which is not coming from parent clas

        Flyable obj1 = new Eagle("Jonny","African",'M',7,"Large", "Orange");

       // obj1.eat(); // do not exist in Flyable class
        //obj1.drink();// do not exist in Flyable class
       // obj1.sleep();// do not exist in Flyable class
       // obj1.fly();// do not exist in Flyable class
        System.out.println(obj1.canFly);

        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Eagle eagle = null;

        Duck duck = null;

        Dog dog = null;

        Cat cat = null;

        CydeoCar cydeoCar = null;

        Flyable[] birds = { parrot, eagle, duck};

        Swimable[] fishes = {dolphin, shark, duck};

        Playable[] friendlyAnimals = {dog, cat, duck};


        boolean isAnimal = dog instanceof Animal;


        System.out.println(isAnimal);

        System.out.println("------------------------------------------------");

       Car car = new Tesla("Tesla", "Model Y", 2020, 25500, "white");

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;

        boolean isElectricCar = car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;


        System.out.println("isTesla = " + isTesla);
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectricCar = " + isElectricCar);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("hasAutoPilot = " + hasAutoPilot);

        System.out.println("------------------------------------------------");




    }
}
