package ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.windows;

import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.walls.Wall;

/**
 * Lab 5
 * @author scz
 */
public abstract class Window {

    protected String name;
    protected int price;
    private Wall wall;

    public void buildOnWall(Wall wall) {
        this.wall = wall;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
