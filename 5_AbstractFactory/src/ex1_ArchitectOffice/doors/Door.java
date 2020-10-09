package ex1_ArchitectOffice.doors;

import ex1_ArchitectOffice.wall.Wall;

public abstract class Door {
    String name;
    int price;
    private Wall wall;

    public int getPrice() {
        return price;
    }

    public void buildOnWall(Wall w) {
        this.wall = w;
    }
}
