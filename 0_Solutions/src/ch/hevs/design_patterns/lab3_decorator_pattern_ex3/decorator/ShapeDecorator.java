package ch.hevs.design_patterns.lab3_decorator_pattern_ex3.decorator;

import ch.hevs.design_patterns.lab3_decorator_pattern_ex3.component.Shape;

public abstract class ShapeDecorator implements Shape {

	protected Shape shape;
	
	public ShapeDecorator(Shape decoratedShape){
		this.shape = decoratedShape;
	}

	@Override
	abstract public void draw();

}
