package Self_PracticingReplitTasks.replit1;

public class Email {
    public static void main(String[] args) {


         String email = "nicolas_Johnson@gmail.com";

         String firstName = "";
         String lastName = "";
         String domain = "";

         firstName = email.substring(0,email.indexOf('_'));
         lastName = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
         domain = email.substring(email.indexOf('@') + 1 , email.indexOf('.'));

         // String output = str.substring(0, 1).toUpperCase() + str.substring(1);


        System.out.println(firstName.substring(0,1).toUpperCase() + firstName.substring(1));
        System.out.println(lastName.substring(0,1).toUpperCase() + lastName.substring(1));
        System.out.println(domain.substring(0,1). toUpperCase() + domain.substring(1));

    }
}
/*
Use String methods to divide the given email into separate parts. The email will always be in this format:
firstName_lastName@domain.com
Pull apart and print the first name, last name, and domain. When printing the values all three should be in proper capitalization format -
The first letter of each word is uppercase and the rest are lowercase. Output in the following format:
 */