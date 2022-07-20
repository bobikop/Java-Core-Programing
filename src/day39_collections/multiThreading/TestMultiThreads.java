package day39_collections.multiThreading;

public class TestMultiThreads {
    public static void main(String[] args) {

         Thread thread1 = new ThreadHelloWorld(1);
         Thread thread2 = new ThreadHelloWorld(2);
        Thread thread3 = new ThreadHelloWorld(3);
        Thread thread4 = new ThreadHelloWorld(4);
        Thread thread5 = new ThreadHelloWorld(5);
        Thread thread6 = new ThreadHelloWorld(6);

        /*
        thread1.run();
        thread2.run();
        thread3.run();
        thread4.run();
        thread5.run();
 */



         thread1.start();
         thread2.start();
         thread3.start();
         thread4.start();
         thread5.start();
         thread6.start();
    }
}
