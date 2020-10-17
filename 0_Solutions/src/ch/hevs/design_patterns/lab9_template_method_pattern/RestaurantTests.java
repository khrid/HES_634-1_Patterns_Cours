package ch.hevs.design_patterns.lab9;

import ch.hevs.design_patterns.lab9.template.ItalianRestaurant;
import ch.hevs.design_patterns.lab9.template.Restaurant;
import ch.hevs.design_patterns.lab9.template.SwissRestaurant;

/**
 * Lab 9
 * @author scz
 */
public class RestaurantTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Restaurant ilGolossone = new ItalianRestaurant("Il Golossone - Zürich");
		Restaurant leVieuxChalet = new SwissRestaurant("Le Vieux Chalet - Gruyères");
		ilGolossone.prepareDinner();
		leVieuxChalet.prepareDinner();
	}
}
