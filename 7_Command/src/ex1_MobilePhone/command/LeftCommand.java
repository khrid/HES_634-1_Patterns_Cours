package ex1_MobilePhone.command;

import ex1_MobilePhone.receiver.Car;

public class LeftCommand implements Command {
    Car car;

    public LeftCommand(Car car) {
        this.car = car;
    }
    @Override
    public void execute() {
        car.left();
    }

    @Override
    public void undo() {
        car.right();
    }
}
