package ex2.creator;

import ex2.product.Wall;
import ex2.product.WoodWall;

public class WoodHouse extends House {
    public WoodHouse() {
        name = "Wood House";
    }

    @Override
    Wall createWall() {
        return new WoodWall();
    }
}
