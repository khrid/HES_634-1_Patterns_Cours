package ch.hevs.design_patterns.lab3_decorator_pattern_ex2.component;


public class Zermatt extends Stay {
	
	private int cost = 500;
	
	
	public Zermatt() {
		description = "Zermatt";
	}

	@Override
	public int getCost() {
		return cost;
	}

}
