package day31_inheritance.homeworkTasks.student;

public class CydeoStudent extends Student {

    private int batchNumber, groupNumber;
    private String programmingLanguage;


    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
        setBatchNumber(batchNumber);
        setGroupNUmber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }


    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0) {
            System.err.println("invalid batch number: " + batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNUmber() {
        return groupNumber;
    }

    public void setGroupNUmber(int groupNUmber) {
        if (groupNumber <= 0) {
            System.err.println("invalid group number: " + groupNumber);
            System.exit(1);
        }
        this.groupNumber = groupNUmber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.trim().isEmpty()) {
            System.err.println("invalid programming language: " + programmingLanguage);
            System.exit(1);
            this.programmingLanguage = programmingLanguage;
        }
    }

    @Override
    public void eat() {
        System.out.println("Student " + getName() + " from  " + getSchoolName() + " eats " + programmingLanguage + " for lunch");
    }

    @Override
    public void drink() {
        System.out.println(getSchoolName() + " student " + getName() + " drinks " + programmingLanguage + " for lunch");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is dreaming of " + programmingLanguage + " in their sleep");
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
/*

 3. CydeoStudent:

                        Extra Variables:
                            batchNumber, groupNumber, programmingLanguage

                        Encapsulate all the fields

                        Add a constructor that can set all the fields

                                Condition:
                                    1. batchNumber and groupNumber should not be set to zero or negative
                                    2. programmingLanguage should not be set to null
                                    3. programmingLanguage should not empty


                        Override the eat, drink and sleep methods (programmingLanguage need to be included)

                        Override the toString method:
                                name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included
 */