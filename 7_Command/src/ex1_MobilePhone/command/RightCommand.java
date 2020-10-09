package ex1_MobilePhone.command;

import ex1_MobilePhone.receiver.Car;

public class RightCommand implements Command {
    Car car;

    public RightCommand(Car car) {
        this.car = car;
    }
    @Override
    public void execute() {
        car.right();
    }

    @Override
    public void undo() {
        car.left();
    }
}
