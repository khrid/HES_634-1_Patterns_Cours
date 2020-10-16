package ex1_coffeemachine.states;

import ex1_coffeemachine.CoffeeMachine;

public class TurnedOffState implements State {
    CoffeeMachine coffeeMachine;
    public TurnedOffState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin(int coins) {
        System.out.println("Coffee machine is not powered");
    }

    @Override
    public void enterRightAmount() {
        System.out.println("Coffee machine is not powered");
    }

    @Override
    public void returnCoin() {
        System.out.println("Coffee machine is not powered");
    }

    @Override
    public void buttonPushed() {
        System.out.println("Coffee machine is not powered");
    }

    @Override
    public void noCupsOrNoCoffeeOrSensorJammed() {
        System.out.println("Coffee machine is not powered");
    }

    @Override
    public void noCoffee() {
        System.out.println("Coffee machine is not powered");
    }

    @Override
    public void jamSensor() {
        System.out.println("Coffee machine is not powered");
    }

    @Override
    public void cupRemoved() {
        System.out.println("Coffee machine is not powered");
    }

    @Override
    public void buttonReset() {
        System.out.println("Coffee machine is not powered");
    }

    @Override
    public void powerUp() {
        System.out.println("Powering up the coffee machine...");
        coffeeMachine.setState(coffeeMachine.getIdleState());
    }
}
