package day09_ternary_switch2;

public class CrewAndPassengers1 {
    public static void main(String[] args) {

        int number = 50;

        String result1 = (number == 50 || number == 75 || number == 100) ?
                (number == 50) ? "20 crew, 30 passengers"
                        : (number == 75) ? "25 crew, 50 passengers"
                        : "30 crew, 70 passengers"
                : "Not valid";

        System.out.println(result1);


        // System.out.println("Second solution with switch");


        int n = 10;

        String result2 = "";

        switch (n) {

            case 50:
                System.out.println("20 crew, 30 passengers");
                break;

            case 75:
                System.out.println("25 crew, 50 passengers");
                break;

            case 100:
                System.out.println("30 crew, 70 passengers");
                break;

            default:
                System.out.println("Not valid");


        }
    }
}
/*
1. Create a class named CrewAndPassangers1
        Given a number of people on the ship (int number)
        determine how many need to be crew members and how many can be passengers.
        Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

        Solution1: Use ternary. Do not use more than one println()
        Solution2: Use switch statement. Do not use more than one println()

 */