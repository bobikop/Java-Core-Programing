package day25_Constructors;

import java.time.LocalDate;

public class TestEmployeeObjects {

    public static void main(String[] args) {


        Employee e1 = new Employee("Nikola", 40, 'M', "Java Developer", 95000, LocalDate.of(2022,3,15));

        Employee e2 = new Employee("Stacey", 30, 'F', "Java Developer", 85000, LocalDate.of(2021,6,11));


        System.out.println(e1);
        System.out.println(e2);


    }
}
