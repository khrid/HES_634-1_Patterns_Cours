package ex3.behavior.braking;

public class HeavyVehicleBreakingBehavior implements BrakingBehavior{
    @Override
    public void brake() {
        System.out.println("Stopped in 2 seconds!");
    }
}
