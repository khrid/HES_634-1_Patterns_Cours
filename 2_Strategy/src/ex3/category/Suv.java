package ex3.category;

import ex3.behavior.acceleration.StandardAccelerationBehavior;
import ex3.behavior.braking.HeavyVehicleBreakingBehavior;

public class Suv extends Car {
    public Suv() {
        setAccelerationBehavior(new StandardAccelerationBehavior());
        setBrakingBehavior(new HeavyVehicleBreakingBehavior());
    }
}
