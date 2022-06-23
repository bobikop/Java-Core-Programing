package Self_PracticingAprilMay.firstMonth;

public class Milliseconds {
    public static void main(String[] args) {

        long milliseconds = 366002 ;

        int seconds = (int) (milliseconds / 1000) % 60;
        int minutes = (int)((milliseconds / (1000*60)) % 60);
        int hours = (int)((milliseconds / (1000*60 *60)) % 24);

        System.out.println(milliseconds + "milliseconds = " + hours + " Hours, " + minutes + " Minutes, " + seconds + " Seconds" );

    }
}
