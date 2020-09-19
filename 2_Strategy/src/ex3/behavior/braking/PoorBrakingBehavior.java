package ex3.behavior.braking;

public class PoorBrakingBehavior implements BrakingBehavior{
    @Override
    public void brake() {
        System.out.println("Am I even slowing down?!");
    }
}
