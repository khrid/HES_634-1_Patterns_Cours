package ch.hevs.design_patterns.lab9.template;

/**
 * Lab 9
 * @author scz
 */
public class ItalianRestaurant extends Restaurant {

	public ItalianRestaurant(String name) {
		this.name = name;
	}
	
	@Override
	void prepareDessert() {
		System.out.println("Tiramisu.");
	}

	@Override
	void prepareCheese() {
		System.out.println("Adding Parmegiano");
	}

	@Override
	void prepareCoffee() {
		System.out.println("Fine italian espresso");
	}

	@Override
	void prepareMainMenu() {
		System.out.println("Meat and pasta.");
	}

	@Override
	void prepareVegetables() {
		System.out.println("And good zucchini.");
	}

}
