package ex1_restaurant.concreteclass;

import ex1_restaurant.abstractclass.AbstractRestaurant;

public class FrenchRestaurant extends AbstractRestaurant {
    @Override
    public void prepareVegetables() {
        System.out.println("Cutting carrots...");
    }

    @Override
    public void prepareMainMenu() {
        System.out.println("Hunting snails...");
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing the camembert...");
    }

    @Override
    public void prepareDessert() {
        System.out.println("Burning the crème brulée...");
    }

    @Override
    public void prepareCoffee() {
        System.out.println("Serving a big cup of coffee...");
    }
}
