package ch.hevs.design_patterns.lab4_factory_method_pattern_ex2;


import ch.hevs.design_patterns.lab4_factory_method_pattern_ex2.house.BricksHouse;
import ch.hevs.design_patterns.lab4_factory_method_pattern_ex2.house.GlassHouse;
import ch.hevs.design_patterns.lab4_factory_method_pattern_ex2.house.House;
import ch.hevs.design_patterns.lab4_factory_method_pattern_ex2.house.WoodHouse;

/**
 * Lab 4
 * @author egs
 */
public class ArchitectOffice {
    public static void main(String[] args) {
        House house1 = new GlassHouse();
        house1.buildHouse();
        house1.calculatePrice();

        House house2 = new BricksHouse();
        house2.buildHouse();
        house2.calculatePrice();

        House house3 = new WoodHouse();
        house3.buildHouse();
        house3.calculatePrice();
    }
}
