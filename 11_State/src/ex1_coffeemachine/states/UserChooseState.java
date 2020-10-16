package ex1_coffeemachine.states;

import ex1_coffeemachine.CoffeeMachine;

public class UserChooseState implements State {
    CoffeeMachine coffeeMachine;
    public UserChooseState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin(int coins) {
        System.out.println("Already the right amount of coins");
    }

    @Override
    public void enterRightAmount() {
        System.out.println("Already the right amount of coins");
    }

    @Override
    public void returnCoin() {
        System.out.println("Returning last coin ("+coffeeMachine.getLastCoin()+")");
        coffeeMachine.setCoins(coffeeMachine.getCoins()-coffeeMachine.getLastCoin());
        coffeeMachine.setLastCoin(0);
        coffeeMachine.setState(coffeeMachine.getIdleState());
    }

    @Override
    public void buttonPushed() {
        System.out.println("Button pushed.");
        coffeeMachine.setState(coffeeMachine.getMakeCoffeeState());
        coffeeMachine.brew();
    }

    @Override
    public void noCupsOrNoCoffeeOrSensorJammed() {
        System.out.println("Please push the button.");
    }

    @Override
    public void noCoffee() {
        System.out.println("Please push the button.");
    }

    @Override
    public void jamSensor() {
        System.out.println("Please push the button.");
    }

    @Override
    public void cupRemoved() {
        System.out.println("Please push the button.");
    }

    @Override
    public void buttonReset() {
        System.out.println("No problem to fix.");
    }

    @Override
    public void powerUp() {System.out.println("Coffee machine already powered up");
    }
}
