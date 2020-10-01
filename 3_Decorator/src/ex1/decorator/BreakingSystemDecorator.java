package ex1.decorator;

import ex1.product.Car;

public class BreakingSystemDecorator extends FeatureDecorator {
    Car car;
    public BreakingSystemDecorator(Car car) {
        this.car = car;
    }


    @Override
    public int cost() {
        return 500 + car.cost();
    }

    @Override
    public int securityLevel() {
        return 1 + car.securityLevel();
    }

    @Override
    public String getDescription() {
        return car.getDescription()+", BreakingSystem";
    }
}
