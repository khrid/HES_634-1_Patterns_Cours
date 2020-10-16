package ex1_coffeemachine.states;

import ex1_coffeemachine.CoffeeMachine;

public interface State {
    void insertCoin(int coins);
    void enterRightAmount();
    void returnCoin();
    void buttonPushed();
    void noCupsOrNoCoffeeOrSensorJammed();
    void noCoffee();
    void jamSensor();
    void cupRemoved();
    void buttonReset();
    void powerUp();
}
