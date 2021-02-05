package day47_Abstraction.ShapeTask;

public class Rectangle extends Shape{
    public double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    public double area(){
        return  width *length;
    }

    public double perimeter(){
        return 2 * (width + length);
    }
}
