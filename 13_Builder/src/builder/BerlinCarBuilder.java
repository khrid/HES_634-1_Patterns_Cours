package builder;

import product.Car;

public class BerlinCarBuilder extends CarBuilder {
    @Override
    public void buildPower() {
       car.setPower("120hp");
    }

    @Override
    public void buildEngine() {
        car.setEngine("standard");
    }

    @Override
    public void buildBreaks() {
        car.setBreaks("standard");
    }

    @Override
    public void buildSeats() {
        car.setSeats("5");
    }

    @Override
    public void buildWindows() {
        car.setWindows("4");
    }

    @Override
    public void buildFuelType() {
        car.setFuelType("diesel");
    }

    public void buildCarType() {
        car.setCarType("berlin");
    }
}
