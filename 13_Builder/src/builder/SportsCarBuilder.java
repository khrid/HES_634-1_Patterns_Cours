package builder;

import product.Car;

public class SportsCarBuilder extends CarBuilder {
    @Override
    public void buildPower() {
        car.setPower("300hp");
    }

    @Override
    public void buildEngine() {
        car.setEngine("fast");
    }

    @Override
    public void buildBreaks() {
        car.setBreaks("race-grade");
    }

    @Override
    public void buildSeats() {
        car.setSeats("2");
    }

    @Override
    public void buildWindows() {
        car.setWindows("2");
    }

    @Override
    public void buildFuelType() {
        car.setFuelType("gasoline");
    }

    public void buildCarType() {
        car.setCarType("sports");
    }
}
