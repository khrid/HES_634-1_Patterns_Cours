package ch.hevs.design_patterns.lab11_state_pattern_ex1.context;

import ch.hevs.design_patterns.lab11_state_pattern_ex1.state.*;

/**
 * Lab 11
 * @author scz
 */
public class CoffeeMachine {

    private double coinValue = 0.0;
    private double coffeePrice = 2.2;
    private State insertingCoinsState;
    private State serviceNeededState;
    private State makeCoffeeState;
    private State userChooseState;
    private State idleState;
    private State state = idleState;

    public CoffeeMachine() {
        insertingCoinsState = new StateInsertingCoins(this);
        idleState = new StateIdle(this);
        serviceNeededState = new StateServiceNeeded(this);
        makeCoffeeState = new StateMakeCoffee(this);
        userChooseState = new StateUserChoose(this);
        this.setState(idleState);
    }

    public void coinInserted(double coinValue) {
        this.coinValue = coinValue;
        state.coinInserted();
    }

    public void buttonPushed() {
        state.buttonPushed();
    }

    public void coinReturn() {
        state.coinReturn();
    }

    public void cupRemoved() {
        state.cupRemoved();
    }

    public void problemDetected() {
        state.problemDetected();
    }

    public double getCoinValue() {
        return coinValue;
    }

    public void setCoinValue(int coinValue) {
        this.coinValue = coinValue;
    }

    public double getCoffeePrice() {
        return coffeePrice;
    }

    public State getInsertingCoinsState() {
        return insertingCoinsState;
    }

    public void setInsertingCoinsState(State insertingCoinsState) {
        this.insertingCoinsState = insertingCoinsState;
    }

    public State getServiceNeededState() {
        return serviceNeededState;
    }

    public void setServiceNeededState(State serviceNeededState) {
        this.serviceNeededState = serviceNeededState;
    }

    public State getMakeCoffeeState() {
        return makeCoffeeState;
    }

    public void setMakeCoffeeState(State makeCoffeeState) {
        this.makeCoffeeState = makeCoffeeState;
    }

    public State getUserChooseState() {
        return userChooseState;
    }

    public void setUserChooseState(State userChooseState) {
        this.userChooseState = userChooseState;
    }

    public State getIdleState() {
        return idleState;
    }

    public void setIdleState(State idleState) {
        this.idleState = idleState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
