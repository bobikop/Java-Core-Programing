package day08_ternary_switch;

public class TernarysIntro {
    public static void main(String[] args) {


        int score = 85;
        String result;

        if (score >= 60){
            result = "Passed";
        } else {
            result = "Failed";
        }
        System.out.println("result = " + result);

        System.out.println("---------------------");


        String result2 = (score >= 60) ? "Passed"  : "Failed";
        System.out.println("result2 = " + result2);


        System.out.println("----------------------------------------");


        int age = 34;
        String r;
        
        if (age >= 21){
            r = "Eligible";
        }else{
            r = "Not eligible";
        }
        System.out.println("r = " + r);

        System.out.println("---------------------------------------------");
        
        String result3;

       result3 =  (age >= 21) ? "Eligible" : "Not eligible";
        System.out.println("result3 = " + result3);







    }
}
