package objects;

public class Car {
    String brand;
    byte nrOfSeets;
    boolean isAutomaticGear;
    int productionYear;
    double marketValue;
//all arg constructor
    public Car(String brand, byte nrOfSeets, boolean isAutomaticGear, int productionYear, double marketValue) {
        this.brand = brand;
        this.nrOfSeets = nrOfSeets;
        this.isAutomaticGear = isAutomaticGear;
        this.productionYear = productionYear;
        this.marketValue = marketValue;
    }

}
