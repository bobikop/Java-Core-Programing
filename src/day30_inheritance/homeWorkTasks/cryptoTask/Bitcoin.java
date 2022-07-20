package day30_inheritance.homeWorkTasks.cryptoTask;

public class Bitcoin extends cryptoToken {
    public Bitcoin(double price, double quantity, double volume, double circulatingSupply, double marketCap, boolean isMineable) {
        super(price, quantity, volume, circulatingSupply, marketCap, isMineable);
    }
}
