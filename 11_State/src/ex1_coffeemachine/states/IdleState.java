package ex1_coffeemachine.states;

import ex1_coffeemachine.CoffeeMachine;

public class IdleState implements State {
    CoffeeMachine coffeeMachine;
    public IdleState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin(int coins) {
        coffeeMachine.setState(coffeeMachine.getInsertingCoinsState());
        coffeeMachine.getInsertingCoinsState().insertCoin(coins);
    }

    @Override
    public void enterRightAmount() {
        System.out.println("");
    }

    @Override
    public void returnCoin() {
        System.out.println("No coin to return");
    }

    @Override
    public void buttonPushed() {
        System.out.println("Please insert coin");
    }

    @Override
    public void noCupsOrNoCoffeeOrSensorJammed() {
        System.out.println("Please insert coin");
    }

    @Override
    public void noCoffee() {
        System.out.println("Please insert coin");
    }

    @Override
    public void jamSensor() {
        System.out.println("Please insert coin");
    }

    @Override
    public void cupRemoved() {
        System.out.println("Please insert coin");
    }

    @Override
    public void buttonReset() {
        System.out.println("Please insert coin");
    }

    @Override
    public void powerUp() {
        System.out.println("Coffee machine already powered up");
    }
}
