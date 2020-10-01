package ex2.creator;

import ex2.product.Wall;

public abstract class House {
    String name = "";
    Wall[] walls = new Wall[4];

    public void buildHouse() {
        for (int i = 0; i < walls.length; i++) {
            walls[i] = createWall();
        }
    }

    public void calculatePrice() {
        int price = 0;
        for (int i = 0; i < walls.length; i++) {
            price += walls[i].price;
        }
        System.out.println("House \"" + this.name + "\" price is " + price);
    }

    abstract Wall createWall();

}
