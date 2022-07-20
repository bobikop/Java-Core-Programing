package day38_exceptions;

import javax.swing.plaf.TableHeaderUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TrowsKeyword2 {
    public static void main(String[] args) throws InterruptedException {


        pauseFor5Seconds();



    }

    public static void pauseFor5Seconds() throws InterruptedException {


        Thread.sleep(50000);


    }


    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pauseFor5Seconds();
        System.out.println("Hello Cydeo");
    }

    public  static  void  method2() throws Exception { //use Exception class so cover all exceptions from the method
        // use throws when no nee dto call method anywhere

        System.out.println("First program started");

        Thread.sleep(3000);

        System.out.println("First program ended");

        new FileInputStream( " ");

        Thread.sleep(5000);
    }


}
