package ex3.category;

import ex3.behavior.acceleration.SnailAccelerationBehavior;
import ex3.behavior.braking.PoorBrakingBehavior;

public class Minivan extends Car {
    public Minivan() {
        setAccelerationBehavior(new SnailAccelerationBehavior());
        setBrakingBehavior(new PoorBrakingBehavior());
    }
}
