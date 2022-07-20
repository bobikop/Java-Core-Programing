package day29_inheritance.homeWorTasks.phoneTask;

public class IPhone extends  Phone{
    public void faceTime(long phoneNumber) {
        System.out.println("Face timing "+phoneNumber);
    }
    public void faceTime(String email) {
        System.out.println("Face timing "+email);
    }

}
