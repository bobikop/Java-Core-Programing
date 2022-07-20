package day30_inheritance.phoneTask;

public class Samsung extends Phone {


    public Samsung( String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
    }

    public void freeze(){
        System.out.println(getBrand() +" "+ getModel() +" freezes a lot");
    }


}
/*

2. Create a class named Samsung:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Samsung" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString(): prints samsung object info when the object is passed in the print statement

 */