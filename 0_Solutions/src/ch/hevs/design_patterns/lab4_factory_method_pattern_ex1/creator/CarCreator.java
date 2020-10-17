package ch.hevs.design_patterns.lab4_factory_method_pattern_ex1.creator;

import ch.hevs.design_patterns.lab4_factory_method_pattern_ex1.cars.Car;

/**
 * Lab 4
 * @author scz
 */
public abstract class CarCreator {

    public Car orderCar(String color) {
        Car car = createCar();

        car.installEngine();
        car.addExtras();
        car.paint(color);

        return car;
    }

	protected abstract Car createCar();

}
