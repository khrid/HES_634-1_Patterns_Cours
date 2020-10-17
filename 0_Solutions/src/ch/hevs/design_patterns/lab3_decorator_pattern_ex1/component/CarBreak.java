package ch.hevs.design_patterns.lab3_decorator_pattern_ex1.component;

/**
 * Lab 3
 * @author  scz
 */
public class CarBreak extends Car {

    protected static final int SECURITY_LEVEL = 50;
    protected static final int PRICE = 30000;
    
    public CarBreak() {
        this.description = "Break";
    }

    public int getCost() {
        return PRICE;
    }

    public int getSecurityLevel() {
        return SECURITY_LEVEL;
    }
    
}
