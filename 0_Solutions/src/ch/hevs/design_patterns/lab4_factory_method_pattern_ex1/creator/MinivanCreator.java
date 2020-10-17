package ch.hevs.design_patterns.lab4_factory_method_pattern_ex1.creator;

import ch.hevs.design_patterns.lab4_factory_method_pattern_ex1.cars.Car;
import ch.hevs.design_patterns.lab4_factory_method_pattern_ex1.cars.Minivan;

/**
 * Lab 4
 * @author scz
 */
public class MinivanCreator extends CarCreator
{
    @Override
	protected Car createCar() {
		return new Minivan() ;
	}
}
