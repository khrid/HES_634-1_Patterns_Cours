package ex3.category;

import ex3.behavior.acceleration.*;
import ex3.behavior.braking.*;

public class Convertible extends Car{
    public Convertible() {
        setAccelerationBehavior(new InsaneAccelerationBehavior());
        setBrakingBehavior(new StandardBreakingBehavior());
    }
}
