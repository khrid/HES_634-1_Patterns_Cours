package ex1.creator;

import ex1.product.*;

public class MinivanCreator extends CarCreator{
    @Override
    public Car createCar(String color) {
        return new Minivan(color);
    }
}
