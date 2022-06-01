package Self_PracticingReplitTasks;

public class OddNumber {
    public static void main(String[] args) {


        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int j = 1; j <= 20; j++) {
            if (j % 2 != 0) {
                System.out.print(j + " ");

            }
        }
        System.out.println();
    }
}