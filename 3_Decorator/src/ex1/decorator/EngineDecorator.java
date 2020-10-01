package ex1.decorator;

import ex1.product.Car;

public class EngineDecorator extends FeatureDecorator {
    Car car;
    public EngineDecorator(Car car) {
        this.car = car;
    }

    @Override
    public int cost() {
        return 1000 + car.cost();
    }

    @Override
    public int securityLevel() {
        return 0 + car.securityLevel();
    }

    @Override
    public String getDescription() {
        return car.getDescription()+", Engine";
    }
}
