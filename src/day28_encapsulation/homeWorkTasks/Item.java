package day28_encapsulation.homeWorkTasks;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice <= 0){
            System.err.println("Invalid item price");
            System.exit(1);
        }

        this.unitPrice = unitPrice;

    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid item name");
            System.exit(1);
        }
       // The java string toCharArray() method converts the given string into a sequence of characters. The returned array length is equal to the length of the string.
        for (int i = 0; i < name.toCharArray().length; i++){
            if((!Character.isLetterOrDigit(name.charAt(i))) && name.charAt(i) != ' ' || !Character.isLetter(name.charAt(0))){
                System.err.println("Invalid name");
                System.exit(1);
            }
        }
        this.name = name;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0){
            System.err.println("Invalid item quantity");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    public double calcCost(){
        return quantity * unitPrice;
    }


    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice =" + unitPrice +
                ", quantity =" + quantity +
                ", cost =" + calcCost() +
                '}';
    }
}
/*
4. create a class called Item
        private variables:
            name, unitPrice, quantity

        Encapsulate all the fields:
            Conditions:
                name can not be empty or blank
                name can not contain any special characters other than space
                name must start with letters
                ------------------------------
                unit price can not be negative
                -------------------------------
                quantity can not be negative
                -----------------------------
                if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcCost(): returns the total cost
            toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

 */