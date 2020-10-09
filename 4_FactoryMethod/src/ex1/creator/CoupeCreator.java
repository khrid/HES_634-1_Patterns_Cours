package ex1.creator;

import ex1.product.*;

public class CoupeCreator extends CarCreator{
    @Override
    public Car createCar(String color) {
        return new Coupe(color);
    }
}
