package day32_finalKeyword;

import java.time.LocalDate;


class CydeoStudent{


    public void language(){
        System.out.println("Java Programing");
    }
}







public class FinalKeyword extends CydeoStudent {

   /* public void language(){      // final methods can not be overridden
        System.out.println("Python programing");
    }
    */

    public FinalKeyword(){

    }

    public static void main(String[] args) {

        final char gender = 'M';  // adding final keyword making value unchangeable
        System.out.println(gender);

      //  gender = 'F';

        System.out.println(gender);
        System.out.println("----------------------------------------");
        LocalDate dateOfBirth = LocalDate.now();


        System.out.println(dateOfBirth);

        System.out.println("----------------------------------------");


        new CydeoStudent().language();
        new FinalKeyword().language();




    }
}
