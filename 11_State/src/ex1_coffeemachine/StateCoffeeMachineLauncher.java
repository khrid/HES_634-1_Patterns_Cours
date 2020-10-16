package ex1_coffeemachine;

public class StateCoffeeMachineLauncher {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.powerUp();
        coffeeMachine.insertCoin(5);
        coffeeMachine.insertCoin(5);
        coffeeMachine.returnCoin();
        coffeeMachine.insertCoin(5);
        coffeeMachine.pushButton();
        coffeeMachine.removeCup();


        coffeeMachine.insertCoin(5);
        coffeeMachine.insertCoin(5);
        coffeeMachine.returnCoin();
        coffeeMachine.insertCoin(5);
        coffeeMachine.pushButton();
        coffeeMachine.removeCup();
    }
}
