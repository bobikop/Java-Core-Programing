package day39_collections.multiThreading;

public class ThreadHelloWorld extends Thread{

    int threadNumber;

    public ThreadHelloWorld(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        super.run();
        for (int i =1 ; i<6;i++){
            System.out.println("Hello world " + i + " from Thread " + threadNumber);

            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
