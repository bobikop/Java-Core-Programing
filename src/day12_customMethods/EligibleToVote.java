package day12_customMethods;

public class EligibleToVote {
    public static void main(String[] args) {

        eligibleToVote(23, true);

    }

    public static void eligibleToVote(int age, boolean isAmerican){
        if ((age >= 21) && isAmerican){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }
}
