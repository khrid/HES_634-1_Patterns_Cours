package ex1.decorator;

import ex1.product.Car;

public class ColorDecorator extends FeatureDecorator {
    Car car;
    public ColorDecorator(Car car) {
        this.car = car;
    }


    @Override
    public int cost() {
        return 250 + car.cost();
    }

    @Override
    public int securityLevel() {
        return 0 + car.securityLevel();
    }

    @Override
    public String getDescription() {
        return car.getDescription()+", Color";
    }
}
