package ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1;

import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.factories.DutchHouseFactory;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.factories.GermanHouseFactory;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.factories.House;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.factories.SwissWoodChaletFactory;

/**
 * Lab 5
 * @author scz
 */
public class ArchitectOffice {

    public static void main(String[] args) {
        House house1 = new House("Moder German house",
                new GermanHouseFactory());
        house1.buildHouse();
        house1.calculatePrice();

        House house2 = new House("Typical dutch house",
                new DutchHouseFactory());
        house2.buildHouse();
        house2.calculatePrice();

        House house3 = new House("Swiss wood chalet",
                new SwissWoodChaletFactory());
        house3.buildHouse();
        house3.calculatePrice();
    }
}
