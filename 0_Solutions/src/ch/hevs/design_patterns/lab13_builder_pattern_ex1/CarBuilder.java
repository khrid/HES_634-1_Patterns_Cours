package ch.hevs.design_patterns.lab13_builder_pattern_ex1;

public interface CarBuilder {
	
	public void buildPower();
	public void buildEngine();
	public void buildBreaks();
	public void buildSeats();
	public void buildWindows();
	public void buildFuelType();
	public Car getCar();
}
