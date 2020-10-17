package ch.hevs.design_patterns.lab3_decorator_pattern_ex1.component;

/**
 * Lab 3
 * @author  scz
 */
public class CarSport extends Car {

    protected static final int SECURITY_LEVEL = 30;
    protected static final int PRICE = 35000;
    
    public CarSport() {
        this.description = "Sport";
    }

    public int getCost() {
        return PRICE;
    }

    public int getSecurityLevel() {
        return SECURITY_LEVEL;
    }
    
}
