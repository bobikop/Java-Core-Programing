package day28_encapsulation.personTask;

import day28_encapsulation.Employee;

public class TestEmployeeObject {
    public static void main(String[] args) {


       // Employee employee1 = new Employee();
        //employee1.salary = 200000;



        //employee1.setSalary(-100000);
        // in order to be able to print  setSalary value we need getSalary
        // in order to be able to print we use get() method
       // System.out.println(employee1.getSalary());

       // employee1.setName( "        ");

        //System.out.println(employee1.getName());


        Employee employee1 = new Employee("Daniel", 45, "Developer", 100000);

        System.out.println(employee1);




    }

}
