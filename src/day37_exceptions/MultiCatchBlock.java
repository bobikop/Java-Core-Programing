package day37_exceptions;


import day35_polymorphism.transportationTask.Car;

public class MultiCatchBlock {

// parent exception (RuntimeException) class can not be placed before child exception class
    public static void main(String[] args) {

        System.out.println("Program Started");

        Car car = null;

        try{
            car.drive();
            }catch (ArithmeticException e) {
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch (ClassCastException e) {
            System.out.println("Second Catch Block");
            e.printStackTrace();
        }catch (NullPointerException e) {
            System.out.println("third Catch Block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){   // if we are not sure what is the exception we should use Runtime Exception as a last
            System.out.println("Fifth Catch Block");
            e.printStackTrace();
        }

        System.out.println("Program ended");
    }
}
