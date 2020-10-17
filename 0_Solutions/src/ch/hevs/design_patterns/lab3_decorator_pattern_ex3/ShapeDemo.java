package ch.hevs.design_patterns.lab3_decorator_pattern_ex3;

import ch.hevs.design_patterns.lab3_decorator_pattern_ex3.component.Circle;
import ch.hevs.design_patterns.lab3_decorator_pattern_ex3.component.Rectangle;
import ch.hevs.design_patterns.lab3_decorator_pattern_ex3.component.Shape;
import ch.hevs.design_patterns.lab3_decorator_pattern_ex3.component.Square;
import ch.hevs.design_patterns.lab3_decorator_pattern_ex3.decorator.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeDemo {

	private static List<Shape> shapes;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		shapes = new ArrayList<Shape>();
		
		Shape shape1 = new Circle(10);
		Shape shape2 = new Square(5);
		Shape shape3 = new Rectangle(9, 3);
		
		shapes.add(shape1);
		shapes.add(shape2);
		shapes.add(shape3);
		
		for(Shape s : shapes) {
			s.draw();
		}
		
		shape1 = new BorderDecorator(shape1, 4);
		shape1 = new ColorDecorator(shape1, "Red");
		shape1 = new TextureDecorator(shape1, "points");
		shape1 = new TextureDecorator(shape1, "lines");
		shapes.add(shape1);
		
		shape2 = new ColorDecorator(shape2, "Green");
		shapes.add(shape2);
		
		shape3 = new BorderDecorator(shape3, 6);
		shapes.add(shape3);
		
		for(Shape s : shapes) {
			s.draw();
		}
	}
}
