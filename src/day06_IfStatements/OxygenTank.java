package day06_IfStatements;

public class OxygenTank {
    public static void main(String[] args) {
        int oxygenLevel = 50;
        String levelStatus = "";
        if (oxygenLevel >= 90){
            levelStatus = "Your tank is full";
        }
        if (oxygenLevel >= 80 && oxygenLevel < 90){
            levelStatus = "Still okay";
        }
        if (oxygenLevel >= 70 && oxygenLevel < 80){
            levelStatus = "Don't go too far";
        }
        if (oxygenLevel >= 60 && oxygenLevel < 70){
            levelStatus = "Start to head back";
        }
        if (oxygenLevel >= 50 && oxygenLevel < 60){
            levelStatus = "Be careful now you at at 50%";
        }
        System.out.println(levelStatus);

    }
}
/*
3. Create a class named OxygenTank. You are diving in the ocean.
Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */