package Self_PracticingReplitTasks.replit1;

import java.util.Scanner;

public class Alejandro {
    public static void main(String[] args) {



        String email = " Dear Alejandro project we have new  for you";


        boolean emailNew = email.toLowerCase().contains("alejandro");
        boolean project = email.toLowerCase().contains("project");


        if (emailNew && project){
            System.out.println("priority");
        } else if (emailNew && !project) {
            System.out.println("read");
        }else {
            System.out.println("don't read");
        }


    }

}
/*

Alejandro has many emails, but only has time to read a few of them.
Help him sort his inbox by checking the given email variable for his name and for the word 'project'.
 Use the following requirements to help Alejandro:
If the email has his name and the word 'project' print: priority
If the email has only his name, but not the word 'project' print: read
If the email does not have his name print: don't read
Note: Case sensitivity for his name doesn't matter, we always want to read the email if his name is there,
but there is no difference between the uppercase or lowercase letter. This must be handling by your filtering.

 */