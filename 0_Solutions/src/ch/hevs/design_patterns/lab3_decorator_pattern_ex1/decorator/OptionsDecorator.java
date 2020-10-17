package ch.hevs.design_patterns.lab3_decorator_pattern_ex1.decorator;


import ch.hevs.design_patterns.lab3_decorator_pattern_ex1.component.Car;

/**
 * Lab 3
 * @author scz
 */
public abstract class OptionsDecorator extends Car {
       
    public abstract String getDescription();
}
