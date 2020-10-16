package ex1_coffeemachine.states;

import ex1_coffeemachine.CoffeeMachine;

public class MakeCoffeeState implements State {
    CoffeeMachine coffeeMachine;
    public MakeCoffeeState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin(int coins) {
        System.out.println("Making coffee, can't insert coins");
    }

    @Override
    public void enterRightAmount() {
        System.out.println("Already the right amount of coins");
    }

    @Override
    public void returnCoin() {
        System.out.println("No coin to return");
    }

    @Override
    public void buttonPushed() {
        System.out.println("Button already pushed");
    }

    @Override
    public void noCupsOrNoCoffeeOrSensorJammed() {
        System.out.println("Something went wrong.");
        coffeeMachine.setState(coffeeMachine.getServiceNeededState());
    }

    @Override
    public void noCoffee() {

    }

    @Override
    public void jamSensor() {

    }

    @Override
    public void cupRemoved() {
        System.out.println("Cup removed.");
        coffeeMachine.setState(coffeeMachine.getIdleState());
    }

    @Override
    public void buttonReset() {
        System.out.println("Can't reset machine right now");
    }

    @Override
    public void powerUp() {
        System.out.println("Coffee machine already powered up");
    }
}
