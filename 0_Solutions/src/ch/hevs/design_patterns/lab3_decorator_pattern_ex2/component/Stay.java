package ch.hevs.design_patterns.lab3_decorator_pattern_ex2.component;


public abstract class Stay {

	protected String description;
	
	public Stay() {
	}

	public String getDescription() {
		return description;
	}

	public abstract int getCost();

}
