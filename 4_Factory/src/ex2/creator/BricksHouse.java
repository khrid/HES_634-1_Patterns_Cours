package ex2.creator;

import ex2.product.BricksWall;
import ex2.product.GlassWall;
import ex2.product.Wall;

public class BricksHouse extends House{

    public BricksHouse() {
        name = "Bricks House";
    }

    @Override
    Wall createWall() {
        return new BricksWall();
    }
}
