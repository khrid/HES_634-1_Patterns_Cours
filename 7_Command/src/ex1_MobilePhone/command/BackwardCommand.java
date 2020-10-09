package ex1_MobilePhone.command;

import ex1_MobilePhone.receiver.Car;

public class BackwardCommand implements Command {
    Car car;

    public BackwardCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.backward();
    }

    @Override
    public void undo() {
        car.forward();
    }
}
