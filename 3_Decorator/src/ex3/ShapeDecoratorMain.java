package ex3;


import ex3.enums.*;
import ex3.decorator.*;
import ex3.shapes.*;

/**
 * Create an application that allows creating shapes. You have different
 * shapes, such as circles (with specific diameter), rectangles (with specific
 * length and width) and squares (with specific width). You should be able to
 * add new functionalities dynamically to shapes, such as borders (with
 * different thicknesses), textures or colors.
 */

public class ShapeDecoratorMain {

    public static void main(String[] args) {
        Shape thickSquare = new Square(12);
        thickSquare = new ThicknessDecorator(thickSquare, Thickness.thick);
        describeShape(thickSquare);

        Shape thinSquare = new Square(2);
        thinSquare = new ThicknessDecorator(thinSquare, Thickness.thin);
        describeShape(thinSquare);
    }

    static void describeShape(Shape shape) {
        System.out.println(shape.getDescription());
    }
}
