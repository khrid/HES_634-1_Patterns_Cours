package ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.cars;

import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.factories.CarFactory;

/**
 * Lab 5
 * @author scz
 */
public class CarCreator {

    private CarFactory carFactory;

    public CarCreator(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public Car orderCar(String color) {
        Car car = createCar();

        car.installEngine();
        car.addExtras();
        car.paint(color);

        return car;
    }

    protected Car createCar() {
        return carFactory.createCar();
    }

}
