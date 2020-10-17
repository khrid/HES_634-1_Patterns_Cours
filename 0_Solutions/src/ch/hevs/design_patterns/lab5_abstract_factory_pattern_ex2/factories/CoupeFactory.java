package ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.factories;

import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.cars.Car;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.cars.Coupe;

/**
 * Lab 5
 * @author scz
 */
public class CoupeFactory implements CarFactory {

    public Car createCar() {
        return new Coupe();
    }

}
