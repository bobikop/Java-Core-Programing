package day31_inheritance.homeworkTasks.employee;

public class Developer extends  Employee {
    public Developer(String name, int age, char gender, String id, String jobTitle, String companyName, double salary) {
        super(name, age, gender, id, jobTitle, companyName, salary);
    }

    private String programmingLanguage;

    public Developer(String name, int age, char gender, String id, String jobTitle, String companyName, double salary, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, companyName, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is coding in " + programmingLanguage);
    }



}
