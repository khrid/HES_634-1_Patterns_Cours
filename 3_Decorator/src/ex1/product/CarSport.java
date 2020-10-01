package ex1.product;

public class CarSport extends Car {
    public CarSport() {
        description = "CarSport";
    }
    @Override
    public int cost() {
        return 50000;
    }

    @Override
    public int securityLevel() {
        return 0;
    }
}
