package ex3.shapes;

public class Square implements Shape {
    int length, width;
    public Square(int length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public String getDescription() {
        return "Square, l : "+this.length+", w : "+ this.width;
    }

    @Override
    public void draw() {

    }
}
