package ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.factories;

import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.doors.Door;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.doors.LargeDoor;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.walls.BricksWall;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.walls.Wall;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.windows.Window;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.windows.WindowToTheFloor;

/**
 * Lab 5
 * @author scz
 */
public class DutchHouseFactory implements HouseFactory {

    public Wall createWall() {
        return new BricksWall();
    }

    public Door createDoor() {
        return new LargeDoor();
    }

    public Window createWindow() {
        return new WindowToTheFloor();
    }

}
