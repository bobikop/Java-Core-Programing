package day24_DateAndTime;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirt;

    public void setInfo(String name, char gender, LocalDate dateOfBirt) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirt = dateOfBirt;
        age  = LocalDate.now().getYear() - dateOfBirt.getYear();
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirt=" + dateOfBirt +
                '}';
    }
}
