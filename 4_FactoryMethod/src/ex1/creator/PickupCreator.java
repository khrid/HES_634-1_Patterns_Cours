package ex1.creator;

import ex1.product.*;

public class PickupCreator extends CarCreator {
    @Override
    public Car createCar(String color) {
        return new Pickup(color);
    }
}
