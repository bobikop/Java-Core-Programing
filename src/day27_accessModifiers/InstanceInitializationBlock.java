package day27_accessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;


 /*   {
        name = "James";
        age = 20;

   }
   */

    // using constructor is best option to initialize instance variables since its allow you to past the needed parameters which is not possible in instance bloock
    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("James", 25);

        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Aaron", 28);


        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }








}
