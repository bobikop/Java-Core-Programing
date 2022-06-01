package day12_customMethods;

public class EmailDomain3 {

    public static void main(String[] args) {

        emailDomain("bobanm@yahoo.com");



    }

    public static void emailDomain(String email){
        String domain = email.substring(email.indexOf('@') +1, email.indexOf("."));
        System.out.println(domain);

        }
    }

