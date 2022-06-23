package day26_statics.studentTask;

public class TestPersonObject {
    public static void main(String[] args) {


        Person person1 = new Person("Manuela", 37, 'F');
        System.out.println("person1 = " + person1);

        person1.eat("Burger");
        person1.drink("Milkshake");
        person1.sleep();

    }
}
