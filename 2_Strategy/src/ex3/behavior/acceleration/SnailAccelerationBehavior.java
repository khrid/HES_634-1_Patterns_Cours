package ex3.behavior.acceleration;

public class SnailAccelerationBehavior implements AccelerationBehavior {
    @Override
    public void accelerate() {
        System.out.println("Woah there, not so fast!");
    }
}
