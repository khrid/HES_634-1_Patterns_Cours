package ch.hevs.design_patterns.lab11_state_pattern_ex1.state;

import ch.hevs.design_patterns.lab11_state_pattern_ex1.context.CoffeeMachine;

/**
 * Lab 11
 * @author scz
 */
public class StateServiceNeeded implements State {

    private CoffeeMachine machine;

    public StateServiceNeeded(CoffeeMachine machine) {
        this.machine = machine;
    }

    public void buttonPushed() {
        System.out.println("Service required");
    }

    public void coinInserted() {
        System.out.println("Service required");
    }

    public void coinReturn() {
        System.out.println("Service required");
    }

    public void cupRemoved() {
        //No coffee was made
    }

    public void problemDetected() {
        //Problem is already detected
    }

    public void resetButton() {
        System.out.println("Resetting the machine.");
        machine.setState(machine.getIdleState());
    }

    public void rightAmountEntered() {
        System.out.println("Service required");
    }
}
