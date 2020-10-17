package ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.walls;

import java.util.ArrayList;

/**
 * Lab 5
 * @author scz
 */
public abstract class Wall {
    protected String name;
    protected int price;
    private ArrayList<Wall> neighbours = new ArrayList<Wall>();;

    
    public void bindTo(Wall w) {
        neighbours.add(w);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
