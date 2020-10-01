package ex1.creator;

import ex1.product.Car;

public abstract class CarCreator {
    public Car orderCar(String color) {
        Car car = createCar(color);
        return car;
    }

    public abstract Car createCar(String color);
}
