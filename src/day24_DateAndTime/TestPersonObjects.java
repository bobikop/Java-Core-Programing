package day24_DateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {


        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Boban", 'M', LocalDate.of(1955,3,6));
        people[1].setInfo("Ower", 'M', LocalDate.of(1985, 5, 8));
        people[2].setInfo("Hasan", 'M', LocalDate.of(1995, 10, 8));
        people[3].setInfo("Ermek", 'M', LocalDate.of(1956, 6, 4));
        people[4].setInfo("Evgenya", 'F', LocalDate.of(1981, 12, 8));

        //add all persons form the group

        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));


        for ( Person each : studentsList){
            System.out.println(each.name + " : " + each.dateOfBirt);

        }

        studentsList.removeIf( p -> p.age>55);

        for (Person each : studentsList){
            studentsList.removeIf( p -> p.age>55);
            System.out.println(each.name + " : " + each.age);
        }

        // print name & date of birth of each person object


        // remove all the person object that has the age > 55






    }
}
