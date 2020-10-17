package ch.hevs.design_patterns.lab4_factory_method_pattern_ex2.house;


import ch.hevs.design_patterns.lab4_factory_method_pattern_ex2.wall.BricksWall;
import ch.hevs.design_patterns.lab4_factory_method_pattern_ex2.wall.Wall;

/**
 * Lab 4
 * @author scz
 */
public class BricksHouse extends House {
    
    public BricksHouse() {
        this.name = "Typical dutch house";
    }

    @Override
    protected Wall createWall() {
        return new BricksWall();
    }

}
