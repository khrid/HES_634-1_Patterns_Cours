package ex1_restaurant.concreteclass;

import ex1_restaurant.abstractclass.AbstractRestaurant;

public class ItalianRestaurant extends AbstractRestaurant {
    @Override
    public void prepareVegetables() {
        System.out.println("Cutting the tomatoes...");
    }

    @Override
    public void prepareMainMenu() {
        System.out.println("Boiling water...");
        System.out.println("Adding pasta...");
        System.out.println("Waiting 8 minutes...");
        System.out.println("Removing water...");
    }

    @Override
    public void prepareCheese() {
        System.out.println("Serving some grana padano...");
    }

    @Override
    public void prepareDessert() {
        System.out.println("Preparing the pana cotta");
    }

    @Override
    public void prepareCoffee() {
        System.out.println("Serving the espresso");
    }
}
