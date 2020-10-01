package ex1.decorator;

import ex1.product.Car;

public class AntiSlidingSystemDecorator extends FeatureDecorator {
    Car car;
    public AntiSlidingSystemDecorator(Car car) {
        this.car = car;
    }


    @Override
    public int cost() {
        return 750 + car.cost();
    }

    @Override
    public int securityLevel() {
        return 1 + car.securityLevel();
    }

    @Override
    public String getDescription() {
        return car.getDescription()+", AntiSlidingSystem";
    }
}
