package ex1_coffeemachine.states;

import ex1_coffeemachine.CoffeeMachine;

public class InsertingCoinsState implements State {
    CoffeeMachine coffeeMachine;

    public InsertingCoinsState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin(int coins) {
        coffeeMachine.setCoins(coffeeMachine.getCoins() + coins);
        coffeeMachine.setLastCoin(coins);
        System.out.println("Inserted coins : " + coins + ", total " + coffeeMachine.getCoins() + ". Need " + coffeeMachine.getPrice() + " for a coffee. ");
        if (coffeeMachine.getCoins() >= coffeeMachine.getPrice()) {
            System.out.println("Right amount of coins.");
            coffeeMachine.setState(coffeeMachine.getUserChooseState());
        }
    }

    @Override
    public void enterRightAmount() {

    }

    @Override
    public void returnCoin() {
        System.out.println("Returning last coin (" + coffeeMachine.getLastCoin() + ")");
        coffeeMachine.setCoins(coffeeMachine.getCoins() - coffeeMachine.getLastCoin());
        coffeeMachine.setLastCoin(0);
        coffeeMachine.setState(coffeeMachine.getIdleState());
    }

    @Override
    public void buttonPushed() {

    }

    @Override
    public void noCupsOrNoCoffeeOrSensorJammed() {

    }

    @Override
    public void noCoffee() {

    }

    @Override
    public void jamSensor() {

    }

    @Override
    public void cupRemoved() {

    }

    @Override
    public void buttonReset() {

    }

    @Override
    public void powerUp() {
        System.out.println("Coffee machine already powered up");
    }
}
