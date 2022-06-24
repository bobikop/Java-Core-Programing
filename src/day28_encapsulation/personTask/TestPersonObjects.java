package day28_encapsulation.personTask;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("John");

        Person person2 = new Person("Julian", 'M');

        Person person3 = new Person("Gabriel", 30);

        Person person4 = new Person("Daniel", "English");

        Person person5 = new Person(" Maria", 25,'F');

        Person person6 = new Person("Arnold", 31, 'M', "English");


        person4.name= "James";
        //person1.planet = "Mars";
        //Person.planet = "Mars";

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person5);
        System.out.println(person6);




        Person.printPlanetName();

        person1.eat("Baklava");

        person2.drink("Water");

        person5.drink("Tea");

        person6.drink("Coffee");


    }
// six different objects are allocated in java heap memory



}
