package day16_nestedLoop;

public class doWhileLoopIntroBoban {
    public static void main(String[] args) {

        int i = 0;
        do {                              // do while will print out even condition is false
            System.out.println("Hello");
            if (i > 5) {
                break;
            }

        } while (i > 15);

        System.out.println("-----------------------------------------");

        while (i > 5) {    //while loop will never print out if the condition is false. Example here i = 0, and i>5
            System.out.println("Hello");
        }

        System.out.println("--------------------------------------------------");
        // here is example how we can print something multiple times using do while loop

        do {
            System.out.println("Hello !");
            i++;

        } while (i < 8);


    }
}
