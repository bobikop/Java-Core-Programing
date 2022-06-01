package day12_customMethods;

public class DaysOfMonth {

    public static void main(String[] args) {

        monthDaysNumber("February");


    }

    public static void monthDaysNumber (String numberOfdays){


        switch (numberOfdays){
            case "January":
                numberOfdays = "June has 31 days";
                        break;
            case "February":
                numberOfdays = "February has 28 days";
                break;
            case "March":
                numberOfdays = "March has 31 days";
                break;
            case "April":
                numberOfdays = "April has 30 days";
                break;
            case "May":
                numberOfdays = "May has 31 days";
                break;
            case "June":
                numberOfdays = "June has 30 days";
                break;
            case "July":
                numberOfdays = "July has 31 days";
                break;
            case "August":
                numberOfdays = "August has 31 days";
                break;
            case "September":
                numberOfdays = "September has 30 days";
                break;
            case "October":
                numberOfdays = "October has 31 days";
                break;
            case "November":
                numberOfdays = "November has 30 days";
                break;
            case "December":
                numberOfdays = "December has 31 days";
                break;
            default:
                numberOfdays = "Invalid entry";

        }

        System.out.println("numberOfdays = " + numberOfdays);


    }

}
