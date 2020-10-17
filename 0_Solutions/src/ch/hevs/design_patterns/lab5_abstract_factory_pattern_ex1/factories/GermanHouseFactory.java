package ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.factories;

import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.doors.Door;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.doors.LargeDoor;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.walls.GlassWall;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.walls.Wall;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.windows.Window;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.windows.WindowToTheFloor;

/**
 *
 * @author scz
 */
public class GermanHouseFactory implements HouseFactory {

    public Wall createWall() {
        return new GlassWall();
    }

    public Door createDoor() {
        return new LargeDoor();
    }

    public Window createWindow() {
        return new WindowToTheFloor();
    }

}
