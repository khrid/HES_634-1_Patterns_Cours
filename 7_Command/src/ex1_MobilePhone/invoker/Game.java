package ex1_MobilePhone.invoker;

import ex1_MobilePhone.command.Command;
import ex1_MobilePhone.command.NoCommand;

import java.util.ArrayList;

public class Game {
    Command[] commands = new Command[5];
    private int lastKey;

    public Game() {
        for (int i = 0; i < 5; i++) {
            commands[0] = new NoCommand();
        }
    }

    public void setCommand(int key, Command command) {
        commands[key] = command;
    }

    public void pushKey(int key) {
        lastKey = key;
        commands[key].execute();
    }

    public void undo() {
        commands[lastKey].execute();
    }
}