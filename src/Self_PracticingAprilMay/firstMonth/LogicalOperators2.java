package Self_PracticingAprilMay.firstMonth;

public class LogicalOperators2 {
    public static void main(String[] args) {

        int years = 69;
        String state = "Serbia";
        boolean pension = years >= 67;
        System.out.println(pension);
        boolean getUsaPension = years != 62 || state == "USA";
        //  boolean pastTheExam = grade == 'A' ||  grade == 'B' || grade == 'C' || grade =='C';
        System.out.println(getUsaPension);

        System.out.println("--------------------------------------");

        String txt = "Super";
        String lang = "Java";

        boolean state1 = txt == lang;
        state1 = txt != lang;
        System.out.println(state1);


    }
}
