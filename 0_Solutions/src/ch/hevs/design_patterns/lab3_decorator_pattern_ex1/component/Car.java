package ch.hevs.design_patterns.lab3_decorator_pattern_ex1.component;

/**
 * Lab 3
 * @author  scz
 */
public abstract class Car {

    protected String description = "";

    public String getDescription() {
        return this.description;
    }
    
    public abstract int getCost();
    
    public abstract int getSecurityLevel();
}
