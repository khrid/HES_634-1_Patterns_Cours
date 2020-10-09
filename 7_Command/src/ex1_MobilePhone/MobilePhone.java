package ex1_MobilePhone;

import ex1_MobilePhone.command.BackwardCommand;
import ex1_MobilePhone.command.ForwardCommand;
import ex1_MobilePhone.command.LeftCommand;
import ex1_MobilePhone.command.RightCommand;
import ex1_MobilePhone.invoker.Game;
import ex1_MobilePhone.receiver.Car;

/**
 *  application typique : création de menu
 *
 */

public class MobilePhone {
    public static void main(String[] args) {
        Game game = new Game();
// TODO SETUP
        Car car = new Car();
        ForwardCommand forwardCommand = new ForwardCommand(car);
        BackwardCommand backwardCommand = new BackwardCommand(car);
        LeftCommand leftCommand = new LeftCommand(car);
        RightCommand rightCommand = new RightCommand(car);

        game.setCommand(1, forwardCommand);
        game.setCommand(2, backwardCommand);
        game.setCommand(3, leftCommand);
        game.setCommand(4, rightCommand);

        game.pushKey(2);
        game.pushKey(2);
        game.pushKey(3);
        game.pushKey(2);
        game.pushKey(0);
        game.pushKey(1);
        game.undo();
    }
}
