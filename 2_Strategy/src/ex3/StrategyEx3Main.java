package ex3;

import ex3.behavior.acceleration.StandardAccelerationBehavior;
import ex3.behavior.braking.StandardBreakingBehavior;
import ex3.category.*;

/**
 * Ex3
 * Different categories of cars of a specific brand have different braking and
 * acceleration behaviors. Design and implement a simulator for such a use
 * case using the strategy pattern
 */

public class StrategyEx3Main {
    public static void main(String[] args) {
        Car asx = new Suv();
        Car eclipse = new Convertible();
        Car delica = new Minivan();

        System.out.println("Testing asx");
        asx.accelerate();
        asx.brake();
        System.out.println();

        System.out.println("Testing eclipse");
        eclipse.accelerate();
        eclipse.brake();
        System.out.println();

        System.out.println("Testing delica");
        delica.accelerate();
        delica.brake();
        System.out.println("Changing brakes");
        delica.setBrakingBehavior(new StandardBreakingBehavior());
        delica.accelerate();
        delica.brake();
        System.out.println("Changing acceleration system");
        delica.setAccelerationBehavior(new StandardAccelerationBehavior());
        delica.accelerate();
        delica.brake();

    }
}
