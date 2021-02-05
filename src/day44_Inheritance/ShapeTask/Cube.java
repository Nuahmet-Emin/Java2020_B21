package day44_Inheritance.ShapeTask;

public class Cube extends Shape {

    public double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;

    }

    @Override
    public double calcArea() {
        return new Square(side).calcArea() * 6;
    }

    @Override
    public double calcPerimeter() {
        return side * 12;
    }
}
