package ex1.product;

public class CarBerlin extends Car {

    public CarBerlin() {
        description = "CarBerlin";
    }

    @Override
    public int cost() {
        return 25000;
    }

    @Override
    public int securityLevel() {
        return 0;
    }
}
