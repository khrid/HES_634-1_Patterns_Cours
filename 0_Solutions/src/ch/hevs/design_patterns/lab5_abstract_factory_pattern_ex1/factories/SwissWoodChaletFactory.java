package ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.factories;

import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.doors.Door;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.doors.ThinDoor;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.walls.Wall;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.walls.WoodWall;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.windows.Window;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.windows.WindowWithStructure;

/**
 * Lab 5
 * @author scz
 */
public class SwissWoodChaletFactory implements HouseFactory {

    public Wall createWall() {
        return new WoodWall();
    }

    public Door createDoor() {
        return new ThinDoor();
    }

    public Window createWindow() {
        return new WindowWithStructure();
    }

}
