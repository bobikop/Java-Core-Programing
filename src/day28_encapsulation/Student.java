package day28_encapsulation;

public class Student {

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        boolean hasDigit = false;
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)){
                hasDigit = true;
                break;
            }

        }
        if (hasDigit){
            System.err.println("Invalid name " + name);
            System.exit(1);
        }

        this.name = name;
    }

    private  String name;



    public int getAge(){ // READ ONLY getter is instance method,we can call it through the object name

        if (age == 0){
            System.err.println( "Age has not be set");
            System.exit(1);
        }

        return age;
    }

    public void setAge(int age){ //WRITE ONLY
        if (age <1){
            System.err.println("Invalid Age: " + age);
           // return; //exiting the method
            System.exit(1); // program gets terminated2022

        }

        this.age = age;
    }


}
