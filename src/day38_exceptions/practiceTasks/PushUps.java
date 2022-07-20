package day38_exceptions.practiceTasks;

public class PushUps {
    public static void main(String[] args) throws InterruptedException {

        String s = "push-up";
        String p = "pull-up";

        for (int i = 0; i < 30; i++) {
            System.out.println(s);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(p);
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
