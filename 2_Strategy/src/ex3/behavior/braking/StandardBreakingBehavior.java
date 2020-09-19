package ex3.behavior.braking;

public class StandardBreakingBehavior implements BrakingBehavior{
    @Override
    public void brake() {
        System.out.println("Just as I expected");
    }
}
