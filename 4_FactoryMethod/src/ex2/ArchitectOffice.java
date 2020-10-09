package ex2;

import ex2.creator.*;

public class ArchitectOffice {
    public static void main(String[] args) {
        House house1 = new GlassHouse();
        house1.buildHouse();
        house1.calculatePrice();
        House house2 = new BricksHouse();
        house2.buildHouse();
        house2.calculatePrice();
        House house3 = new WoodHouse();
        house3.buildHouse();
        house3.calculatePrice();
    }
}
