package ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2;


import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.cars.Car;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.cars.CarCreator;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.factories.CoupeFactory;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.factories.MinivanFactory;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.factories.PickupFactory;

/**
 * Lab 5
 * @author scz
 */
public class Program
{
	public static void main(String[] args)
	{
        CarCreator coupeCreator = new CarCreator(new CoupeFactory());
        CarCreator minivanCreator = new CarCreator(new MinivanFactory());
        CarCreator pickupCreator = new CarCreator(new PickupFactory());

        Car c1 = coupeCreator.orderCar("red");
        System.out.println("Car "
                + c1.getName() + " "
                + c1.getColor()
                + " has been ordered.");

        Car c2 = minivanCreator.orderCar("blue");
        System.out.println("Car "
                + c2.getName() + " "
                + c2.getColor()
                + " has been ordered.");

        Car c3 = pickupCreator.orderCar("green");
        System.out.println("Car "
                + c3.getName() + " "
                + c3.getColor()
                + " has been ordered.");
	}
}
