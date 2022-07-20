package day29_inheritance.homeWorTasks.employee;

public class Developer extends Employees {


    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(!(programmingLanguage == "Java" || programmingLanguage == "JavaScript" ||programmingLanguage == "Python" || programmingLanguage == "Ruby" || programmingLanguage == "C#" || programmingLanguage == "C++" || programmingLanguage == "Swift")){
            System.out.println("Invalid programming language " + programmingLanguage);
            System.exit(1);
        }

        this.programmingLanguage = programmingLanguage;
    }

    public void coding(){
        System.out.println(getName() + " is coding");
    }


    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", id='" + getId() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
