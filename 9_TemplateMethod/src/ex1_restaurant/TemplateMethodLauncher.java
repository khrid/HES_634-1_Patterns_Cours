package ex1_restaurant;

import ex1_restaurant.*;
import ex1_restaurant.abstractclass.*;
import ex1_restaurant.concreteclass.*;

/**
 * You need to implement an application to prepare a dinner in a restaurant.
 * The process always follows the same steps:
 * - serve water
 * - prepare vegetables
 * - prepare main menu
 * - prepare cheese
 * - prepare dessert
 * - prepare coffee
 * - clean table
 * Serving the water and cleaning the table are always the same. However,
 * the other steps are different for each restaurant.
 */

public class TemplateMethodLauncher {
    public static void main(String[] args) {
        AbstractRestaurant leFrenchie = new FrenchRestaurant();
        AbstractRestaurant mamaMia = new ItalianRestaurant();

        leFrenchie.prepareDinner();
        mamaMia.prepareDinner();
    }
}
