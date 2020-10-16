package ex1_coffeemachine.states;

import ex1_coffeemachine.CoffeeMachine;

public class ServiceNeededState implements State {
    CoffeeMachine coffeeMachine;
    public ServiceNeededState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin(int coins) {
        System.out.println("Service needed...");
    }

    @Override
    public void enterRightAmount() {
        System.out.println("Service needed...");
    }

    @Override
    public void returnCoin() {
        System.out.println("Service needed...");
    }

    @Override
    public void buttonPushed() {
        System.out.println("Service needed...");
    }

    @Override
    public void noCupsOrNoCoffeeOrSensorJammed() {
        System.out.println("Service already needed...");
    }

    @Override
    public void noCoffee() {

    }

    @Override
    public void jamSensor() {

    }

    @Override
    public void cupRemoved() {
        System.out.println("No cup to remove.");
    }

    @Override
    public void buttonReset() {
        System.out.println("Resetting machine");
        coffeeMachine.service();
        coffeeMachine.setState(coffeeMachine.getIdleState());
    }

    @Override
    public void powerUp() {
        System.out.println("Coffee machine already powered up");
    }
}
