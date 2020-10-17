package ch.hevs.design_patterns.lab4_factory_method_pattern_ex2.house;


import ch.hevs.design_patterns.lab4_factory_method_pattern_ex2.wall.Wall;

/**
 * Lab 4
 * @author scz
 */
public abstract class House {
    
    protected String name = "";
    protected Wall southWall;
    protected Wall northWall;
    protected Wall westWall;
    protected Wall eastWall;
            
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
    }

    public void calculatePrice() {
        System.out.println("Total price of " + this.name + " is " + getHousePrice());
    }

    private int getHousePrice() {
        return southWall.getPrice() + westWall.getPrice() + northWall.getPrice() + eastWall.getPrice();
    }

    protected abstract Wall createWall();

}
