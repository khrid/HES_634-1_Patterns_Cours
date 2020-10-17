package ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.factories;

import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.doors.Door;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.walls.Wall;
import ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex1.windows.Window;

/**
 * Lab 5
 * @author scz
 */
public class House {

    private HouseFactory houseFactory;

    private String name = "";

    private Wall southWall;
    private Wall northWall;
    private Wall westWall;
    private Wall eastWall;
    private Window southWindow;
    private Window westWindow;
    private Door eastDoor;

    public House(String name, HouseFactory houseFactory) {
        this.name = name;
        this.houseFactory = houseFactory;
    }

    public void buildHouse() {
        southWall = createWall();
        northWall = createWall();
        westWall = createWall();
        eastWall = createWall();

        southWall.bindTo(westWall);
        westWall.bindTo(southWall);

        westWall.bindTo(northWall);
        northWall.bindTo(westWall);

        northWall.bindTo(eastWall);
        eastWall.bindTo(northWall);

        eastWall.bindTo(southWall);
        southWall.bindTo(eastWall);

        eastWall.bindTo(southWall);
        southWall.bindTo(eastWall);

        southWindow = createWindow(southWall);
        westWindow = createWindow(westWall);

        eastDoor = createDoor(eastWall);

    }

    public void calculatePrice() {
        System.out.println("Total price of " + this.name + " is " + getHousePrice());
    }

    private int getHousePrice() {
        return southWall.getPrice() 
                + westWall.getPrice()
                + northWall.getPrice()
                + eastWall.getPrice()
                + southWindow.getPrice()
                + westWindow.getPrice()
                + eastDoor.getPrice();
    }

    private Wall createWall() {
        return houseFactory.createWall();
    }

    private Door createDoor(Wall w) {
        Door door = houseFactory.createDoor();
        door.buildOnWall(w);
        return door;
    }

    private Window createWindow(Wall w) {
        Window window = houseFactory.createWindow();
        window.buildOnWall(w);
        return window;
    }

    public HouseFactory getHouseFactory() {
        return houseFactory;
    }

    public void setHouseFactory(HouseFactory houseFactory) {
        this.houseFactory = houseFactory;
    }

}
