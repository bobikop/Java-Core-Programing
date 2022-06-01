package day08_ternary_switch;

public class SwitchIntro {
    public static void main(String[] args) {

 /*      char grade = 'B';
        String result = "";

        if (grade == 'A'){
            result = "Excellent";
        }else if (grade == 'B'){
            result = "Great Job";
        }else if (grade == 'C'){
            result = "Good";
        }else if (grade == 'D'){
            result = "Passed";
        } else{
            result = "Failed";
        }
        System.out.println("result = " + result);
*/





        System.out.println("---------------------------------------------------");

        char grade = 'B';
        String result = "";

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                    System.out.println("Failled");
                    break;
            default:
                System.out.println("Invalid");
                break;

        }


    }
}
