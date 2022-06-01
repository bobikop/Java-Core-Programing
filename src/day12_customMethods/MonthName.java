package day12_customMethods;

public class MonthName {
    public static void main(String[] args) {

        montName(6);



    }


    public  static void montName(Integer number){

        String montName = "";

        switch (number) {
            case 1:
                montName = "January";
                break;
            case 2:
                montName = "February";
                break;
            case 3:
                montName = "March";
                break;
            case 4:
                montName = "April";
                break;
            case 5:
                montName = "May";
                break;
            case 6:
                montName = "June";
                break;
            case 7:
                montName = "July";
                break;
            case 8:
                montName = "August";
                break;
            case 9:
                montName = "September";
                break;
            case 10:
                montName = "October";
                break;
            case 11:
                montName = "November";
                break;
            case 12:
                montName = "December";
                break;
            default:
                montName = "Invalid entry";

        }

        System.out.println("montName = " + montName);

    }

}
