package Self_PracticingAprilMay.firstMonth;

import java.util.Scanner;

public class ComputerShopping {

    public static void main(String[] args) {

        double totalPrice = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Select screen size:");
        double screenSize = input.nextDouble();

        System.out.println("Select CPU type:");
        String cpu = input.next();

        System.out.println("Select RAM size:");
        int ram = input.nextInt();

        System.out.println("Select storage type:");
        String storageType = input.next();

        System.out.println("Select storage size:");
        int storageSize = input.nextInt();

        System.out.println("Select screen resolution:");
        String screen = input.next();



        if(screenSize == 13.3){
            totalPrice += 200;
        }else if(screenSize == 15.0){
            totalPrice += 300;
        }else{
            totalPrice += 400;
        }

        if(cpu.equals("i3")){
            totalPrice += 150;
        }else if(cpu.equals("i5")){
            totalPrice += 250;
        }else{
            totalPrice += 350;
        }

        if(ram % 4 == 0){
            totalPrice += (ram/4) * 50;
        }

        if(storageType.equals("HDD")){
            totalPrice += ((storageSize /500) * 50);
        }else if(storageType.equals("SDD")){
            totalPrice += ((storageSize /500) * 100);
        }
/*
        if(screen.equals("FULLHD")){
            totalPrice += 100;
        }else if (screen.equals("4K")){
            totalPrice += 200;
        }
*/
        System.out.println("Final price is: $" + totalPrice);

        input.close();
    }
}

