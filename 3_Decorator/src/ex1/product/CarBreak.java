package ex1.product;

public class CarBreak extends Car {

    public CarBreak() {
        description = "CarBreak";
    }

    @Override
    public int cost() {
        return 35000;
    }

    @Override
    public int securityLevel() {
        return 0;
    }
}
