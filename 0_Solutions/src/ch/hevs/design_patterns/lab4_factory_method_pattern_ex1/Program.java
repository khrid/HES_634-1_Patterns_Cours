package ch.hevs.design_patterns.lab4_factory_method_pattern_ex1;

import ch.hevs.design_patterns.lab4_factory_method_pattern_ex1.cars.*;
import ch.hevs.design_patterns.lab4_factory_method_pattern_ex1.creator.CarCreator;
import ch.hevs.design_patterns.lab4_factory_method_pattern_ex1.creator.CoupeCreator;
import ch.hevs.design_patterns.lab4_factory_method_pattern_ex1.creator.MinivanCreator;
import ch.hevs.design_patterns.lab4_factory_method_pattern_ex1.creator.PickupCreator;

/**
 * Lab 4
 *
 * @author egs
 */
public class Program {
    public static void main(String[] args) {

        CarCreator coupeCreator = new CoupeCreator();
        CarCreator minivanCreator = new MinivanCreator();
        CarCreator pickupCreator = new PickupCreator();

        Car c1 = coupeCreator.orderCar("red");
        System.out.println("Car "
                + c1.getName()
                + " " + c1.getColor()
                + " has been ordered.");

        Car c2 = minivanCreator.orderCar("red");
        System.out.println("Car "
                + c2.getName()
                + " "
                + c2.getColor()
                + " has been ordered.");

        Car c3 = pickupCreator.orderCar("red");
        System.out.println("Car "
                + c3.getName()
                + " "
                + c3.getColor()
                + " has been ordered.");
    }
}
