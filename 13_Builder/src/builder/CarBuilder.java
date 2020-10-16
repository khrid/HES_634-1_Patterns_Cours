package builder;

import product.Car;

public abstract class CarBuilder {
    protected Car car;

    public void createNewCarProduct() {
        car = new Car();
    }

    public abstract void buildPower();
    public abstract void buildEngine();
    public abstract void buildBreaks();
    public abstract void buildSeats();
    public abstract void buildWindows();
    public abstract void buildFuelType();
    public abstract void buildCarType();

    public Car getCar() {
        return car;
    }
}
