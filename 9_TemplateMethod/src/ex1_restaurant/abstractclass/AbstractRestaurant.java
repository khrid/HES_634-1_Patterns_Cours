package ex1_restaurant.abstractclass;

public abstract class AbstractRestaurant {
    public final void prepareDinner() {
        serveWater();
        prepareVegetables();
        prepareMainMenu();
        prepareCheese();
        prepareDessert();
        prepareCoffee();
        cleanTable();
    }

    public void serveWater() {
        System.out.println("Serving water from the bottle...");
    }

    public abstract void prepareVegetables();

    public abstract void prepareMainMenu();

    public abstract void prepareCheese();

    public abstract void prepareDessert();

    public abstract void prepareCoffee();

    public void cleanTable() {
        System.out.println("Pschit pschit on the table...");
    }
}
