package director;

import builder.CarBuilder;
import product.Car;

public class CarFactory {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void constructCar() {
        carBuilder.createNewCarProduct();
        carBuilder.buildPower();
        carBuilder.buildEngine();
        carBuilder.buildBreaks();
        carBuilder.buildSeats();
        carBuilder.buildWindows();
        carBuilder.buildFuelType();
        carBuilder.buildCarType();
    }

    public Car getCar() {
        return carBuilder.getCar();
    }
}
