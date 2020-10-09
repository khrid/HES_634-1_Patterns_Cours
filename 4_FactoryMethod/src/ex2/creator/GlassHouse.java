package ex2.creator;

import ex2.product.GlassWall;
import ex2.product.Wall;

public class GlassHouse extends House{

    public GlassHouse() {
        name = "Glass House";
    }

    @Override
    Wall createWall() {
        return new GlassWall();
    }
}
