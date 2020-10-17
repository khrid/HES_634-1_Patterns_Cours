package ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.factories;

import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.cars.Car;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.cars.Pickup;

/**
 * Lab 5
 * @author scz
 */
public class PickupFactory implements CarFactory {

    public Car createCar() {
        return new Pickup();
    }

}
