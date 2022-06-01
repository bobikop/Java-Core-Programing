package day07_IfStatements2;

public class GradeLevel {
    public static void main(String[] args) {
        int gradeLevel = 17;
        String schoolLevel = "";

        if (gradeLevel <= 5) {
            schoolLevel = "Elementary School";
        } else if (gradeLevel <= 8) {
            schoolLevel = "Middle School";
        } else if (gradeLevel <= 12) {
            schoolLevel = "High School";
        } else if (gradeLevel <= 16) {
            schoolLevel = "College";
        } else if (gradeLevel <= 18) {
            schoolLevel = "Grad School";
        } else{
            schoolLevel = "Invalid";
        }
        System.out.println("schoolLevel = " + schoolLevel);
    }
}

/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in.
(Only if the given number is a valid number, then print the school type.
Otherwise print Invalid)
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
 */