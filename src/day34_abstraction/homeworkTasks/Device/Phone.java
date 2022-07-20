package day34_abstraction.homeworkTasks.Device;

public abstract class Phone extends Device{

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    protected void turnOn() {
        System.out.println(getBrand() +" " +  getModel() + " press  on button to turn on");
    }

    @Override
    protected void turnOff() {
        System.out.println(getBrand() +" " +  getModel() + " press off button to turn off");
    }

    void call(){
        System.out.println();
        System.out.println(getBrand() +" " +  getModel() + " press call button to call");
    }
    void text(){
        System.out.println(getBrand() +" " +  getModel() + " press text button to create text message");
    }


}
/*
2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()

 */