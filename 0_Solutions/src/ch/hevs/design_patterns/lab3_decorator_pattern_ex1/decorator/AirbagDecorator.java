package ch.hevs.design_patterns.lab3_decorator_pattern_ex1.decorator;


import ch.hevs.design_patterns.lab3_decorator_pattern_ex1.component.Car;

/**
 * Lab 3
 * @author  scz
 */
public class AirbagDecorator extends OptionsDecorator {

    protected static final String DESCRIPTION = "airbag(s)";
    protected static final int SECURITY_LEVEL = 4;
    protected static final int PRICE = 1790;

    private Car car = null;
    
    public AirbagDecorator(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return this.car.getDescription() + ", " + DESCRIPTION;
    }

    public int getCost() {
        return this.car.getCost() + PRICE;
    }

    public int getSecurityLevel() {
        return this.car.getSecurityLevel() + SECURITY_LEVEL;
    }
    
}
