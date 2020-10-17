package ch.hevs.design_patterns.lab4_factory_method_pattern_ex2.house;


import ch.hevs.design_patterns.lab4_factory_method_pattern_ex2.wall.Wall;
import ch.hevs.design_patterns.lab4_factory_method_pattern_ex2.wall.WoodWall;

/**
 * Lab 4
 * @author scz
 */
public class WoodHouse extends House {
    
    public WoodHouse() {
        this.name = "Swiss wood chalet";
    }

    @Override
    protected Wall createWall() {
        return new WoodWall();
    }
    
}
