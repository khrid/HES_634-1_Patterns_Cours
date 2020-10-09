package ex1_MobilePhone.command;

import ex1_MobilePhone.receiver.Car;

public class ForwardCommand implements Command {
    Car car;

    public ForwardCommand(Car car) {
        this.car = car;
    }
    @Override
    public void execute() {
        car.forward();
    }

    @Override
    public void undo() {
        car.backward();
    }
}
