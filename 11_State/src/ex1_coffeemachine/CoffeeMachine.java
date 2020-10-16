package ex1_coffeemachine;

import ex1_coffeemachine.states.*;

import java.security.SecureRandom;
import java.util.Random;

public class CoffeeMachine {
    State turnedOffState;
    State idleState;
    State insertingCoinsState;
    State makeCoffeeState;
    State serviceNeededState;

    State userChooseState;
    State state;

    int coins = 0;
    int lastCoin = 0;
    int price = 10;
    int cups = 100;
    int coffee = 100;
    boolean sensorJammed = false;

    Random random;

    public CoffeeMachine() {
        turnedOffState = new TurnedOffState(this);
        idleState = new IdleState(this);
        insertingCoinsState = new InsertingCoinsState(this);
        makeCoffeeState = new MakeCoffeeState(this);
        serviceNeededState = new ServiceNeededState(this);
        userChooseState = new UserChooseState(this);
        state = turnedOffState;
        random = new Random();
    }

    public void powerUp() {
        state.powerUp();
    }

    public void pushButton() {
        coins = 0; // removing user's money
        state.buttonPushed();
    }

    public void brew() {
        sensorJammed = random.nextBoolean(); // 50 - 50 chance that sensor is jammed

        if(coffee > 20
            && cups > 1
            && !sensorJammed) {
            coffee -= 20; // removing 20 grains of coffee
            cups -= 1; // removing one cup
            System.out.println("Coffee brewed.");
        } else {
            state.noCupsOrNoCoffeeOrSensorJammed();
        }
    }

    public void removeCup() {
        state.cupRemoved();
    }

    public void insertCoin(int coins) {
        state.insertCoin(coins);
    }

    public void returnCoin() {
        state.returnCoin();
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getLastCoin() {
        return lastCoin;
    }

    public void setLastCoin(int lastCoin) {
        this.lastCoin = lastCoin;
    }

    public void service() {
        this.cups = 100;
        this.coffee = 100;
        this.sensorJammed = false;
    }

    public int getPrice() {
        return price;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getTurnedOffState() {
        return turnedOffState;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getInsertingCoinsState() {
        return insertingCoinsState;
    }

    public State getMakeCoffeeState() {
        return makeCoffeeState;
    }

    public State getServiceNeededState() {
        return serviceNeededState;
    }

    public State getUserChooseState() {
        return userChooseState;
    }
}
