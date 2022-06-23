package Self_PracticingAprilMay.secondMonth;

public class AverageTemp {
    public static void main(String[] args) {

        double [] temps = { 80, 88, 88, 84, 82, 78, 60, 68};

        double sum =0;

        for (double each : temps) {
            sum+=each;
        }

        double averageTemp = sum / temps.length;

        System.out.println("Average temperature is " + averageTemp);


    }
}
