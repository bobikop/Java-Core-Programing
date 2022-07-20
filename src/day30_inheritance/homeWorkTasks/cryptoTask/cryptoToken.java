package day30_inheritance.homeWorkTasks.cryptoTask;

public class cryptoToken {


    private double price, quantity,volume,circulatingSupply,marketCap;
    private  boolean isMineable;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println("Invalid price. price can not be negative!" + price);
            System.exit(1);
        }
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if(quantity <= 0){
            System.err.println("Invalid input! Quantity can not be negative!" + quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        if(marketCap < 0){
            System.err.println("Market Capitalization can not be zero!" + marketCap);
            System.exit(1);
        }
        this.marketCap = marketCap;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }


    public double totalPrice(){
        return price * quantity;
    }

    public cryptoToken(double price, double quantity, double volume, double circulatingSupply, double marketCap, boolean isMineable) {
        setPrice(price);
        setQuantity(quantity);
        setVolume(volume);
        setCirculatingSupply(circulatingSupply);
        setMarketCap(marketCap);
        setMineable(isMineable);
    }


    public String toString() {
        return  getClass().getSimpleName()+"{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", marketCap=" + marketCap +
                ", isMineable=" + isMineable +
                '}';
    }
}
/*
cryptoTask
	1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)

			Encapsulate all the fields
				Conditions:
					1. price can not be set to zero or negative
					2. quantity can nt set to negative
					3. marketCap can not be zero

			methods:
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

	2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge

	3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset

 */