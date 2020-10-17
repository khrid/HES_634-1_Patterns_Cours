package ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.factories;

import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.cars.Car;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.cars.Minivan;

/**
 * Lab 5
 * @author scz
 */
public class MinivanFactory implements CarFactory {

    public Car createCar() {
        return new Minivan();
    }

}
