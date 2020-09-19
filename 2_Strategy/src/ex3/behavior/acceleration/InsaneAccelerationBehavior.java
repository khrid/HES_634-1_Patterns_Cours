package ex3.behavior.acceleration;

public class InsaneAccelerationBehavior implements AccelerationBehavior {
    @Override
    public void accelerate() {
        System.out.println("Going over 88mph!");
    }
}
