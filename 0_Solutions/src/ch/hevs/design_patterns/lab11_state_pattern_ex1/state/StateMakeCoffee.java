package ch.hevs.design_patterns.lab11_state_pattern_ex1.state;

import ch.hevs.design_patterns.lab11_state_pattern_ex1.context.CoffeeMachine;

/**
 * Lab 11
 * @author scz
 */
public class StateMakeCoffee implements State {

    private CoffeeMachine machine;

    public StateMakeCoffee(CoffeeMachine machine) {
        this.machine = machine;
    }

    public void buttonPushed() {
        System.out.println("Button already pushed. The machine is making your coffee.");
    }

    public void coinInserted() {
        System.out.println("Please wait. The machine is making your coffee.");
    }

    public void coinReturn() {
        System.out.println("The machine is making your coffee.");
    }

    public void cupRemoved() {
        System.out.println("Thank You. See you next time.");
        machine.setState(machine.getIdleState());
    }

    public void problemDetected() {
        System.out.println("Problem during making the coffee. Service needed.");
        machine.setState(machine.getServiceNeededState());
    }

    public void resetButton() {
        System.out.println("Impossible to reset the machine now.");
    }

    public void rightAmountEntered() {
        System.out.println("The machine is making your coffee.");
    }
}
