package day36_referenceTypeCastings;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.*;
import day34_abstraction.homeworkTasks.CarTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;

public class ReferenceTypeCasting {

    public static void main(String[] args) {


          Dog dog = new Dog();

         // Cat cat = new Dog();

        Animal animal = new Dog();// parent is referenced to the child -this is polymorphism


        System.out.println("--------------------------------------------------------------");

        Animal animal1 = new Dog();// upcasting ==> polymorphism
        animal1.setInfo("Max","husky", 'M', 6, "Large", "White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();
        ( (Dog)animal1 ).bark();// example of down-casting

        //Dog dog1 = (Dog)animal1; // example of down-casting
        //dog1.bark();

        // whenever we use explicit casting object must be the same as reference number

        //  ( (Cat)animal1).scratch(); // Dog can not be converted to Cat, because there is not "IS A" relationship between dog and cat


        System.out.println("-------------------------------------------------------------");

        Phone phone = new Nokia("XR20", "Small", "Blue", 350);

        phone.call(911);
        phone.text(123456);
        ((Nokia) phone).selfDefense();

        //    ( (IPhone)phone ).faceTime(123456); // Nokia can not be converted to Iphone, because there is not "IS A" relationship between Nokia and Iphone

        ((Nokia) phone).selfDefense();


        System.out.println("-------------------------------------------------------------");


        Employee employee = new Developer("Boban", 40,'M', "C1" , "Developer" , 135000, "Java");

        employee.work();

        System.out.println( ((Developer) employee).getProgramingLanguage() );


        //    Driver driver = (Driver) employee;


        System.out.println("-------------------------------------------------------------");

        Electric electric = new Tesla("Tesla", "Model Y", "Blue", 2020, 55000);

        electric.charge();
        ((Tesla)electric).autoPilot();
        ( (AutoPilot)electric ).selfDrive();


        System.out.println("-------------------------------------------------------------");

        Employee employee1 = new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);

        Employee employee2 = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Employee employee3 = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Employee employee4 = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();



    }
}
