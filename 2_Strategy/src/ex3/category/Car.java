package ex3.category;

import ex3.behavior.acceleration.*;
import ex3.behavior.braking.*;

public abstract class Car {
    BrakingBehavior brakingBehavior = new StandardBreakingBehavior();
    AccelerationBehavior accelerationBehavior = new StandardAccelerationBehavior();

    public void setBrakingBehavior(BrakingBehavior brakingBehavior) {
        this.brakingBehavior = brakingBehavior;
    }

    public void setAccelerationBehavior(AccelerationBehavior accelerationBehavior) {
        this.accelerationBehavior = accelerationBehavior;
    }

    public void brake() {
        System.out.print("Breaking... ");
        this.brakingBehavior.brake();
    }

    public void accelerate() {
        System.out.print("Accelerating... ");
        this.accelerationBehavior.accelerate();
    }
}
