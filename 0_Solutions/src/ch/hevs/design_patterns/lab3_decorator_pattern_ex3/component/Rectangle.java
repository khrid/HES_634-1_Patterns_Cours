package ch.hevs.design_patterns.lab3_decorator_pattern_ex3.component;

public class Rectangle implements Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public void draw() {
		System.out.println("Shape: Rectangle with length " + length + " and width " + width);
	}

}
