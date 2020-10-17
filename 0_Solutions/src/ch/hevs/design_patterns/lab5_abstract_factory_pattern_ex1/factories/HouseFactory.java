package ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.factories;

import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.doors.Door;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.walls.Wall;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.windows.Window;

/**
 * Lab 5
 * @author scz
 */
public interface HouseFactory {

    public Wall createWall();
    public Door createDoor();
    public Window createWindow();

}
