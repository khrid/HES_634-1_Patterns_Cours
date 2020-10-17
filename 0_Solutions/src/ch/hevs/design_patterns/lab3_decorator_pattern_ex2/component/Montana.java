package ch.hevs.design_patterns.lab3_decorator_pattern_ex2.component;

public class Montana extends Stay {

	private int cost = 600;

	public Montana() {

		description = "Montana";
	}

	@Override
	public int getCost() {
		return cost;
	}

}
