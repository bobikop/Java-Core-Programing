package day19_array;

public class ArraysTasks {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        boolean contains = false;
        String result = "";

        for (int i = 0; i < items.length; i++) {
            if(items[i].equals("Gloves")){
                System.out.println("Index number of gloves: " + i);
                break;
            }
        }

        for (int i = 0; i < items.length; i++) {
            if(items[i].equals("iPad")){
                contains = true;
            }
            result += items[i] + " - $" + prices[i] + " - ID" + itemIDs[i] + "\n";
        }
        if(contains){
            System.out.println("iPad is in the list");
        } else {
            System.out.println("iPad is not in the list");
        }

        System.out.println(result);

    }
}
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

 */