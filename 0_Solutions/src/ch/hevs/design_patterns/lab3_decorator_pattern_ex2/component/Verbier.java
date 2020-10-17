package ch.hevs.design_patterns.lab3_decorator_pattern_ex2.component;

public class Verbier extends Stay {

	private int cost = 400;

	public Verbier() {

		description = "Verbier";
	}

	@Override
	public int getCost() {
		return cost;
	}

}
