package ex3.shapes;

public class Circle implements Shape {
    double diameter;
    public Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String getDescription() {
        return "Circle";
    }

    @Override
    public void draw() {
    }
}
