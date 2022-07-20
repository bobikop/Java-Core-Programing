package day34_abstraction.homeworkTasks.CarTask;

public class CarShop {
    public static void main(String[] args) {

        Toyota toyota1 = new Toyota("Toyota", "Corolla", 2014,18500, "white");
        Honda honda1 = new Honda("Honda", "Acord",2017, 17500, "black");
        BMW bmw1 = new BMW("BMW", "M3",2021, 35000, "yellow");
        Audi audi1 = new Audi("Audi", "90", 1987, 4500, "navy blue");
        Mercedes mercedes = new Mercedes("Mercedes", "SLR", 2006, 65000, "red");


        Nio nio = new Nio("Nio", "ES7", 2022, 69700, "Blue");
        Tesla tesla = new Tesla("Tesla", "Model 3", 2022, 58000, "Red");


        CydeoCar cydeoCar = new CydeoCar("Cydeocar", "B82", 2022, 13500, "Green");


        System.out.println(audi1);
        System.out.println(bmw1);
        System.out.println(cydeoCar);
        System.out.println(honda1);
        System.out.println(mercedes);
        System.out.println(nio);
        System.out.println(tesla);
        System.out.println(toyota1);

        audi1.start();
        bmw1.start();
        cydeoCar.start();
        honda1.start();
        mercedes.start();
        nio.start();
        tesla.start();
        toyota1.start();
        audi1.drive();
        bmw1.drive();
        cydeoCar.drive();
        honda1.drive();
        mercedes.drive();
        nio.drive();
        tesla.drive();
        toyota1.drive();
        audi1.stop();
        bmw1.stop();
        cydeoCar.stop();
        honda1.stop();
        mercedes.stop();
        nio.stop();
        tesla.stop();
        toyota1.stop();
        audi1.autoPark();
        mercedes.autoPark();
        tesla.selfDrive();
        nio.selfDrive();
        tesla.autoPark();
        nio.autoPark();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();
    }
}
