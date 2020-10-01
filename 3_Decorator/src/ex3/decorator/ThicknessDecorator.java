package ex3.decorator;

import ex3.enums.Thickness;
import ex3.shapes.Shape;

public class ThicknessDecorator extends FunctionalityDecorator {

    Shape shape;
    Thickness thickness;

    public ThicknessDecorator(Shape shape, Thickness thickness) {
        this.shape = shape;
        this.thickness = thickness;
    }

    @Override
    public String getDescription() {
        return shape.getDescription()+", thickness : "+this.thickness;
    }

    @Override
    public void draw() {

    }
}