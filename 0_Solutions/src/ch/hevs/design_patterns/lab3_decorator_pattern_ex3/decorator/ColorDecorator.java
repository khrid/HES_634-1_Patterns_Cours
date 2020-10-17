package ch.hevs.design_patterns.lab3_decorator_pattern_ex3.decorator;

import ch.hevs.design_patterns.lab3_decorator_pattern_ex3.component.Shape;

public class ColorDecorator extends ShapeDecorator {

	private String color;
	
	public ColorDecorator(Shape decoratedShape, String color) {
		super(decoratedShape);
		this.color = color;
	}

	@Override
	public void draw() {
		shape.draw();	       
		setColor(shape);
	}

	private void setColor(Shape shape){
		System.out.println(" Color: " + color);
	}

}
