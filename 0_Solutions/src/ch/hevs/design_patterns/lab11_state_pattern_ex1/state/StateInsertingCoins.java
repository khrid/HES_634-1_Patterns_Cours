package ch.hevs.design_patterns.lab11_state_pattern_ex1.state;

import ch.hevs.design_patterns.lab11_state_pattern_ex1.context.CoffeeMachine;

/**
 * @author  scz
 */
public class StateInsertingCoins implements State {

    private CoffeeMachine machine;

    public StateInsertingCoins(CoffeeMachine machine) {
        this.machine = machine;
    }

    public void buttonPushed() {
        System.out.println("You have to insert coins.");
    }

    public void coinInserted() {
        System.out.println("Inserting coins... You have now " + machine.getCoinValue() + " CHF.");
        this.rightAmountEntered();
    }

    public void coinReturn() {
        System.out.println("Coins returned.");
        machine.setCoinValue(0);
        machine.setState(machine.getIdleState());
    }

    public void cupRemoved() {
        //No coffee was made...
    }

    public void problemDetected() {
        //No coffee was made
    }

    public void resetButton() {
        System.out.println("Impossible to reset the machine now.");
    }

    public void rightAmountEntered() {
        if (machine.getCoinValue() < machine.getCoffeePrice()) {
            System.out.println("Not enough money !");
        } else {
            System.out.println("Right money amount.");
            machine.setState(machine.getUserChooseState());
            System.out.println("You can choose your coffee.");
        }
    }
}
