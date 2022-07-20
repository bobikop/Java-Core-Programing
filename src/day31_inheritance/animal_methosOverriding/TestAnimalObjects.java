package day31_inheritance.animal_methosOverriding;

public class TestAnimalObjects {

    public static void main(String[] args) {
          Cat cat = new Cat("Emily", "Persian", 'F',4,"Small" , "Gray");
          Dog dog = new Dog("Max", "Husky", 'M',3,"Large" , "White");
          Lion lion = new Lion("Simba", "African", 'M',6,"Large" , "Yellow", true);
          Eagle eagle = new Eagle("Bella", "America Eagle", 'F', 4, "medium", "Black & White");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        cat.eat();
        dog.eat();
        eagle.eat();
        lion.eat();

        cat.sleep();
        dog.sleep();
        eagle.sleep();
        lion.sleep();



    }
}
