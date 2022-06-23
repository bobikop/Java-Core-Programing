package Self_PracticingAprilMay.firstMonth;

public class SecondsToHour {
    public static void main(String[] args) {


        int inputSeconds = 3695;

        int seconds = inputSeconds % 60;
        int minutes = (inputSeconds  % 3600) / 60;
        int hours = inputSeconds / 3600;


        System.out.println(hours + " Hours, " + minutes + " Minutes, " + seconds + " Seconds");


    }
}
