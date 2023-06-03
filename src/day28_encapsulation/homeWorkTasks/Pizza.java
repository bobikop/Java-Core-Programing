package day28_encapsulation.homeWorkTasks;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!size.equalsIgnoreCase("small") && !size.equalsIgnoreCase("medium") && !size.equalsIgnoreCase("large")) {
            System.err.println("invalid size " + size);
            System.exit(1);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0 || size.equalsIgnoreCase("small") && numberOfCheeseTopping > 3 || size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 4
                || size.equalsIgnoreCase("large") && numberOfCheeseTopping > 5) {
            System.err.println("invalid number of cheese toppings " + numberOfCheeseTopping);
            System.exit(1);
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;

    }

    public int getNumberOfPepperoniTopping() {
        if (numberOfCheeseTopping < 0 || size.equalsIgnoreCase("small") && numberOfCheeseTopping > 4 || size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 5
                || size.equalsIgnoreCase("large") && numberOfCheeseTopping > 6) {
            System.err.println("invalid number of pepperoni toppings " + numberOfCheeseTopping);
            System.exit(1);
        }
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public double calcCost() {

        switch (size.toLowerCase()) {
            case "small":
                return 10 + (2 * numberOfCheeseTopping) + (2 * numberOfPepperoniTopping);
            case "medium":
                return 12 + (2 * numberOfCheeseTopping) + (2 * numberOfPepperoniTopping);
            default:
                return 14 + (2 * numberOfCheeseTopping) + (2 * numberOfPepperoniTopping);
        }

    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", cost=" + calcCost() +
                '}';
    }

}
/*

5. Create class named Pizza:
                private variables:
                    size, numberOfCheeseTopping, numberOfPepperoniTopping

                Encapsulate all the fields
                        Conditions:
                            size of the pizza can only be small, medium, large. case insensitive

                            Number of cheese topping can not be negative, the maximum number of cheese topping is:
                                        small: 3
                                        medium: 4
                                        large: 5

                            Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

                                        small: 4
                                        medium: 5
                                        large: 6

                Add a constructor that allows user to set all the fields when the object is created.
                                (If the arguments not valid it should not be set to the instances)


                Methods:
                    calcCost(): returns the totalCost of the pizza
                    toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping


 */